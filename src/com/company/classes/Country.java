package com.company.classes;

public class Country {

    private String countryName;
    private String continentName;
    private int countOfInhabitants;
    private String phoneCode;
    private String capitalName;
    private String[] namesOfCities;

    public String getCountryName() {
        return countryName;
    }

    public String getContinentName() {
        return continentName;
    }

    public int getCountOfInhabitants() {
        return countOfInhabitants;
    }

    public String getPhoneCode() {
        return phoneCode;
    }

    public String getCapitalName() {
        return capitalName;
    }

    public String[] getNamesOfCities() {
        return namesOfCities;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public void setContinentName(String continentName) {
        this.continentName = continentName;
    }

    public void setCountOfInhabitants(int countOfInhabitants) {
        this.countOfInhabitants = countOfInhabitants;
    }

    public void setPhoneCode(String phoneCode) {
        this.phoneCode = phoneCode;
    }

    public void setCapitalName(String capitalName) {
        this.capitalName = capitalName;
    }

    public void setNamesOfCities(String[] namesOfCities) {
        this.namesOfCities = namesOfCities;
    }

    @Override
    public String toString() {
        return this.countryName;
    }
}
