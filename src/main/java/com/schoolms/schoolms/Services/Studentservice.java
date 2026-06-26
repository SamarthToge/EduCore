package com.schoolms.schoolms.Services;

import com.schoolms.schoolms.Models.RegUsers;
import com.schoolms.schoolms.Models.Student;
import com.schoolms.schoolms.Repository.StudentsRepository;
import com.schoolms.schoolms.Repository.regUserRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.StreamSupport;

@Service
@Slf4j
public class Studentservice {

    private final StudentsRepository stdrepository;
    private final regUserRepository RegUserRepository;

    public Studentservice(StudentsRepository studentsRepository,regUserRepository RegUserRepository){
        this.stdrepository=studentsRepository;
        this.RegUserRepository=RegUserRepository;
    }

    public boolean isSave(Student student){
        Authentication authentication =
                SecurityContextHolder.getContext().getAuthentication();

        RegUsers user = (RegUsers) authentication.getPrincipal();
        Student students = stdrepository
                .findByUsers_Schoolemail(user.getSchoolemail())
                .orElseThrow();

        int id = students.getId();
        student.setUsers(user);
        student.setId(id);
        stdrepository.save(student);
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
