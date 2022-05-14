package lesson42.repository.nosql;

import lesson42.model.nosql.Author;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface AuthorRepository extends MongoRepository<Author, String> {
}
