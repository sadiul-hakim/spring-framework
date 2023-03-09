package org.example.annoBean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "org.example.annoBean")
public class JavaConfig {

    @Bean
    public Person getPerson(){
        Person person=new Person("Hakim",1);

        return person;
    }
}