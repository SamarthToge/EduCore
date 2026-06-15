package com.schoolms.schoolms.Controllers;

import com.schoolms.schoolms.Models.Teachers;
import com.schoolms.schoolms.Services.Teacherservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TeachersController {

    private final Teacherservice teacherservice;
    @Autowired
    public TeachersController(Teacherservice teacherservice){
        this.teacherservice=teacherservice;
    }

    @RequestMapping("/teachers")
    public String dashboardPage(Model model){
        model.addAttribute("Teacher",new Teachers());
        model.addAttribute("Teacherlist",teacherservice.getteacherlist());
        return "Teachers";
    }

    @PostMapping("/saveTeacher")
    public String saveTeacher(@ModelAttribute ("Teacher") Teachers teacher, Model model){
        teacherservice.issave(teacher);
        return "redirect:/teachers";
    }
}
