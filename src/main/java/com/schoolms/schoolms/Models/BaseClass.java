package com.schoolms.schoolms.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.MappedSuperclass;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@NoArgsConstructor
@Data
@MappedSuperclass
public class BaseClass {
    private String created_by;
    private LocalDate created_at;
    private String updated_by;
    private LocalDate updated_at;
    private String status;
}