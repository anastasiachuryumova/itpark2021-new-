package lesson42.mapper;

import javax.annotation.processing.Generated;
import lesson42.model.sql.Author;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-05-12T13:25:07+0300",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 17.0.1 (Oracle Corporation)"
)
@Component
public class AuthorMapperImpl implements AuthorMapper {

    @Override
    public lesson42.model.nosql.Author toDocumentEntity(Author entity) {
        if ( entity == null ) {
            return null;
        }

        lesson42.model.nosql.Author author = new lesson42.model.nosql.Author();

        author.setId( String.valueOf( entity.getId() ) );
        author.setFirstName( entity.getFirstName() );
        author.setLastName( entity.getLastName() );

        return author;
    }

    @Override
    public Author toEntity(lesson42.model.nosql.Author entity) {
        if ( entity == null ) {
            return null;
        }

        Author author = new Author();

        if ( entity.getId() != null ) {
            author.setId( Long.parseLong( entity.getId() ) );
        }
        author.setFirstName( entity.getFirstName() );
        author.setLastName( entity.getLastName() );

        return author;
    }
}
