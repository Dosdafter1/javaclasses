package com.company.classes;

import java.util.Date;

public class Human {

    private String firstName;
    private String fatherName;
    private String lastName;
    private Date birthDate;
    private String phone;
    private City city;
    private Country country;
    private String address;

    public String getFirstName() {
        return firstName;
    }

    public String getFatherName() {
        return fatherName;
    }

    public String getLastName() {
        return lastName;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public String getPhone() {
        return phone;
    }

    public City getCity() {
        return city;
    }

    public Country getCountry() {
        return country;
    }

    public String getAddress() {
        return address;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setFatherName(String fatherName) {
        this.fatherName = fatherName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setCity(City city) {
        this.city = city;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    public void setAddress(String address) {
        this.address = address;
    }



    @Override
    public String toString() {
        return ""+this.firstName+" "+this.fatherName+" "+this.lastName;
    }
}
