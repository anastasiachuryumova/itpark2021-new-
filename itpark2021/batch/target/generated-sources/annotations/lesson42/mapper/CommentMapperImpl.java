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
public class CommentMapperImpl implements CommentMapper {

    @Override
    public lesson42.model.sql.Comment toEntity(Comment entity) {
        if ( entity == null ) {
            return null;
        }

        lesson42.model.sql.Comment comment = new lesson42.model.sql.Comment();

        if ( entity.getId() != null ) {
            comment.setId( Long.parseLong( entity.getId() ) );
        }
        comment.setText( entity.getText() );
        comment.setBook( bookToBook( entity.getBook() ) );

        return comment;
    }

    @Override
    public Comment toDocumentEntity(lesson42.model.sql.Comment comment) {
        if ( comment == null ) {
            return null;
        }

        Comment comment1 = new Comment();

        comment1.setId( String.valueOf( comment.getId() ) );
        comment1.setText( comment.getText() );

        return comment1;
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

    protected List<lesson42.model.sql.Comment> commentListToCommentList(List<Comment> list) {
        if ( list == null ) {
            return null;
        }

        List<lesson42.model.sql.Comment> list1 = new ArrayList<lesson42.model.sql.Comment>( list.size() );
        for ( Comment comment : list ) {
            list1.add( toEntity( comment ) );
        }

        return list1;
    }

    protected lesson42.model.sql.Book bookToBook(Book book) {
        if ( book == null ) {
            return null;
        }

        lesson42.model.sql.Book book1 = new lesson42.model.sql.Book();

        if ( book.getId() != null ) {
            book1.setId( Long.parseLong( book.getId() ) );
        }
        book1.setIsbn( book.getIsbn() );
        book1.setName( book.getName() );
        book1.setAuthor( authorToAuthor( book.getAuthor() ) );
        book1.setGenre( genreToGenre( book.getGenre() ) );
        book1.setComments( commentListToCommentList( book.getComments() ) );

        return book1;
    }
}
