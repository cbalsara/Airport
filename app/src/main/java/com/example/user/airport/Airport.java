package com.example.user.airport;

import java.util.ArrayList;

/**
 * Created by user on 23/11/2016.
 */

public class Airport {

    protected ArrayList<Flight> flightList;

    public Airport() {
        this.flightList = new ArrayList<Flight>();
    }

    public int getSize() {
        return this.flightList.size();
    }

    public void addFlight(Flight plane) {
        this.flightList.add(plane);
    }

    //    figure out how to return something from the arrayList
    public Flight getFlight(int inputedFlightNumber) {

        for (int i = 0; i < flightList.size(); i++) {
            if (this.flightList.get(i).getFlightNumber() == inputedFlightNumber){
                return this.flightList.get(i);
            }
        }
        return null;
    }


    //list me all the passenger names of a particular flight






}
