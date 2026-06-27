package com.schoolms.schoolms.Models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Student extends BaseClass {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private LocalDate dob;
    @Enumerated(EnumType.STRING)
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
    @OneToOne(fetch = FetchType.EAGER, targetEntity = RegUsers.class)
    @JoinColumn(name = "schoolemail", referencedColumnName = "school_email", nullable = false)
    private RegUsers users;
}
