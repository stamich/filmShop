package pl.edu.ath.filmshop.serrvice;

import org.springframework.beans.factory.annotation.Autowired;
import pl.edu.ath.filmshop.model.Film;
import pl.edu.ath.filmshop.repository.FilmRepository;

import java.util.List;

public class FilmServiceImpl implements FilmService {

    @Autowired
    private FilmRepository repository;

    @Override
    public Film findOneById(String id) {
        return repository.findOneById(id);
    }

    @Override
    public List<Film> findByAvailability(Boolean availability) {
        return repository.findByAvailability(availability);
    }

    @Override
    public Film findByTitle(String title) {
        return repository.findByTitle(title);
    }

    @Override
    public void save(Film film) {
        repository.save(film);
    }

    @Override
    public void update(Film film) {
        Film entity = repository.findOneById(film.getId());
        if (entity != null){
            entity.setAvailability(film.getAvailability());
            entity.setTitle(film.getTitle());
            entity.setPrice(film.getPrice());
        }
    }

    @Override
    public void delete(Film film) {
        repository.delete(film);
    }

    @Override
    public void deleteById(String id) {
        repository.deleteById(id);
    }

    @Override
    public List<Film> findAll() {
        return repository.findAll();
    }
}
