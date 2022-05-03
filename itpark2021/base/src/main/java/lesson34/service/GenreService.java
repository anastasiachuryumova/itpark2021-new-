package lesson34.service;

import lesson34.dto.GenreDto;
import lesson34.dto.GenrePageDto;
import org.springframework.data.domain.Pageable;

import javax.validation.Valid;
import javax.validation.constraints.NotEmpty;
import java.util.List;
import java.util.Optional;

public interface GenreService {
    List<GenreDto> findAll();
    GenrePageDto getPage (Pageable pageable);
    Optional<GenreDto> getByCode (@NotEmpty String genreCode);
    GenreDto save(@Valid GenreDto genre);
    void deleteByCode (@NotEmpty String genreCode);
}
