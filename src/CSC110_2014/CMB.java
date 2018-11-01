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
public class CMB extends UniStu {

    public CMB(String indexNo,double gpa) {
        setIndexNo(indexNo);
        setGPA(gpa);
        findGrade();
    }

    
    @Override
    public void findGrade() {
        int gradeCat = ((int)getGPA()) % 10;
        if(gradeCat <= 4){
            //F
            setGrade('F');
        }else if(gradeCat <= 5){
            //C
            setGrade('S');
        }else if(gradeCat <= 6){
            //B
            setGrade('C');
        }else if(gradeCat <= 7){
            //A
            setGrade('D');
        }
    }
    
}
