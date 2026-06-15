package com.schoolms.schoolms.Services;

import com.schoolms.schoolms.Models.Teachers;
import com.schoolms.schoolms.Repository.TeacherRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class Teacherservice {
    private final TeacherRepository teacherRepository;
    @Autowired
    public Teacherservice(TeacherRepository teacherRepository){
        this.teacherRepository=teacherRepository;
    }
    public boolean issave(Teachers teachers){
        log.info(teachers.toString());
        return true;
    }

    public List<Teachers> getteacherlist(){
        return teacherRepository.giveteacherlist();
    }
}
