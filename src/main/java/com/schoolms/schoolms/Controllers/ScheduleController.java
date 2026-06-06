package com.schoolms.schoolms.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ScheduleController {

    @RequestMapping("/schedule")
    public String schedulepage(){
        return "Schedule";
    }
    
}
