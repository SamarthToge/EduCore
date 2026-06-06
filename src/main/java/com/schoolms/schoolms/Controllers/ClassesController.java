package com.schoolms.schoolms.Controllers;

import org.springframework.resilience.annotation.ConcurrencyLimit;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ClassesController {

    @RequestMapping(value = "/classes")
    public String classespage(){
        return "Classes";
    }
}
