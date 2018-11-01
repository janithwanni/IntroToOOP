/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CSC110_2014;

/**
 *
 * @author JanithWanni
 */
public class Student extends Person{
    private int marks;
    private char grade;

    public Student(){
        this(75,'A',"AS2014123");
    }
    public Student(int marks, char grade, String indexNo) {
        super(indexNo);
        this.marks = marks;
        this.grade = grade;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    public char getGrade() {
        return grade;
    }

    public void setGrade(char grade) {
        this.grade = grade;
    }
    @Override
    public void tostring() {
        System.out.println("Student{" + "marks=" + marks + ", grade=" + grade + '}');
    }

}
