package lesson34.controller.rest;

import lesson34.dto.ResultDto;
import lesson34.service.GenreService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class GenreController {

    private final GenreService genreService;

    @DeleteMapping("/genres/{code}")
    public ResponseEntity<?> delete (@PathVariable("code") String genreCode) {
        genreService.deleteByCode(genreCode);
        return ResponseEntity.ok(new ResultDto());
    }
}
