package com.schoolms.schoolms.Controllers;

import com.schoolms.schoolms.Models.Classes;
import com.schoolms.schoolms.Services.Classesservice;
import lombok.extern.slf4j.Slf4j;
import org.springframework.resilience.annotation.ConcurrencyLimit;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Slf4j
@Controller
public class ClassesController {
    Classesservice classesservice;
    public ClassesController(Classesservice classesservice){
        this.classesservice=classesservice;
    }
    @RequestMapping(value = "/classes")
    public String classespage(Model model, Classes classes){
        model.addAttribute("classes",classes);
        model.addAttribute("classeslist",classesservice.getclasseslist());
        return "Classes";
    }

    @PostMapping(value = "/saveClass")
    public String saveClass(Classes classes){
        classesservice.saveClasses(classes);
        return "redirect:/classes";
    }

}