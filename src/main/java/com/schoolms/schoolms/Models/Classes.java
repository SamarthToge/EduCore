package com.schoolms.schoolms.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Inheritance(strategy = InheritanceType.JOINED)
public class Classes extends BaseClass {
    @Id
    private int room;
    private String standard;
    private String section;
    private String class_teacher;
    private int students;
    private int avg_grade;
}