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
public class Question4Driver {
    public static void main(String[] args) {
        String indexNo = "AS2014123";
        double GPA = 3.5;
        SJP sjp = new SJP(indexNo, GPA);
        CMB cmb = new CMB(indexNo, GPA);
        print(sjp);
        print(cmb);
    }
    public static void print(UniStu unistu){
        System.out.println(unistu);
    }
}
