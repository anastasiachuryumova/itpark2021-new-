package lesson42.mapper;

import javax.annotation.processing.Generated;
import lesson42.model.nosql.Genre;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-05-12T13:25:07+0300",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 17.0.1 (Oracle Corporation)"
)
@Component
public class GenreMapperImpl implements GenreMapper {

    @Override
    public Genre toDocumentEntity(lesson42.model.sql.Genre entity) {
        if ( entity == null ) {
            return null;
        }

        Genre genre = new Genre();

        genre.setCode( entity.getCode() );
        genre.setName( entity.getName() );

        return genre;
    }

    @Override
    public lesson42.model.sql.Genre toEntity(Genre entity) {
        if ( entity == null ) {
            return null;
        }

        lesson42.model.sql.Genre genre = new lesson42.model.sql.Genre();

        genre.setCode( entity.getCode() );
        genre.setName( entity.getName() );

        return genre;
    }
}
