
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author TAMOJIT
 */

class Display {
    public void display(String txt){
        while (true){
            System.out.println(txt);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(LoudHailer.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}

class synhailer extends Thread{
    
    String txt;
    Display D;

    public synhailer(String txt, Display D) {
        this.txt = txt;
        this.D = D;
    }
    
    @Override
    public void run() {
        synchronized(D){
            D.display(this.txt);
        }
    }
    
    
}

public class Q2 {
    public static void main(String[] args) {
        synhailer T1=new synhailer("Good", new Display());
        synhailer T2=new synhailer("Morning", new Display());
        synhailer T3=new synhailer("Kolkata", new Display());
    
        T1.start();
        T2.start();
        T3.start();
    }
    
    
}
