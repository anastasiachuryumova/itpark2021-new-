package lesson34.mapper;

import lesson34.dto.GenreDto;
import lesson34.model.Genre;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Mapper
public interface GenreMapper {

    @Mapping(target = "code", source = "entity.code")
    @Mapping(target = "name", source = "entity.name")
    GenreDto toDo (Genre entity);

    @Mapping(target = "code", source = "dto.code")
    @Mapping(target = "name", source = "dto.name")
    Genre toEntity (GenreDto dto);

    default List<GenreDto> toDtos (List<Genre> entities) {
        return entities.stream().map(this::toDo).collect(Collectors.toList());
    }

    default Optional<GenreDto> toOptionalDto (Optional<Genre> entity) {
        return entity.map(this::toDo);
    }

}
