/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CSC110_2016;

/**
 *
 * @author JanithWanni
 */
public class UniversityStaff {
    private String lastName;
    private String initials;
    private String designation;
    private int yearsOfService;

    public UniversityStaff(String lastName, String initials, String designation, int yearsOfService) {
        this.lastName = lastName;
        this.initials = initials;
        this.designation = designation;
        this.yearsOfService = yearsOfService;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public void setYearsOfService(int yearsOfService) {
        this.yearsOfService = yearsOfService;
    }

    public String getLastName() {
        return lastName;
    }

    public String getInitials() {
        return initials;
    }

    public String getDesignation() {
        return designation;
    }

    public int getYearsOfService() {
        return yearsOfService;
    }

    @Override
    public String toString() {
        return "UniversityStaff{" + "lastName=" + lastName + ", initials=" + initials + ", designation=" + designation + ", yearsOfService=" + yearsOfService + '}';
    }
}
