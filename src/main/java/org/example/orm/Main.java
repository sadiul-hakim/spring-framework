package org.example.orm;


import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ormConfig.xml");
        StudentDao studentDao = context.getBean("studentDao", StudentDao.class);

        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        boolean go_break=false;
        while (!go_break){
            int selectedOption=showMenu(reader);

            switch (selectedOption){
                case 1:
                    System.out.println("Enter student Id : ");
                    int id=Integer.parseInt(reader.readLine());
                    System.out.println("Enter student name : ");
                    String name= reader.readLine();
                    System.out.println("Enter student city : ");
                    String city= reader.readLine();

                    int res=studentDao.insert(new Student(id,name,city));

                    if(res>0){
                        System.out.println("Student saved successfully. Result : "+res);
                    }else{
                        System.out.println("Count not save Student.Try again.");
                    }
                    break;
                case 2:
                    List<Student> allStudents=studentDao.getAllStudent();
                    for(Student st:allStudents){
                        System.out.println(st);
                    }
                    System.out.println();
                    break;
                case 3:
                    System.out.println("Enter student id : ");
                    int s_id=Integer.parseInt(reader.readLine());
                    System.out.println(studentDao.getStudent(s_id));
                    System.out.println();
                    break;
                case 4:
                    System.out.println("Enter student id : ");
                    int s_id_del=Integer.parseInt(reader.readLine());
                    studentDao.deleteStudent(s_id_del);
                    System.out.println("Student delete successfully");
                    break;
                case 5:
                    go_break=true;
                    break;
                default:
                    System.out.println("Invalid.Try again!");
            }
        }

    }

    private static int showMenu(BufferedReader reader) throws IOException {
        System.out.println("1. Add Student");
        System.out.println("2. Display All Student");
        System.out.println("3. Get Single Student");
        System.out.println("4. Delete Student");
        System.out.println("5. exit");

        return Integer.parseInt(reader.readLine());
    }
}
