package com.example.user.airport;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by user on 23/11/2016.
 */

public class FlightTest {

    Flight flight1;
    Flight flight2;




    @Before
    public void Before(){
        flight1 = new Flight(4365, "London");
        flight2 = new Flight(3573, "Tokyo");
    }

    @Test
    public void TestFlightNumber(){
        assertEquals( 3573, flight2.getFlightNumber() );
    }

    @Test
    public void TestFlightDestination(){
        assertEquals( "London", flight1.getDestination() );
    }


}
