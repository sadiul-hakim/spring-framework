package org.example.jdbc;

import java.util.List;

public interface StudentDao {
    public int insert(Student student);
    public int update(Student student);
    public int delete(int id);

    public List<Student> getStudents();
    public Student getStudent(int id);
}
