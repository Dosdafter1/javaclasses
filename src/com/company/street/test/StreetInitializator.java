package com.company.street.test;

import com.company.street.*;

import java.util.ArrayList;
import java.util.Arrays;

public class StreetInitializator {
    private EducationalInitializator educationalInitializator;
    private  HospitalInitializator hospitalInitializator;
    private ShopInitializator shopInitializator;
    private ResidentInitializator residentInitializator;

    public StreetInitializator() {
        this.educationalInitializator=new EducationalInitializator();
        this.hospitalInitializator = new HospitalInitializator();
        this.shopInitializator = new ShopInitializator();
        this.residentInitializator = new ResidentInitializator();
    }

    public Street InitStreet(int s, int e, int h, int r) {
        Shop[] shops = null;
        EducationalInstitution[] educationals = null;
        ResidentionalBuilding[] residents = null;
        Hospital[] hospitals = null;
        ArrayList<Building> buildings = new ArrayList<Building>();
        int totalSize=0;
        if(s!=0) {
            shops = shopInitializator.getShops(s);
            totalSize+=shops.length;
            buildings.addAll(Arrays.asList(shops));
        }
        if(e!=0) {
            educationals = educationalInitializator.getEducationalInstitutions(e);
            totalSize+=educationals.length;
            buildings.addAll(Arrays.asList(educationals));
        }
        if(h!=0) {
            hospitals = hospitalInitializator.getHospitals(h);
            totalSize+=hospitals.length;
            buildings.addAll(Arrays.asList(hospitals));
        }
        if(r!=0) {
            residents = residentInitializator.getResidentionalBuildings(r);
            totalSize+=residents.length;
            buildings.addAll(Arrays.asList(residents));
        }

        return new Street(buildings.toArray(new Building[totalSize]));
    }
}
