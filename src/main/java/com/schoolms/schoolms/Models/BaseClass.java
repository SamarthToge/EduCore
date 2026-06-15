package com.schoolms.schoolms.Models;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@NoArgsConstructor
@Data
public class BaseClass {
    private String created_by;
    private LocalDate created_at;
    private String upadated_by;
    private LocalDate updated_at;
    private String status;
}