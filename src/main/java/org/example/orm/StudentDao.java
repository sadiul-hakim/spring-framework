package org.example.orm;

import org.springframework.orm.hibernate5.HibernateTemplate;

import javax.transaction.Transactional;
import java.util.List;

public class StudentDao {

    private HibernateTemplate template;

    @Transactional
    public int insert(Student student){
        return (int)template.save(student);
    }

    public Student getStudent(int id){
        return template.get(Student.class,id);
    }

    public List<Student> getAllStudent(){
        return template.loadAll(Student.class);
    }

    @Transactional
    public void deleteStudent(int id){
        Student st=template.get(Student.class,id);
        template.delete(st);
    }

    @Transactional
    public void updateStudent(Student st){
        template.update(st);
    }

    public HibernateTemplate getTemplate() {
        return template;
    }


    public void setTemplate(HibernateTemplate template) {
        this.template = template;
    }
}
