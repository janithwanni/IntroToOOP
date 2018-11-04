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
public class Question2_Account {

    public String acc_no, cus_name;
    public double balance;

    public Question2_Account() {
        acc_no = "987";
        cus_name = "Mr. Test";
        balance = 0.0;
    }
    
    public Question2_Account(String no,String na){
        acc_no = no;
        cus_name = na;
        balance = 500.0;
    }
    public void printInfo(){
        System.out.println("Acc No"+acc_no);
        System.out.println("Name:"+cus_name);
        System.out.println("Balance"+balance);
    }
    public static void main(String[] args) {
        Question2_Account a1 = new Question2_Account();
        a1.printInfo();
        Question2_Account a2 = new Question2_Account("147","Ms.Perera");
        a2.printInfo();
    }
}
