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
public class Question2BApplication {
    public static void main(String[] args) {
        //add some dummy content here, i really cant be that creative for this one :3
        String accountNumber = "";
        String nic = "";
        double annualInterestRate = 0;
        double balance = 0;
        String schoolName = "";
        String dob = "";
        SavingsAccount sa = new SavingsAccount(annualInterestRate, accountNumber, balance, nic);
        JuniorSaver js = new JuniorSaver(nic, schoolName, dob, annualInterestRate, accountNumber, balance, nic);
        System.out.println(sa);
        System.out.println(js);
    }
}
