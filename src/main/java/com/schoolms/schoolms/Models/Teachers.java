package com.schoolms.schoolms.Models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@Table(name = "employee")
public class Teachers extends BaseClass {
    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO,generator = "native")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String subject;
    private int experience;
    private String qualification;
    private String conNo;
    private String email;
    @OneToOne(fetch = FetchType.EAGER,cascade = CascadeType.PERSIST,targetEntity = RegUsers.class)
    @JoinColumn(name = "schoolemail", referencedColumnName = "school_email",nullable = false)
    private RegUsers users;
}