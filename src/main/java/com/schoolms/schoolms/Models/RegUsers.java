package com.schoolms.schoolms.Models;

import com.schoolms.schoolms.Annotations.isEmailValid;
import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class RegUsers extends BaseClass{
    @Id
    @Column(name = "school_email")
    private String schoolemail;
    private String fname;
    private String lname;
    @Column(name = "school_name")
    private String schoolname;
    private String password;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "role_id")
    private Roles role;

    public String getName(){
        return fname+" "+lname;
    }
}
