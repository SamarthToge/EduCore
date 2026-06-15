package com.schoolms.schoolms.Models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Teachers extends BaseClass {
    private int id;
    private String fname;
    private String lname;
    private String subject;
    private int experience;
    private String qualification;
    private String conNo;
    private String email;
}