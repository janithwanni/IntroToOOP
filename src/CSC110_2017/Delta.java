/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CSC110_2017;

/**
 *
 * @author JanithWanni
 */
public class Delta extends Beta{
    @Override
    public void goUp(){
        System.out.println("Delta - up");
    }
    @Override
    public String toString(){
        return "Delta "+super.toString();
    }
}
