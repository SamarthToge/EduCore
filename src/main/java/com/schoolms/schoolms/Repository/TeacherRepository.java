package com.schoolms.schoolms.Repository;

import com.schoolms.schoolms.Models.Teachers;
import com.schoolms.schoolms.RowMappers.TeacherRowMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementSetter;
import org.springframework.stereotype.Repository;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@Repository
public interface TeacherRepository extends CrudRepository<Teachers,Integer> {

//    private final JdbcTemplate jdbcTemplate;
//
//    @Autowired
//    public TeacherRepository(JdbcTemplate jdbcTemplate){
//        this.jdbcTemplate=jdbcTemplate;
//    }
//
//    public List<Teachers> giveteacherlist(){
//        String sql="select * from teachers";
//        return jdbcTemplate.query(sql, new TeacherRowMapper());
//    }
//
//    public void addTeacher(Teachers teacher) {
//        String sql="INSERT INTO teachers (\n" +
//                "    fname,\n" +
//                "    lname,\n" +
//                "    subject,\n" +
//                "    experience,\n" +
//                "    qualification,\n" +
//                "    con_no,\n" +
//                "    email,\n" +
//                "    created_by,\n" +
//                "    created_at,\n" +
//                "    updated_by,\n" +
//                "    updated_at,\n" +
//                "    status\n" +
//                ")\n" +
//                "VALUES (?,?,?,?,?,?,?,?,?,?,?,?);";
//        jdbcTemplate.update(
//                sql,
//                teacher.getFname(),
//                teacher.getLname(),
//                teacher.getSubject(),
//                teacher.getExperience(),
//                teacher.getQualification(),
//                teacher.getConNo(),
//                teacher.getEmail(),
//                "admin",                         // created_by
//                java.sql.Date.valueOf(java.time.LocalDate.now()),
//                "admin",                         // updated_by
//                java.sql.Date.valueOf(java.time.LocalDate.now()),
//                "ACTIVE"
//        );
//    }
//
//    public void updateStatus(int id, String status) {
//        String sql = "UPDATE teachers SET status = ?, updated_at = ? WHERE id = ?";
//        jdbcTemplate.update(sql, status, java.sql.Date.valueOf(java.time.LocalDate.now()), id);
//    }


}
