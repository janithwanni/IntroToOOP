/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CSC110_2017;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author JanithWanni
 */
public class Question4 {
    /*
    the points to understand is that 
        part1.txt has the order of the index number that we need to print.
        no need to store the data as we can write to file while reading
    */
    public static void main(String[] args) {
        Scanner sin1 = null;
        Scanner sin2 = null;
        PrintWriter pout = null;
        try {
            sin1 = new Scanner(new File("src\\CSC110_2017\\part1.txt"));
            sin2 = new Scanner(new File("src\\CSC110_2017\\part2.txt"));
            pout = new PrintWriter(new File("src\\CSC110_2017\\finalMarks.txt"));
            while(sin1.hasNextLine() && sin2.hasNextLine()){
                String line1 = sin1.nextLine();
                String line2 = sin2.nextLine();
                String[] splits1 = line1.split(" ");
                String[] splits2 = line2.split(" ");
                if(splits1[0].equals(splits2[0])){
                    int p1 = Integer.parseInt(splits1[1]);
                    int p2 = Integer.parseInt(splits2[1]);
                    double finalMarks = 0.4*p1+0.6*p2;
                    pout.println(String.format("%s %.2f",splits1[0],finalMarks));
                }else{
                    pout.println(String.format("%s %d",splits1[0],-1));
                }
            }
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        }
        finally{
            if(sin1 != null) sin1.close();
            if(sin2 != null) sin2.close();
            if(pout != null ) pout.close();
        }
    }
    
}
