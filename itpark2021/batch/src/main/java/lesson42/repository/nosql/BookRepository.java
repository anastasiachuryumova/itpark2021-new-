package lesson42.repository.nosql;

import lesson42.model.nosql.Book;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface BookRepository extends MongoRepository<Book, String> {
}
