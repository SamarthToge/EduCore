package com.schoolms.schoolms.Controllers;

import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {

    @RequestMapping(value = {"/dashboard"})
    public String dashboardPage(){
        return "index";
    }

    @RequestMapping(value = {"/home" ,"/"})
    public String homePage(){
        return "Home";
    }

    @RequestMapping(value = {"/login"})
    public String loginPage(@RequestParam(value ="error",required = false) String error, @RequestParam(value="logout",required = false) String logout,@RequestParam(value="register",required = false) String register ,Model model){
        String errorMessage=null;
        if(error!=null){
            errorMessage="Username or password is incorrect";
        }
       else if(logout!=null){
            errorMessage="Logout successfully";
        }
       else if(register!=null){
            errorMessage="Registration successfully";
        }
        model.addAttribute("errorMessage",errorMessage);
        return "Log-in";
    }

    @RequestMapping(value = {"/signup"})
    public String signupPage(@RequestParam(value ="error",required = false) String error, Model model){
        String errorMessage=null;
        if(error!=null){
            errorMessage="Username or password is incorrect";
        }
        model.addAttribute("errorMessage",errorMessage);
        return "Sign-up";
    }

}