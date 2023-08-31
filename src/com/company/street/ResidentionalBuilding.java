package com.company.street;

public class ResidentionalBuilding extends Building{
    private int countOfInhabitants;

    public ResidentionalBuilding() {
        this.countOfInhabitants=0;
    }

    public ResidentionalBuilding(String address, int countOfInhabitants) {
        super(address);
        this.countOfInhabitants = countOfInhabitants;
    }

    public int getCountOfInhabitants() {
        return countOfInhabitants;
    }

    public void setCountOfInhabitants(int countOfInhabitants) {
        this.countOfInhabitants = countOfInhabitants;
    }

    @Override
    public String toString() {
        return "ResidentionalBuilding | " + address + " | " +countOfInhabitants;
    }
}
