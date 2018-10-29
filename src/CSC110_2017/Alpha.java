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
public class Alpha {
    private String name;
    public void goUp(){
        System.out.println("Alpha - up");
    }
    public void goDown(){
        System.out.println("Alpha - down");
    }
    @Override
    public String toString(){
        return "Alpha";
    }
}
