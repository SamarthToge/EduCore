package com.schoolms.schoolms.Validations;

import com.schoolms.schoolms.Annotations.isEmailValid;
import com.schoolms.schoolms.Repository.regUserRepository;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;
import org.springframework.stereotype.Component;

@Component
public class EmaildbValidator implements ConstraintValidator< isEmailValid, String > {
    private final regUserRepository RegUserRepository;
    public EmaildbValidator(regUserRepository RegUserRepository){
        this.RegUserRepository=RegUserRepository;
    }
    @Override
    public void initialize(isEmailValid IsEmailValid) {
    }
    @Override
    public boolean isValid(String email, ConstraintValidatorContext cxt){
        if (email == null || email.isBlank()) {
            return false;
        }
        return RegUserRepository.existsById(email);
    }
}
