package lesson41.repository;

import lesson41.model.Genre;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface GenreRepository extends ReactiveMongoRepository<Genre, String> {
}
