package com.schoolms.schoolms.Controllers;

import com.schoolms.schoolms.Models.Teachers;
import com.schoolms.schoolms.Services.Teacherservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
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
    public String defaultTeachersPage() {
        return "redirect:/teachers/All";
    }

    @RequestMapping("/teachers/{display}")
    public String dashboardPage(Model model, @PathVariable String display){
        model.addAttribute("Teacher",new Teachers());
        model.addAttribute("Teacherlist",teacherservice.getteacherlist(display));
        return "Teachers";
    }

    @PostMapping("/saveTeacher")
    public String saveTeacher(@ModelAttribute ("Teacher") Teachers teacher, Model model){
        teacherservice.issave(teacher);
        return "redirect:/teachers/All";
    }

    @PostMapping("/updateTeacherStatus/{id}/{status}")
    public String updateTeacherStatus(@PathVariable int id, @PathVariable String status) {
        teacherservice.updateStatus(id, status);
        return "redirect:/teachers/All";
    }
}
