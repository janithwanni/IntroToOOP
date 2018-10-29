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
public class Beta extends Alpha {
    private String game;
    public void goDown(){
        goUp();
        System.out.println("Beta - down");
    }
    @Override
    public String toString(){
        return "Beta";
    }
}
