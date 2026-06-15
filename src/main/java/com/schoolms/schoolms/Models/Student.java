package com.schoolms.schoolms.Models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Student extends BaseClass {
    private int id;
    private String fName;
    private String lName;
    private LocalDate dob;
    private Gender gender;
    private String stantard;
    private String section;
    private String parName;
    private String contNo;
    private String address;
    private LocalDate doa;
    private String prevSchool;
    private int addentance;
    private String Grade;
}
