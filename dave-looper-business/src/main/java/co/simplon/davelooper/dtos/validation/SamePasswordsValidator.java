package co.simplon.davelooper.dtos.validation;

import co.simplon.davelooper.dtos.AccountCreate;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class SamePasswordsValidator
	implements ConstraintValidator<SamePasswords, AccountCreate> {

    @Override
    public boolean isValid(AccountCreate value,
	    ConstraintValidatorContext context) {
	String password = value.password();
	if (password == null) {
	    return false;
	}
	String confirmedPassword = value.confirmedPassword();
	return password.equals(confirmedPassword);
    }
}
