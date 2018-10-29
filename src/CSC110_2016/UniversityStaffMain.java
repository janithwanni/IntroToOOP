/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CSC110_2016;

import java.util.Scanner;

/**
 *
 * @author JanithWanni
 */
public class UniversityStaffMain {
    public static void main(String[] args) {
        //a)
        UniversityStaff[] members = new UniversityStaff[100];
        //b)
        Scanner sin = new Scanner(System.in);
        for (int i = 0; i < 100; i++) {
            System.out.println("Enter the Designation");
            String designation = sin.nextLine();
            System.out.println("Enter the Initials");
            String initials = sin.nextLine();
            System.out.println("Enter the Last Name");
            String lastName = sin.nextLine();
            System.out.println("Enter the years of service");
            int yearsOfService = sin.nextInt();
            members[i] = new UniversityStaff(lastName, initials, designation, yearsOfService);
        }
        //c)
        for(UniversityStaff member: members){
            System.out.println(member);
        }
        //d)
        for(UniversityStaff member:members){
            if(member.getYearsOfService() >= 25){
                System.out.println(String.format("%s %s %s",member.getInitials(),member.getLastName(),member.getDesignation()));
            }
        }
    }
}
