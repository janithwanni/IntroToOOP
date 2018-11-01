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
I'm not entirely sure of the code errors and the expected output of this 
the error causing line will be commented out 
and the correct one will be inserted underneath with the proper comment
=====================================================================
*/
/* ========= ERROR CODE ================
public class Saving implements Account {
Account is an abstract class and therefore has to be extended
======================================== */
/* ====== CORRECTED CODE ========= */
public class Saving extends Account{
/* =============================== */
    public static double iRate;
    
    public Saving(String no, String na){
        /* =============== ERROR CODE ===========
        this(no,na);
        ========================================= */
        /* ====== CORRECTED CODE ========= */
        super(no,na);
        /* =============================== */
        balance = 2000.0;
        iRate = 0.2;
    }
    public void print(){
        System.out.println("int rate" + iRate);
        System.out.println("int :"+balance*iRate);
    }
    /* ============ ERROR CODE ==================
    not providing an implementation of the 
    */
    /* ====== CORRECTED CODE ========= */
    @Override
    public boolean printInfo(){
        return false;
    }
    /* ============================== */
    public static void main(String[] args) {
        /* ================= ERROR CODE =============== 
        Account acc1 = new Account();
         ============================================ */
        Saving acc1 = new Saving("","");
        acc1.iRate = 0.3;
        acc1.print();
        acc1.printInfo();
    }
}
