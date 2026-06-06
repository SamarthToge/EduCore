package com.schoolms.schoolms.Controllers;

import org.springframework.resilience.annotation.ConcurrencyLimit;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class NoticeController {

    @RequestMapping("/notices")
    public String noticepage(){
        return "Notices";
    }
}
