package com.example.user.airport;

/**
 * Created by user on 23/11/2016.
 */

public class Flight {

    protected int flightNumber;
    protected String destination;


    public Flight(int number, String location){
        this.flightNumber = number;
        this.destination = location;
    }

    public int getFlightNumber(){
        return this.flightNumber;
    }

    public String getDestination(){
        return this.destination;
    }








}
