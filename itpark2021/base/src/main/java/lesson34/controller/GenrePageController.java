package lesson34.controller;

import lesson34.dto.GenreDto;
import lesson34.dto.GenrePageDto;
import lesson34.service.GenreService;
import lesson34.validator.PositiveOrZero;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.validation.constraints.Positive;

@Controller
@Validated
@RequiredArgsConstructor
public class GenrePageController {

    private final GenreService genreService;

    @GetMapping("/genres")
    public String index (Model model,
                         @PositiveOrZero (originValue = 15) @RequestParam(required = false, defaultValue = "0") Integer page,
                         @Positive @RequestParam(required = false, defaultValue = "5") Integer size) {
        GenrePageDto allGenres = genreService.getPage(PageRequest.of(page, size));
        model.addAttribute("genres", allGenres);
        return "genre/genres";
    }

    @GetMapping("/genre/add")
    public String newGenre (Model model) {
        return "genre/genre";
    }

    @GetMapping("/genre/edit")
    public String currentGenre (@RequestParam("code") String genreCode, Model model) {
        GenreDto currentGenre = genreService.getByCode(genreCode)
                .orElseThrow(() -> new IllegalArgumentException("non existed genre"));
        model.addAttribute("genre", currentGenre);
        return "genre/genre";
    }

    @PostMapping ("/genre/save")
    public String saveGenre (GenreDto genre) {
        genreService.save(genre);
        return "redirect:/genres";
    }
}

