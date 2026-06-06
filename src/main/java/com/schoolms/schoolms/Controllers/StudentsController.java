package com.schoolms.schoolms.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class StudentsController {

    @RequestMapping(value="students")
    public String StudentsPage(){
        return "Students";
    }
}
