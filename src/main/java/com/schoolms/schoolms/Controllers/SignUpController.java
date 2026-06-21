package com.schoolms.schoolms.Controllers;

import com.schoolms.schoolms.Models.User;
import jakarta.validation.Valid;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.webmvc.autoconfigure.WebMvcProperties;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("public")
@Slf4j
public class SignUpController {

    @RequestMapping(value = "/signup" ,method = {RequestMethod.GET})
    public String signupPage(Model model){
        model.addAttribute("newuser",new User());
        return "Sign-up";
    }

    @PostMapping(value = "/createuser")
    public String createnewuser(@Valid @ModelAttribute("newuser") User user, Errors errors){
        if(errors.hasErrors()){
            return "Sign-up";
        }
        log.info(user.toString());
        return "redirect:/sigup";
    }
}
