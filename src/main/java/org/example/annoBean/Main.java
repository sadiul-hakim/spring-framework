package org.example.annoBean;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);
        Student std = context.getBean("std", Student.class);
        Person person=context.getBean("getPerson",Person.class);
        System.out.println(std);
    }
}
