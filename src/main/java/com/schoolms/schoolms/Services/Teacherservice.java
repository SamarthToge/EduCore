package com.schoolms.schoolms.Services;

import com.schoolms.schoolms.Models.Teachers;
import com.schoolms.schoolms.Repository.TeacherRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.StreamSupport;

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
        teacherRepository.save(teachers);
        return true;
    }

    public void updateStatus(int id, String status) {
        Teachers teacher = teacherRepository.findById(id)
                .orElseThrow();
        teacher.setStatus(status);

        teacherRepository.save(teacher);
    }

    public List<Teachers> getteacherlist(String display){
        Iterable<Teachers> teachers=teacherRepository.findAll();
        List<Teachers> list = StreamSupport
                .stream(teacherRepository.findAll().spliterator(), false)
                .toList();
        if(display.equals("Science")){
            return list.stream()
                    .filter(t->"Science".equals(t.getSubject()))
                    .toList();
        } else if(display.equals("Mathematics")){
            return list.stream()
                    .filter(t->"Mathematics".equals(t.getSubject()))
                    .toList();
        } else if(display.equals("English")){
            return list.stream()
                    .filter(t->"English".equals(t.getSubject()))
                    .toList();
        } else if(display.equals("History")){
            return list.stream()
                    .filter(t->"History".equals(t.getSubject()))
                    .toList();
        } else if(display.equals("Geography")){
            return list.stream()
                    .filter(t->"Geography".equals(t.getSubject()))
                    .toList();
        }

        return list;
    }
}
