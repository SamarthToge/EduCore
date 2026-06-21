package com.schoolms.schoolms.Annotations;

import com.schoolms.schoolms.Validations.EmaildbValidator;
import com.schoolms.schoolms.Validations.FieldValueMatchValidator;
import jakarta.validation.Constraint;
import jakarta.validation.Payload;
import org.hibernate.validator.internal.constraintvalidators.bv.EmailValidator;

import java.lang.annotation.*;

@Documented
@Target({ ElementType.FIELD,ElementType.METHOD})
@Retention( RetentionPolicy.RUNTIME)
@Constraint(validatedBy = EmaildbValidator.class)
public @interface isEmailValid {
    Class<?>[] groups() default {};
    Class<? extends Payload> [] payload() default {};
    String message() default "Please Enter the valid email or contact to admin !!";
}
