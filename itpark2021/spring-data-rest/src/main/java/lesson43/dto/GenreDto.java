package lesson43.dto;

import lombok.Data;
import lombok.NonNull;

import javax.validation.constraints.Size;

@Data
public class GenreDto {
    @NonNull
    @Size(min = 1, max = 3)
    private String code;

    @NonNull
    @Size(min = 1, max = 120)
    private String name;
}
