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
/*
======================== IMPORTANT ==================================
the error causing line will be commented out 
and the correct one will be inserted underneath with the proper comment
=====================================================================
*/
public abstract class Account {
    private String acc_no,cus_name;
    /* ================= ERROR CODE ============================
    private double balance;
    ============================================================ */
    /* ====== CORRECTED CODE ========= */
    protected double balance;
    /* =============================== */
    /* 
    =============== ERROR CODE ==============
    public void Account(){
        balance = 0.0;
        this("987","Mr. Test");
    }
    
    the reason why this is an error is because public void Account is an method 
    and therefore calling the constructor inside a method does not make sense
    also even inside the constructor 
    the first statement should be a call to another constructor should there be any
    ========================================
    */
    /* ====== CORRECTED CODE ========= */
    public Account(){
        this("987","Mr. Test");
        balance = 0.0;
    }
    /* =============================== */
    public Account(String no,String na){
        acc_no = no;
        cus_name = na;
        balance = 500.0;
    }
    public abstract boolean printInfo();
    /* ================= ERROR CODE ============================
    public final void print(){
    ============================================================ */
    /* ====== CORRECTED CODE ========= */
    public void print(){
    /* =============================== */
        System.out.println("Acc No : "+acc_no);
        System.out.println("Name : "+cus_name);
        System.out.println("Balance : "+balance);
    }
}
