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
public abstract class Person {
    private String indexNo;
    public int count;

    public Person(String indexNo) {
        this.indexNo = indexNo;
        this.count++;
    }
    //since this is not allowed we will change the name toString to tostring
    public abstract void tostring();
    public String getIndexNo() {
        return indexNo;
    }

    public void setIndexNo(String indexNo) {
        this.indexNo = indexNo;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
    
}
