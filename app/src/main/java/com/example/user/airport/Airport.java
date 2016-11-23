package com.example.user.airport;

import java.util.ArrayList;

/**
 * Created by user on 23/11/2016.
 */

public class Airport {

    protected ArrayList<Flight> flightList;

    public Airport(){
        this.flightList = new ArrayList<Flight>();
    }

    public int getSize(){
        return this.flightList.size();
    }






}
