package com.schoolms.schoolms.Controllers;

import com.schoolms.schoolms.Models.Student;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ProfileController {
    @RequestMapping("/profile")
    public String showProfile(Student student, Model model){
        model.addAttribute("student", new Student());
        return "Profile";
    }
}