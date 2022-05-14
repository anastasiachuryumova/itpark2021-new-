package lesson42.controller.rest;

import lesson42.dto.GenrePageDto;
import lesson42.service.GenreService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/genres")
public class GenreController {

    private final GenreService genreService;

    @GetMapping
    public GenrePageDto find(@PageableDefault(value = 5) Pageable pageable) {
        final GenrePageDto page = genreService.getPage(pageable);
        page.setAdmin(
                SecurityContextHolder.getContext().getAuthentication()
                        .getAuthorities()
                        .stream()
                        .anyMatch(grantedAuthority -> grantedAuthority.getAuthority().equals("ROLE_ADMIN")));
        return page;
    }

    @DeleteMapping("/{code}")
    public ResponseEntity<?> delete(@PathVariable("code") String genreCode) {
        genreService.deleteByCode(genreCode);
        return ResponseEntity.noContent().build();
    }
}
