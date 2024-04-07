package co.simplon.davelooper.dtos;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;

public record LanguageCreate(@NotEmpty String code,
	@NotBlank @Size(min = 2, max = 10) String name) {
    //
}
