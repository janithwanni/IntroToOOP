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
public class JuniorSaver extends SavingsAccount {
    private String parentNIC;
    private String schoolName;
    private String dob;

    public JuniorSaver(String parentNIC, String schoolName, String dob, double annualInterestRate, String accountNumber, double balance, String nic) {
        super(annualInterestRate, accountNumber, balance, nic);
        this.parentNIC = parentNIC;
        this.schoolName = schoolName;
        this.dob = dob;
    }

    @Override
    public String toString() {
        return super.toString()+"JuniorSaver{" + "parentNIC=" + parentNIC + ", schoolName=" + schoolName + ", dob=" + dob + '}';
    }
    
}
