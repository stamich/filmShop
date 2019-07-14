package pl.edu.ath.filmshop.serrvice;

import pl.edu.ath.filmshop.model.Film;

import java.util.List;

public interface FilmService {

    Film findOneById(String id);
    List<Film> findByAvailability(Boolean availability);
    Film findByTitle(String title);
    void save(Film film);
    void update(Film film);
    void delete(Film film);
    void deleteById(String id);
    List<Film> findAll();
}
