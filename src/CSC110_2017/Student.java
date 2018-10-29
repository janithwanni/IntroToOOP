/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CSC110_2017;

/**
 *
 * @author JanithWanni
 */
//Student class
public class Student {

    private String fullName;
    private float gpa;

    public Student() {
        setFullName("Not Assigned");
        setGpa(0.0f);
    }

    public Student(String fullName, float gpa) {
        setFullName(fullName);
        setGpa(gpa);
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        if (fullName.equals("")) {
            this.fullName = fullName;
        } else {
            this.fullName = fullName;
        }
    }

    public float getGpa() {
        return gpa;
    }

    public void setGpa(float gpa) {
        if(gpa <= 4.0 && gpa >= 0.0 ){
            this.gpa = 0.0f;
        }else{
            this.gpa = gpa;
        }
    }
    public String getInitials(){
        String splits[] = getFullName().split(" ");
        String initials = "";
        for(int i = 0;i<splits.length-1;i++){
            initials += splits[i].toUpperCase().charAt(0)+".";
        }
        return initials;
    }
    public String getLastName(){
        String splits[] = getFullName().split(" ");
        return splits[splits.length-1];
    }

    @Override
    public String toString() {
        return "Student{" + "fullName=" + fullName + ", gpa=" + gpa + '}';
    }
}
