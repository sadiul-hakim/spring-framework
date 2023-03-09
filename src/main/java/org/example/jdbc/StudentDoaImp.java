package org.example.jdbc;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import java.util.List;

public class StudentDoaImp implements StudentDao{

    private JdbcTemplate jdbcTemplate;

    @Override
    public int insert(Student student) {
        String query="insert into student(id,name,city) values (?,?,?)";
        return jdbcTemplate.update(query, student.getId(), student.getName(), student.getCity());
    }

    @Override
    public int update(Student student) {
        String query="update student set name=?,city=? where id=?";
       return jdbcTemplate.update(query,student.getName(),student.getCity(),student.getId());
    }

    @Override
    public int delete(int id) {
        String query="delete from student where id = ?;";
        return jdbcTemplate.update(query,id);
    }

    @Override
    public List<Student> getStudents() {
        String query="select * from student;";
        return jdbcTemplate.query(query,new RowMapperImp());
    }

    @Override
    public Student getStudent(int id) {
        String query="select * from student where id=?;";
        RowMapper<Student> rowMapper=new org.example.jdbc.RowMapperImp();
        return jdbcTemplate.queryForObject(query,rowMapper,id);
    }

    public JdbcTemplate getJdbcTemplate() {

        return jdbcTemplate;
    }

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }
}
