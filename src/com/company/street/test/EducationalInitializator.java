package com.company.street.test;

import com.company.street.Acreditation;
import com.company.street.EducationalInstitution;

public class EducationalInitializator {
    private EducationalInstitution[] educationalInstitutions = {
        new EducationalInstitution("et 1", Acreditation.ACADEMY, 100),
            new EducationalInstitution("et 2", Acreditation.INSTITUTE, 200),
            new EducationalInstitution("et 3", Acreditation.COLLEGE, 150),
            new EducationalInstitution("et 4", Acreditation.GYMNASIUM, 100),
            new EducationalInstitution("et 5", Acreditation.LYCEUM, 170),
            new EducationalInstitution("et 6", Acreditation.SCHOOL, 500),
            new EducationalInstitution("et 7", Acreditation.TECHNICAL_SCHOOL, 800),
            new EducationalInstitution("et 8", Acreditation.UNIVERSITY, 400),
    };

    public EducationalInstitution[] getEducationalInstitutions (int count)
    {
        if(count==0){
            return null;
        }
        int size;
        if(count > educationalInstitutions.length){
            size = educationalInstitutions.length;
        }
        else {
            size = count;
        }
        EducationalInstitution[] result = new EducationalInstitution[size];
        for(int index=0;index < size;index++) {
            result[index]=educationalInstitutions[index];
        }
        return result;
    }

}
