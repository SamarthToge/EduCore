package com.schoolms.schoolms.RowMappers;

import com.schoolms.schoolms.Models.Teachers;

import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class TeacherRowMapper implements RowMapper<Teachers> {

    @Override
    public Teachers mapRow(ResultSet rs,int rowNum ) throws SQLException{
        Teachers teachers=new Teachers();
        teachers.setId(rs.getInt("id"));
        teachers.setFname(rs.getString("fname"));
        teachers.setLname(rs.getString("lname"));
        teachers.setSubject(rs.getString("subject"));
        teachers.setExperience(rs.getInt("experience"));
        teachers.setQualification(rs.getString("qualification"));
        teachers.setConNo(rs.getString("con_no"));
        teachers.setEmail(rs.getString("email"));
        teachers.setStatus(rs.getString("status"));
        return teachers;
    }
}
