package com.schoolms.schoolms.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LibraryController {

    @RequestMapping("/library")
    public String libraryPage(){
        return "Library";
    }

}
