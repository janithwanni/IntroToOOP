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
public class BankAccount {

    private String accountNumber;
    private double balance;
    private String nic;

    public BankAccount(String accountNumber, double balance, String nic) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.nic = nic;
    }

    @Override
    public String toString() {
        return "BankAccount{" + "accountNumber=" + accountNumber + ", balance=" + balance + ", nic=" + nic + '}';
    }
}
