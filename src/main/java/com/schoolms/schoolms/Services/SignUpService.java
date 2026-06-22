package com.schoolms.schoolms.Services;

import com.schoolms.schoolms.Models.RegUsers;
import com.schoolms.schoolms.Models.Student;
import com.schoolms.schoolms.Models.Teachers;
import com.schoolms.schoolms.Models.User;
import com.schoolms.schoolms.Repository.StudentsRepository;
import com.schoolms.schoolms.Repository.TeacherRepository;
import com.schoolms.schoolms.Repository.regUserRepository;
import org.springframework.stereotype.Service;

@Service
public class SignUpService {
    private final StudentsRepository studentsRepository;
    private final TeacherRepository teacherRepository;
    private final regUserRepository regUserRepository;
    public SignUpService(StudentsRepository studentsRepository,
                         TeacherRepository teacherRepository,regUserRepository regUserRepository) {
        this.studentsRepository = studentsRepository;
        this.teacherRepository = teacherRepository;
        this.regUserRepository=regUserRepository;
    }

    public boolean saveUser(User user){
        RegUsers regUsers=regUserRepository.getById(user.getEmail());
        regUsers.setPassword(user.getPassword());
        if(regUsers.getRole().getRoleID()==2){
            Student student = new Student();
            student.setUsers(regUsers);
            studentsRepository.save(student);
        }
        else{
            Teachers teachers=new Teachers();
            teachers.setUsers(regUsers);
            teacherRepository.save(teachers);
        }
        regUsers.setStatus("Active");
        regUserRepository.save(regUsers);
        return true;
    }
}

