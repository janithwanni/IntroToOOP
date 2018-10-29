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
public class TestExceptions {
    public static void solveEquation(){
        System.out.println("Starting to solve");
        try{
            findSolution();
        }catch(Exception e){
            System.out.println("Caught an error");
            System.out.println(e.getMessage());
        }
        System.out.println("End solving");
    }
    public static void findSolution(){
        System.out.println("Finding a solution");
        try{
            search();
        }catch(ArithmeticException e){
            System.out.println("Not an arithmetic "+"expresion");
            System.out.println(e.getMessage());
        }
        System.out.println("end of solution");
    }
    public static void search(){
        System.out.println("Start searching");
        throw new RuntimeException("Value not found");
    }
    public static void main(String[] args) {
        solveEquation();
    }
}
