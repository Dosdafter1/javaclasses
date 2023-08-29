package com.company.classes;

public class Car {
    private String modelName;
    private String manufacturer;
    private int year;
    private double engineVolume;

    public Car() {
        this.modelName=null;
        this.manufacturer=null;
        this.year=0;
        this.engineVolume=0;
    }

    public Car(String modelName, String manufacturer, int year, double engineVolume) {
        this.modelName = modelName;
        this.manufacturer = manufacturer;
        this.year = year;
        this.engineVolume = engineVolume;
    }

    public String getModelName() {
        return modelName;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public int getYear() {
        return year;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setEngineVolume(double engineVolume) {
        this.engineVolume = engineVolume;
    }

    @Override
    public String toString() {
        return ""+this.modelName+" "+this.manufacturer+" "+this.engineVolume;
    }
}
