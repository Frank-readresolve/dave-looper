package co.simplon.davelooper.dtos;

import co.simplon.davelooper.dtos.validation.SamePasswords;
import jakarta.validation.constraints.NotBlank;

@SamePasswords
public record AccountCreate(@NotBlank String username,
	@NotBlank String password, @NotBlank String confirmedPassword) {
    //
}
