package com.schoolms.schoolms.Models;

import com.schoolms.schoolms.Annotations.FieldValueMatch;
import com.schoolms.schoolms.Annotations.isEmailValid;
import jakarta.persistence.Transient;
import lombok.Data;

@Data
@FieldValueMatch.List({
        @FieldValueMatch(
                field = "password",
                fieldMatch = "cnfpassword",
                message = "Password do not Match"
        )
})
public class User extends BaseClass{
    private String fname;
    private String lname;
    private String schoolname;
    @isEmailValid(  message = "Email Invalid or Contact to admin!!!")
    private String email;
    private String password;
    @Transient
    private String cnfpassword;
}
