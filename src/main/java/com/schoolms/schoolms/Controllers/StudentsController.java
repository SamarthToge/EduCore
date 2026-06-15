package com.schoolms.schoolms.Controllers;

import com.schoolms.schoolms.Models.Student;
import com.schoolms.schoolms.Services.Studentservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class StudentsController {

    private final Studentservice stdservice;
    @Autowired
    public StudentsController(Studentservice stdservice){
        this.stdservice=stdservice;
    }

    @RequestMapping(value="/students")
    public String StudentsPage(Model model){
        model.addAttribute("student", new Student());
        model.addAttribute("studentlist",stdservice.getstdlist());
        return "Students";
    }

    @PostMapping(value = "/saveStudent")
    public String saveStd(Model model,@ModelAttribute("student") Student std){
        stdservice.isSave(std);
        return "redirect:/students";
    }

}