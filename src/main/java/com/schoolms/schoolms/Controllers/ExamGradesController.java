package com.schoolms.schoolms.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ExamGradesController {

    @RequestMapping("/exams")
    public String exampage(){
        return "Exams";
    }

}
