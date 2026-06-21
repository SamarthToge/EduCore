package com.schoolms.schoolms.Controllers;

import com.schoolms.schoolms.Models.RegUsers;
import com.schoolms.schoolms.Services.regUserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class newUserController {
    private final regUserService RegUserService;
    public newUserController(regUserService RegUserService){
        this.RegUserService=RegUserService;
    }
    @RequestMapping("/add-user")
    public String newUserPage(Model model,RegUsers regUsers){
        model.addAttribute("Reguser",regUsers);
        return "AddUser";   
    }
    @RequestMapping("/save-user")
    public String saveNewUser(RegUsers regUsers){
        regUsers.setPassword("samarthtoge");
        regUsers.setStatus("Inactive");
        RegUserService.saveReguser(regUsers);
        return "redirect:/add-user";
    }
}
