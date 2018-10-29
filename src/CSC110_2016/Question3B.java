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
public class Question3B {
    public static void main(String[] args) {
        Employee emp1 = new Employee();
        Employee emp2 = new Barber();
        Employee emp3  = new Tailor();
        emp1.paySalary();
        emp2.paySalary();
        emp1.print();
        emp2.print();
        //emp1.cut(); this throws an error of method not found
        //((Tailor) emp1).cut();
        //((Barber) emp2).cut(); these two throw errors as well because employee can not be cast to Tailor Type 
        //simply put every tailor is an employee but not every employee is a tailor
    }
}
