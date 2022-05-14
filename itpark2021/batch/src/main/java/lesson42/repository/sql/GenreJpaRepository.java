package lesson42.repository.sql;

import lesson42.model.sql.Genre;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GenreJpaRepository extends JpaRepository<Genre, String> {
}
