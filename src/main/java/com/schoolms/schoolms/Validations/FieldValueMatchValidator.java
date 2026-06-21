package com.schoolms.schoolms.Validations;

import com.schoolms.schoolms.Annotations.FieldValueMatch;
import com.schoolms.schoolms.Annotations.isEmailValid;
import com.schoolms.schoolms.Repository.regUserRepository;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;
import org.springframework.beans.BeanWrapperImpl;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public class FieldValueMatchValidator implements ConstraintValidator<FieldValueMatch, Object > {
    private String field;
    private String fieldMatch;
    @Override
    public void initialize(FieldValueMatch fieldValueMatch) {
        this.field=fieldValueMatch.field();
        this.fieldMatch=fieldValueMatch.fieldMatch();
    }
    @Override
    public boolean isValid(Object value, ConstraintValidatorContext cxt){
        Object fieldValue=new BeanWrapperImpl(value).getPropertyValue(field);
        Object fieldValueMatch=new BeanWrapperImpl(value).getPropertyValue(fieldMatch);
        if(fieldValue!=null){
            return fieldValue.equals(fieldValueMatch);
        }
        return false;
    }
}
