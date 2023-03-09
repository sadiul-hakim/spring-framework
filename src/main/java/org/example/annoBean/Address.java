package org.example.annoBean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("annoAddress")
public class Address {
    @Value("Kushtia")
    private String city;
    @Value("Khulna")
    private String division;

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getDivision() {
        return division;
    }

    public void setDivision(String division) {
        this.division = division;
    }

    @Override
    public String toString() {
        return "Address{" +
                "city='" + city + '\'' +
                ", division='" + division + '\'' +
                '}';
    }
}
