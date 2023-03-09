package org.example.beans;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.List;

public class Person  {
    private String name;
    private String personId;

    private Address address;

    private List<String> emailList;
    public Person() {
    }

    public Person(String name, String personId, Address address, List<String> emailList) {
        this.name = name;
        this.personId = personId;
        this.address = address;
        this.emailList = emailList;
    }

    public String getName() {
        return name;
    }

    public String getPersonId() {
        return personId;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", personId='" + personId + '\'' +
                ", address=" + address +
                ", emailList=" + emailList +
                '}';
    }


//    @Override
//    public void afterPropertiesSet() throws Exception {
//        System.out.println("Inside init Method.");
//    }
//
//    @Override
//    public void destroy() throws Exception {
//        System.out.println("Inside Destroy Method.");
//    }

    @PostConstruct
    public void init(){
        System.out.println("Inside init method");
    }

    @PreDestroy
    public void destroy(){
        System.out.println("Inside Destroy Method");
    }

}
