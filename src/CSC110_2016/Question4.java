/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CSC110_2016;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author JanithWanni
 */
public class Question4 {
    public static void main(String[] args) {
        Scanner sin = null;
        PrintWriter pout = null;
        PrintWriter nout = null;
        int pcount = 0,ncount = 0;
        try{
            sin = new Scanner(new File("src\\CSC110_2016\\numbers.txt"));
            pout = new PrintWriter(new File("src\\CSC110_2016\\positive.txt"));
            nout = new PrintWriter(new File("src\\CSC110_2016\\negative.txt"));
            while(sin.hasNext()){
                String numstr = sin.nextLine();
                int num = Integer.parseInt(numstr);
                System.out.println(num);
                if(num < 0){
                    ncount++;
                    nout.println(num);
                }else if(num > 0){
                    pcount++;
                    pout.println(num);
                }else{
                }
            }
            pout.println();
            pout.println(pcount);
            nout.println();
            nout.println(ncount);
        }catch(FileNotFoundException e){
            e.printStackTrace();
        }finally{
            if(pout != null) pout.close();
            if(nout != null) nout.close();
            if(sin != null) sin.close();
        }
    }
}
