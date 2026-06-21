package com.schoolms.schoolms.Annotations;

import com.schoolms.schoolms.Validations.FieldValueMatchValidator;
import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.*;

@Documented
@Target({ ElementType.TYPE})
@Retention( RetentionPolicy.RUNTIME)
@Constraint(validatedBy = { FieldValueMatchValidator.class })
public @interface FieldValueMatch  {
    Class<?>[] groups() default {};
    Class<? extends Payload> [] payload() default {};
    String message() default "Feild values do not match!!";

    String field();
    String fieldMatch();

    @Target({ ElementType.TYPE})
    @Retention(RetentionPolicy.RUNTIME)
    @interface  List{
        FieldValueMatch[] value();
    }
}
