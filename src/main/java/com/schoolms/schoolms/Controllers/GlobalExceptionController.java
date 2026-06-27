package com.schoolms.schoolms.Controllers;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

@ControllerAdvice(assignableTypes = {
        AttendanceController.class,
        ClassesController.class,
        ExamGradesController.class,
        FeesController.class,
        HomeController.class,
        LibraryController.class,
        NoticeController.class,
        ProfileController.class,
        ScheduleController.class,
        SignUpController.class,
        StudentsController.class,
        TeachersController.class,
        newUserController.class,
        settingsController.class
})
@Slf4j
public class GlobalExceptionController {

    @ExceptionHandler(Exception.class)
    public ModelAndView exceptionHandler(Exception exception){
        log.error("Unhandled exception: ", exception);
        ModelAndView errorPage = new ModelAndView();
        errorPage.setViewName("error");
        errorPage.addObject("errormsg", exception.getMessage());
        errorPage.addObject("errorCode", 500);
        errorPage.addObject("status", 500);
        return errorPage;
    }
}