package com.example.user.airport;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by user on 23/11/2016.
 */

public class FlightTest {

    Flight flight;



    @Before
    public void Before(){
        flight = new Flight(4365, "London");
    }

    @Test
    public void TestFlightNumber(){
        assertEquals( 4365, flight.getFlightNumber() );
    }


}
