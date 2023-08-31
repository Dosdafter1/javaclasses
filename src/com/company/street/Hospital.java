package com.company.street;

public class Hospital extends Building{
    private HospitalType hospitalType;
    private String specialization;

    public Hospital() {
        this.hospitalType=null;
        this.specialization=null;
    }

    public Hospital(String address, HospitalType hospitalType, String specialization) {
        super(address);
        this.hospitalType = hospitalType;
        this.specialization = specialization;
    }

    public HospitalType getHospitalType() {
        return hospitalType;
    }

    public void setHospitalType(HospitalType hospitalType) {
        this.hospitalType = hospitalType;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    @Override
    public String toString() {
        return "Hospital | " + address + " | " + hospitalType + " | " + specialization;
    }
}
