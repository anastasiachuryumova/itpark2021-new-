package lesson42.repository.nosql;

import lesson42.model.nosql.Genre;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface GenreRepository extends MongoRepository<Genre, String> {
}
