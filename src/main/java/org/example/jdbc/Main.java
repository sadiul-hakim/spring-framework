package org.example.jdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("jdbcConfig.xml");

        StudentDoaImp studentDoaImp = context.getBean("studentDoaImp", StudentDoaImp.class);
        List<Student> studentList=studentDoaImp.getStudents();
        System.out.println(studentList);
    }
}
