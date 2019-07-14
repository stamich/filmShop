package pl.edu.ath.filmshop.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import pl.edu.ath.filmshop.model.Film;

import java.util.List;

public interface FilmRepository extends MongoRepository<Film, String> {

    @Query("{'_id': ?0}")
    Film findOneById(String id);

    @Query("{'availability' : ?0}")
    List<Film> findByAvailability(Boolean availability);

    @Query("{'title' : ?0}")
    Film findByTitle(String title);
}
