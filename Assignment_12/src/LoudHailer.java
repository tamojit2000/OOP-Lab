
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
public class LoudHailer extends Thread{
    String txt;

    public LoudHailer(String txt) {
        this.txt=txt;
    }

    @Override
    public void run() {
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
