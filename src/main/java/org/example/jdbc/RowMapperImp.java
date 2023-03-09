package org.example.jdbc;

import java.sql.ResultSet;
import java.sql.SQLException;

public class RowMapperImp implements org.springframework.jdbc.core.RowMapper<Student> {
    @Override
    public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
        Student student=new Student();
        student.setId(rs.getInt("id"));
        student.setName(rs.getString("name"));
        student.setCity(rs.getString("city"));

        return student;
    }
}
