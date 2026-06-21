package com.schoolms.schoolms.Services;

import com.schoolms.schoolms.Models.Classes;
import com.schoolms.schoolms.Repository.ClassesRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Classesservice {
    ClassesRepository classesRepository;
    Classesservice(ClassesRepository classesRepository){
        this.classesRepository=classesRepository;
    }
    public boolean saveClasses(Classes classes){
        classesRepository.save(classes);
        return true;
    }

    public List<Classes> getclasseslist(){
        return classesRepository.findAll();
    }
}