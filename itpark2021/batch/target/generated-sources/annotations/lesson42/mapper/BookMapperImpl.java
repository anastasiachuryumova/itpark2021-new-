package lesson42.mapper;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import lesson42.model.nosql.Book;
import lesson42.model.nosql.Comment;
import lesson42.model.nosql.Genre;
import lesson42.model.sql.Author;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-05-12T13:25:07+0300",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 17.0.1 (Oracle Corporation)"
)
@Component
public class BookMapperImpl implements BookMapper {

    @Override
    public lesson42.model.sql.Book toEntity(Book entity) {
        if ( entity == null ) {
            return null;
        }

        lesson42.model.sql.Book book = new lesson42.model.sql.Book();

        if ( entity.getId() != null ) {
            book.setId( Long.parseLong( entity.getId() ) );
        }
        book.setIsbn( entity.getIsbn() );
        book.setName( entity.getName() );
        book.setAuthor( authorToAuthor( entity.getAuthor() ) );
        book.setGenre( genreToGenre( entity.getGenre() ) );
        book.setComments( commentListToCommentList( entity.getComments() ) );

        return book;
    }

    @Override
    public Book toDocumentEntity(lesson42.model.sql.Book book) {
        if ( book == null ) {
            return null;
        }

        Book book1 = new Book();

        book1.setId( String.valueOf( book.getId() ) );
        book1.setIsbn( book.getIsbn() );
        book1.setName( book.getName() );
        book1.setAuthor( authorToAuthor1( book.getAuthor() ) );
        book1.setGenre( genreToGenre1( book.getGenre() ) );

        return book1;
    }

    protected Author authorToAuthor(lesson42.model.nosql.Author author) {
        if ( author == null ) {
            return null;
        }

        Author author1 = new Author();

        if ( author.getId() != null ) {
            author1.setId( Long.parseLong( author.getId() ) );
        }
        author1.setFirstName( author.getFirstName() );
        author1.setLastName( author.getLastName() );

        return author1;
    }

    protected lesson42.model.sql.Genre genreToGenre(Genre genre) {
        if ( genre == null ) {
            return null;
        }

        lesson42.model.sql.Genre genre1 = new lesson42.model.sql.Genre();

        genre1.setCode( genre.getCode() );
        genre1.setName( genre.getName() );

        return genre1;
    }

    protected lesson42.model.sql.Comment commentToComment(Comment comment) {
        if ( comment == null ) {
            return null;
        }

        lesson42.model.sql.Comment comment1 = new lesson42.model.sql.Comment();

        if ( comment.getId() != null ) {
            comment1.setId( Long.parseLong( comment.getId() ) );
        }
        comment1.setText( comment.getText() );
        comment1.setBook( toEntity( comment.getBook() ) );

        return comment1;
    }

    protected List<lesson42.model.sql.Comment> commentListToCommentList(List<Comment> list) {
        if ( list == null ) {
            return null;
        }

        List<lesson42.model.sql.Comment> list1 = new ArrayList<lesson42.model.sql.Comment>( list.size() );
        for ( Comment comment : list ) {
            list1.add( commentToComment( comment ) );
        }

        return list1;
    }

    protected lesson42.model.nosql.Author authorToAuthor1(Author author) {
        if ( author == null ) {
            return null;
        }

        lesson42.model.nosql.Author author1 = new lesson42.model.nosql.Author();

        author1.setId( String.valueOf( author.getId() ) );
        author1.setFirstName( author.getFirstName() );
        author1.setLastName( author.getLastName() );

        return author1;
    }

    protected Genre genreToGenre1(lesson42.model.sql.Genre genre) {
        if ( genre == null ) {
            return null;
        }

        Genre genre1 = new Genre();

        genre1.setCode( genre.getCode() );
        genre1.setName( genre.getName() );

        return genre1;
    }
}
