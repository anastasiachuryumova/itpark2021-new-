package lesson40.mapper;

import javax.annotation.processing.Generated;
import lesson40.dto.BookDto;
import lesson40.model.Book;
import lesson40.model.Genre;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-05-13T12:34:38+0300",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 17.0.1 (Oracle Corporation)"
)
@Component
public class BookMapperImpl implements BookMapper {

    @Override
    public BookDto toDto(Book book) {
        if ( book == null ) {
            return null;
        }

        BookDto bookDto = new BookDto();

        bookDto.setId( book.getId() );
        bookDto.setIsbn( book.getIsbn() );
        bookDto.setName( book.getName() );
        bookDto.setGenreCode( bookGenreCode( book ) );

        return bookDto;
    }

    @Override
    public Book toEntity(BookDto book) {
        if ( book == null ) {
            return null;
        }

        Book book1 = new Book();

        book1.setId( book.getId() );
        book1.setIsbn( book.getIsbn() );
        book1.setName( book.getName() );

        return book1;
    }

    private String bookGenreCode(Book book) {
        if ( book == null ) {
            return null;
        }
        Genre genre = book.getGenre();
        if ( genre == null ) {
            return null;
        }
        String code = genre.getCode();
        if ( code == null ) {
            return null;
        }
        return code;
    }
}
