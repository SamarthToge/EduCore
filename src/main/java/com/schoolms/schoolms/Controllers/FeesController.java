package com.schoolms.schoolms.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class FeesController {
    @RequestMapping("/fees")
    public String feespage(){
        return "Fees";
    }

}
