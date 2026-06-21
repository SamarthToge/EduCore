package com.schoolms.schoolms.Models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
    public class Roles extends BaseClass {
        @Id
        @Column(name = "role_id")
        private int roleID;
        @Column(name = "role_name")
        private String roleName;
    }
