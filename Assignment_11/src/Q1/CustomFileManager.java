/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Q1;

import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author TAMOJIT
 */
public class CustomFileManager {
    public static void main(String[] args){
        try {
            FileReader fr=new FileReader("numbers.txt");
            BufferedReader br=new BufferedReader(fr);
            while (true){
                String s=br.readLine();
                if (s==null){
                    break;
                }
                double x=Double.parseDouble(s);
                if (x<0){
                    throw new CustomNegativeNumberException(x);
                }else{
                    System.out.println(x);
                }
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(CustomFileManager.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(CustomFileManager.class.getName()).log(Level.SEVERE, null, ex);
        } catch (CustomNegativeNumberException ex) {
            Logger.getLogger(CustomFileManager.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
