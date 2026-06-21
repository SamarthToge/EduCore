package com.schoolms.schoolms.Services;

import com.schoolms.schoolms.Models.Student;
import com.schoolms.schoolms.Repository.StudentsRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.StreamSupport;

@Service
@Slf4j
public class Studentservice {

    private final StudentsRepository stdrepository;
    public Studentservice(StudentsRepository studentsRepository){
        this.stdrepository=studentsRepository;
    }

    public boolean isSave(Student std){
        stdrepository.save(std);
        return true;
    }

    public List<Student> getstdlist(String stand, String section) {

        return StreamSupport
                .stream(stdrepository.findAll().spliterator(), false)
                .filter(s -> "All".equals(stand) ||
                        s.getStantard().equalsIgnoreCase(stand))
                .filter(s -> "All".equals(section) ||
                        s.getSection().equalsIgnoreCase(section))
                .toList();
    }
}
