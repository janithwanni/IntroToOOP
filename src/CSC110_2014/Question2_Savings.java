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
public class Question2_Savings extends Question2_Account{
    public double iRate;
    public Question2_Savings(){
        this("654","Mr. Saving");
        balance = 1000.0;
        iRate = 0.1;
    }
    public Question2_Savings(String no, String na){
        super(no,na);
        balance = 2000.0;
        iRate = 0.2;
    }
    public void printInfo(){
        System.out.println("Int Rate:"+iRate);
        System.out.println("int "+balance*iRate);
    }
    public static void main(String[] args) {
        Question2_Savings s1 = new Question2_Savings();
        s1.printInfo();
        Question2_Savings s2 = new Question2_Savings("258", "Dr. Silva");
        s2.printInfo();
    }
}
