package com.company.street.test;

import com.company.street.Hospital;
import com.company.street.HospitalType;

public class HospitalInitializator {
    private Hospital[] hospitals = {new Hospital("th 1", HospitalType.SINGLE_PROFILE, "test"),
                                    new Hospital("th 2", HospitalType.SPECIAL_TYPE, "test2"),
                                    new Hospital("th 3", HospitalType.MULTIDISCIPLINARY, "test3"),
                                    new Hospital("th 4", HospitalType.SPECIALIZED, "test4"),
                                    new Hospital("th 5", HospitalType.SINGLE_PROFILE, "test5")};

    public Hospital[] getHospitals (int count)
    {
        if(count==0){
            return null;
        }
        int size;
        if(count > hospitals.length){
            size = hospitals.length;
        }
        else {
            size = count;
        }
        Hospital[] result = new Hospital[size];
        for(int index=0;index < size;index++) {
            result[index]=hospitals[index];
        }
        return result;
    }
}
