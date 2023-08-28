package com.company.classes;

public class City {

    private String cityName;
    private String regionName;
    private String countryName;
    private int countOfInhabitants;
    private String ZIPCode;
    private String phoneCode;


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
