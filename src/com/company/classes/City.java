package com.company.classes;

public class City {

    private String cityName;
    private String regionName;
    private String countryName;
    private String ZIPCode;
    private String phoneCode;
    private int countOfInhabitants;

    public City() {
        this.cityName=null;
        this.regionName=null;
        this.countryName=null;
        this.ZIPCode=null;
        this.phoneCode=null;
        this.countOfInhabitants=0;
    }

    public City(String cityName, String regionName, String countryName) {
        this.cityName = cityName;
        this.regionName = regionName;
        this.countryName = countryName;
    }

    public City(String cityName, String regionName, String countryName, String ZIPCode, String phoneCode) {
        this(cityName,regionName,countryName);
        this.ZIPCode = ZIPCode;
        this.phoneCode = phoneCode;
    }

    public City(String cityName, String regionName, String countryName, String ZIPCode, String phoneCode, int countOfInhabitants) {
        this(cityName,regionName,countryName,ZIPCode,phoneCode);
        this.countOfInhabitants = countOfInhabitants;
    }

    public String getPhoneCode() {
        return phoneCode;
    }

    public String getCityName() {
        return cityName;
    }

    public String getRegionName() {
        return regionName;
    }

    public String getCountryName() {
        return countryName;
    }

    public int getCountOfInhabitants() {
        return countOfInhabitants;
    }

    public String getZIPCode() {
        return ZIPCode;
    }

    public void setPhoneCode(String phoneCode) {
        this.phoneCode = phoneCode;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public void setRegionName(String regionName) {
        this.regionName = regionName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public void setCountOfInhabitants(int countOfInhabitants) {
        this.countOfInhabitants = countOfInhabitants;
    }

    public void setZIPCode(String ZIPCode) {
        this.ZIPCode = ZIPCode;
    }

    @Override
    public String toString() {
        return this.cityName;
    }
}
