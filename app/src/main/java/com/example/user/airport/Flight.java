package com.example.user.airport;

import java.util.ArrayList;

/**
 * Created by user on 23/11/2016.
 */

public class Flight {

    protected int flightNumber;
    protected String destination;
    protected ArrayList <Passenger> passengerList;


    public Flight(int number, String location){
        this.flightNumber = number;
        this.destination = location;
        this.passengerList = new ArrayList <Passenger>();
    }

    public int getFlightNumber(){
        return this.flightNumber;
    }

    public String getDestination(){
        return this.destination;
    }








}
