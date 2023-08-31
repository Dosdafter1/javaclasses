package com.company.street;

public class Street {
    private Building[] buildings;

    public Street() {
        this.buildings=null;
    }

    public Street(Building[] buildings) {
        this.buildings = buildings;
    }

    public Building[] getBuildings() {
        return buildings;
    }

    public void setBuildings(Building[] buildings) {
        this.buildings = buildings;
    }

    public String[] getAddresses() {
        String[] result = null;
        if(buildings!=null) {
            result = new String[buildings.length];
            for(int index=0; index<result.length; index++) {
                result[index]=buildings[index].address;
            }
        }
        return result;
    }

    public String getBuildInfo(int index) {
        if(index >= buildings.length){
            return "Error, building not exist";
        }
        return buildings[index].toString();
    }

    public int getCountOfBuildings() {
        if(buildings==null) {
            return -1;
        }
        return buildings.length;
    }
}
