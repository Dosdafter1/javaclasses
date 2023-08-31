package com.company.street;

public abstract class Building {
    protected String address;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Building() {
        this.address = null;
    }
    public Building(String address) {
        this.address = address;
    }
}
