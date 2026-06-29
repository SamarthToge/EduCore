package com.schoolms.schoolms.Controllers;

import com.schoolms.schoolms.Models.RegUsers;
import com.schoolms.schoolms.Models.Student;
import com.schoolms.schoolms.Models.Teachers;
import com.schoolms.schoolms.Repository.StudentsRepository;
import com.schoolms.schoolms.Repository.TeacherRepository;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ProfileController {

    private final StudentsRepository stdrepository;
    private final TeacherRepository teachersRepository;

    public ProfileController(StudentsRepository stdrepository, TeacherRepository teachersRepository) {
        this.stdrepository = stdrepository;
        this.teachersRepository = teachersRepository;
    }

    @GetMapping("/profile")
    public String showProfile(Model model) {
        try {
            Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
            RegUsers user = (RegUsers) authentication.getPrincipal();

            if ("STUDENT".equals(user.getRole().getRoleName())) {
                Student student = stdrepository
                        .findByUsers_Schoolemail(user.getSchoolemail())
                        .orElseThrow(() -> new RuntimeException("Student not found"));

                model.addAttribute("student", student);
                model.addAttribute("user", user);
                model.addAttribute("editMode", false);

            }
            else if ("ADMIN".equals(user.getRole().getRoleName())) {
                
            }
            else {
                Teachers teacher = teachersRepository
                        .findByUsers_Schoolemail(user.getSchoolemail())
                        .orElseThrow(() -> new RuntimeException("Teacher not found"));

                model.addAttribute("teacher", teacher);
                model.addAttribute("user", user);
                model.addAttribute("editMode", false);
            }

            return "Profile";

        } catch (Exception e) {
            e.printStackTrace();
            return "redirect:/login";
        }
    }

    @GetMapping("/profile/edit")
    public String editProfile(Model model) {
        try {
            Authentication authentication = SecurityContextHolder.getContext().getAuthentication();

            if (authentication == null || !authentication.isAuthenticated() ||
                    authentication.getPrincipal().equals("anonymousUser")) {
                return "redirect:/login";
            }

            RegUsers user = (RegUsers) authentication.getPrincipal();

            if ("STUDENT".equals(user.getRole().getRoleName())) {
                Student student = stdrepository
                        .findByUsers_Schoolemail(user.getSchoolemail())
                        .orElseThrow(() -> new RuntimeException("Student not found"));

                model.addAttribute("student", student);
                model.addAttribute("editMode", true);
            } else {
                Teachers teacher = teachersRepository
                        .findByUsers_Schoolemail(user.getSchoolemail())
                        .orElseThrow(() -> new RuntimeException("Teacher not found"));

                model.addAttribute("teacher", teacher);
                model.addAttribute("editMode", true);
            }

            return "Profile";

        } catch (Exception e) {
            e.printStackTrace();
            return "redirect:/login";
        }
    }
}