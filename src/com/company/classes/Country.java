package com.company.classes;

public class Country {

    private String countryName;
    private String continentName;
    private String phoneCode;
    private String capitalName;
    private String[] namesOfCities;
    private int countOfInhabitants;

    public Country() {
        this.countryName=null;
        this.continentName=null;
        this.phoneCode=null;
        this.capitalName=null;
        this.namesOfCities=null;
        this.countOfInhabitants=0;
    }

    public Country(String countryName, String continentName, String capitalName) {
        this.countryName = countryName;
        this.continentName = continentName;
        this.capitalName = capitalName;
    }

    public Country(String countryName, String continentName, String phoneCode, String capitalName, String[] namesOfCities) {
        this(countryName,continentName,capitalName);
        this.phoneCode = phoneCode;
        this.namesOfCities = namesOfCities;
    }

    public Country(String countryName, String continentName, String phoneCode, String capitalName, String[] namesOfCities, int countOfInhabitants) {
        this(countryName,continentName,capitalName,phoneCode,namesOfCities);
        this.countOfInhabitants = countOfInhabitants;
    }

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
