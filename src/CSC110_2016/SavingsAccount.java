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
public class SavingsAccount extends BankAccount{
    private double annualInterestRate;

    public SavingsAccount(double annualInterestRate, String accountNumber, double balance, String nic) {
        super(accountNumber, balance, nic);
        this.annualInterestRate = annualInterestRate;
    }

    @Override
    public String toString() {
        return super.toString()+"SavingsAccount{" + "annualInterestRate=" + annualInterestRate + '}';
    }
    
}
