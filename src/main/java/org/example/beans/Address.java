package org.example.beans;

public class Address {
    private int id;
    private String district;
    private String division;

    public Address() {
    }

    public Address(int id, String district, String division) {
        this.id = id;
        this.district = district;
        this.division = division;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
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
                "id=" + id +
                ", district='" + district + '\'' +
                ", division='" + division + '\'' +
                '}';
    }
}
