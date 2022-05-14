package lesson42.repository.nosql;

import lesson42.model.nosql.Comment;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CommentRepository extends MongoRepository<Comment, String> {
}
