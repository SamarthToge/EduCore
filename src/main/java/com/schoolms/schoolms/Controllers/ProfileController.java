package com.schoolms.schoolms.Controllers;

import com.schoolms.schoolms.Models.RegUsers;
import com.schoolms.schoolms.Models.Student;
import com.schoolms.schoolms.Repository.StudentsRepository;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ProfileController {
    private final StudentsRepository stdrepository;
    public ProfileController(StudentsRepository stdrepository){
        this.stdrepository=stdrepository;
    }
    @RequestMapping("/profile")
    public String showProfile(Model model) {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        RegUsers user = (RegUsers) authentication.getPrincipal();

        Student student = stdrepository
                .findByUsers_Schoolemail(user.getSchoolemail())
                .orElseThrow();

        model.addAttribute("student", student); // ← actual student data
        model.addAttribute("editMode", false);
        return "Profile";
    }

    @RequestMapping("/profile/edit")
    public String editProfile(Model model) {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        RegUsers user = (RegUsers) authentication.getPrincipal();

        Student student = stdrepository
                .findByUsers_Schoolemail(user.getSchoolemail())
                .orElseThrow();

        model.addAttribute("student", student);
        model.addAttribute("editMode", true); // ← switches form to edit mode
        return "Profile";
    }
}