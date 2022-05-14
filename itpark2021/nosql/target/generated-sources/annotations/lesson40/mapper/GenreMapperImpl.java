package lesson40.mapper;

import javax.annotation.processing.Generated;
import lesson40.dto.GenreDto;
import lesson40.model.Genre;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-05-13T12:34:38+0300",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 17.0.1 (Oracle Corporation)"
)
@Component
public class GenreMapperImpl implements GenreMapper {

    @Override
    public GenreDto toDto(Genre entity) {
        if ( entity == null ) {
            return null;
        }

        GenreDto genreDto = new GenreDto();

        genreDto.setCode( entity.getCode() );
        genreDto.setName( entity.getName() );

        return genreDto;
    }

    @Override
    public Genre toEntity(GenreDto entity) {
        if ( entity == null ) {
            return null;
        }

        Genre genre = new Genre();

        genre.setCode( entity.getCode() );
        genre.setName( entity.getName() );

        return genre;
    }
}
