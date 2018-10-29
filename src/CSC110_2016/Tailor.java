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
public class Tailor extends Employee {
    public void cut(){
        System.out.println("Tailor cuts clothes");
    }
    @Override
    public void paySalary(){
        System.out.println("Tailor's salary +");
        super.paySalary();
    }
}
