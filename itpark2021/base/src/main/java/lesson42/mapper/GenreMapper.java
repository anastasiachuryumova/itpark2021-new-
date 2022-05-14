package lesson42.mapper;

import lesson42.dto.GenreDto;
import lesson42.model.Genre;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Mapper
public interface GenreMapper {

    @Mapping(target = "code", source = "entity.code")
    @Mapping(target = "name", source = "entity.name")
    GenreDto toDto (Genre entity);

    @Mapping(target = "code", source = "dto.code")
    @Mapping(target = "name", source = "dto.name")
    Genre toEntity (GenreDto dto);

    default List<GenreDto> toDtos (List<lesson42.model.Genre> entities) {
        return entities.stream().map(this::toDto).collect(Collectors.toList());
    }

    default Optional<GenreDto> toOptionalDto(Optional<lesson42.model.Genre> entity) {
    return entity.map(this::toDto);
    }

}
