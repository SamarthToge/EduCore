package com.schoolms.schoolms.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class settingsController {
    @RequestMapping("/settings")
    public String settingspage(){
        return "Settings";
    }
}
