/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author TAMOJIT
 */
public class Q1 {
    public static void main(String[] args) {
        LoudHailer T1=new LoudHailer("Good");
        LoudHailer T2=new LoudHailer("Morning");
        LoudHailer T3=new LoudHailer("Kolkata");
        
        T1.start();
        T2.start();
        T3.start();
        
        T3.setPriority(5);
        
    }
    
}
