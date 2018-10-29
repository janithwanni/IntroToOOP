/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CSC110_2017;

import java.util.Scanner;

/**
 *
 * @author JanithWanni
 */
public class UniStudent {
    public static void main(String[] args) {
        //a)
        Scanner sin = new Scanner(System.in);
        Student aStudent;
        System.out.println("Enter Full name");
        String fullName = sin.nextLine();
        System.out.println("Enter GPA");
        float gpa = sin.nextFloat();
        aStudent = new Student(fullName, gpa);
        //b)
        System.out.println("Initials:- "+aStudent.getInitials());
        System.out.println("Last Name:- "+aStudent.getLastName());
        //c)
        Student[] studentList = new Student[100];
        //d)
        studentList[4] = aStudent;
        //e)
        String searchName = sin.nextLine();
        /* this shall throw a null pointer exception as the problem tells us to assume that the list is filled */
        for(Student s:studentList){
            if(s.getLastName().equals(searchName)){
                System.out.println(s);
            }
        }
    }
}
