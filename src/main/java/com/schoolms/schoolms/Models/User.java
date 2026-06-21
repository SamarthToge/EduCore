package com.schoolms.schoolms.Models;

import lombok.Data;

@Data
public class User extends BaseClass{
    private String fname;
    private String lname;
    private String schoolname;
    private String email;
    private String password;
    private String cnfpassword;
}
