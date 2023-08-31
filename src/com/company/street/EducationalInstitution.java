package com.company.street;

public class EducationalInstitution extends Building{
    private Acreditation acreditation;
    private int countOfStudents;

    public EducationalInstitution() {
        this.acreditation=null;
        this.countOfStudents=0;
    }

    public EducationalInstitution(String address, Acreditation acreditation, int countOfStudents) {
        super(address);
        this.acreditation = acreditation;
        this.countOfStudents = countOfStudents;
    }

    public Acreditation getAcreditation() {
        return acreditation;
    }

    public void setAcreditation(Acreditation acreditation) {
        this.acreditation = acreditation;
    }

    public int getCountOfStudents() {
        return countOfStudents;
    }

    public void setCountOfStudents(int countOfStudents) {
        this.countOfStudents = countOfStudents;
    }

    @Override
    public String toString() {
        return "EducationalInstitution | " + address + " | " + acreditation + " | " + countOfStudents;
    }
}
