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
public class Greek {
    public static void main(String[] args) {
        Alpha[] greeks = {new Alpha(),new Beta(),new Gamma(), new Delta()};
        for(Alpha greek:greeks){
            greek.goUp();
            greek.goDown();
            System.out.println(greek);
            System.out.println("*");
        }
    }
}
