package com.schoolms.schoolms.Converters;

import com.schoolms.schoolms.Models.Roles;
import com.schoolms.schoolms.Repository.RolesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class StringToRoleConverter implements Converter<String, Roles> {

    @Autowired
    private RolesRepository rolesRepository;

    @Override
    public Roles convert(String source) {
        System.out.println("Converter called: " + source);
        return rolesRepository.findById(Integer.parseInt(source))
                .orElse(null);
    }
}