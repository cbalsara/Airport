package com.example.user.airport;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by user on 23/11/2016.
 */

public class AirportTest {

    Airport airport;
    Flight flight1;
    Flight flight2;


    @Before
    public void Before(){
        airport = new Airport();
        flight1 = new Flight(3456, "Madrid");
        flight2 = new Flight(9876, "Chicago");
    }

    @Test
    public void TestEmptyAirport(){
        assertEquals( 0, airport.getSize() );
    }

    @Test
    public void TestAddFlight(){
        airport.addFlight(flight1);
        assertEquals( 1, airport.getSize() );
    }

    @Test
    public void TestFlightNumber(){
        airport.addFlight(flight1);
        airport.addFlight(flight2);
//        airport.getFlight(3456);
        assertEquals(3456, airport.getFlight(3456).getFlightNumber() );
//        assertEquals( 3456, flight1.getFlightNumber() );
    }


}
