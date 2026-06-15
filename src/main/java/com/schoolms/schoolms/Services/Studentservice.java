package com.schoolms.schoolms.Services;

import com.schoolms.schoolms.Models.Student;
import com.schoolms.schoolms.Repository.StudentsRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class Studentservice {

    private final StudentsRepository stdrepository;
    public Studentservice(StudentsRepository studentsRepository){
        this.stdrepository=studentsRepository;
    }

    public boolean isSave(Student std){
        log.info(std.toString());
        return true;
    }

    public List<Student> getstdlist(){
        return stdrepository.givestdlist();
    }
}
