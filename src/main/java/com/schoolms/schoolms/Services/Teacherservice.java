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
        teacherRepository.addTeacher(teachers);
        return true;
    }

    public List<Teachers> getteacherlist(String display){
        if(display.equals("Science")){
            return teacherRepository.giveteacherlist().stream()
                    .filter(t->"Science".equals(t.getSubject()))
                    .toList();
        } else if(display.equals("Mathematics")){
            return teacherRepository.giveteacherlist().stream()
                    .filter(t->"Mathematics".equals(t.getSubject()))
                    .toList();
        } else if(display.equals("English")){
            return teacherRepository.giveteacherlist().stream()
                    .filter(t->"English".equals(t.getSubject()))
                    .toList();
        } else if(display.equals("History")){
            return teacherRepository.giveteacherlist().stream()
                    .filter(t->"History".equals(t.getSubject()))
                    .toList();
        } else if(display.equals("Geography")){
            return teacherRepository.giveteacherlist().stream()
                    .filter(t->"Geography".equals(t.getSubject()))
                    .toList();
        }

        return teacherRepository.giveteacherlist();
    }
}
