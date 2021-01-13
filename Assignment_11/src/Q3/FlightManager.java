/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Q3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author TAMOJIT
 */
public class FlightManager {
    static Flight readLine(String line){
        String[] row = line.split("\\|");
        String[] timings = row[3].split("/");
        return new Flight(row[0],row[1],row[2],timings[0],timings[1]);
    }

    static String writeLine(Flight flight){
        String timings = String.join("/",flight.getDepTime(), flight.getArrTime());
        String row = String.join("/",flight.getDepCity(), flight.getDaysOfWeek(), flight.getFlightNum(),timings);
        return row;
    }

    static ArrayList<Flight> sortArray(ArrayList<Flight> flights){
        Collections.sort(flights);
        return flights;
    }

    public static void main(String[] args) {
        ArrayList<Flight> flights = new ArrayList<Flight>();
        try {
            FileReader fr = new FileReader("2015.silkair.csv");
            BufferedReader br = new BufferedReader(fr);
            String line = br.readLine();
            while(line!=null){
                flights.add(readLine(line));
                line = br.readLine();
            }
            br.close();
            fr.close();

            sortArray(flights);

            FileWriter fw = new FileWriter("sorted.2015.silkair.csv");
            BufferedWriter bw = new BufferedWriter(fw);
            for (Flight flight: flights) {
                bw.write(writeLine(flight) + "\n");
            }
            bw.close();
            fw.close();

        } catch (FileNotFoundException e) {
            System.err.println("File not found");
        } catch (IOException e) {
            System.err.println(e);
        }

    }
}
