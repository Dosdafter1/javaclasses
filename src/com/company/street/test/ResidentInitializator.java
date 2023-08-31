package com.company.street.test;

import com.company.street.ResidentionalBuilding;

public class ResidentInitializator {
    private ResidentionalBuilding[] buildings = {
            new ResidentionalBuilding("rt 1", 200),
            new ResidentionalBuilding("rt 2", 100),
            new ResidentionalBuilding("rt 3", 360),
            new ResidentionalBuilding("rt 4", 550),
            new ResidentionalBuilding("rt 5", 500),
    };

    public ResidentionalBuilding[] getResidentionalBuildings (int count)
    {
        if(count==0){
            return null;
        }
        int size;
        if(count > buildings.length){
            size = buildings.length;
        }
        else {
            size = count;
        }
        ResidentionalBuilding[] result = new ResidentionalBuilding[size];
        for(int index=0;index < size;index++) {
            result[index]=buildings[index];
        }
        return result;
    }
}
