/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Q1;

/**
 *
 * @author TAMOJIT
 */
public class CustomNegativeNumberException extends Exception{
    
    double X;

    public CustomNegativeNumberException(double x) {
        this.X=x;
    }

    @Override
    public String toString() {
        return "NegativeNumber "+this.X+" detected."; //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
