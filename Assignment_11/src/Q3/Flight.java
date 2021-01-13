/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Q3;

/**
 *
 * @author TAMOJIT
 */
public class Flight implements Comparable<Flight>{
    private String depCity;
    private String daysOfWeek;
    private String flightNum;
    private String depTime;
    private String arrTime;

    public Flight(String depCity, String daysOfWeek, String flightNum, String depTime, String arrTime) {
        this.depCity = depCity;
        this.daysOfWeek = daysOfWeek;
        this.flightNum = flightNum;
        this.depTime = depTime;
        this.arrTime = arrTime;
    }

    public String getDepCity() {
        return depCity;
    }

    public String getDaysOfWeek() {
        return daysOfWeek;
    }

    public String getFlightNum() {
        return flightNum;
    }

    public String getDepTime() {
        return depTime;
    }

    public String getArrTime() {
        return arrTime;
    }
    
    

    @Override
    public int compareTo(Flight o) {
        return this.flightNum.compareTo(o.getFlightNum()); //To change body of generated methods, choose Tools | Templates.
    }
    
}
