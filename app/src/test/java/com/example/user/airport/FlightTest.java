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
    Passenger passenger1;
    Passenger passenger2;


    @Before
    public void Before(){
        flight1 = new Flight(4365, "London");
        flight2 = new Flight(3573, "Tokyo");
        passenger1 = new Passenger("Billy", 54, "Economy");
        passenger2 = new Passenger("Tony", 32, "First");
    }

    @Test
    public void testFlightNumber(){
        assertEquals( 3573, flight2.getFlightNumber() );
    }

    @Test
    public void testFlightDestination(){
        assertEquals( "London", flight1.getDestination() );
    }

    @Test
    public void testFlightIsEmpty(){
        assertEquals( 0, flight1.getSize() );
    }

    @Test
    public void testAddPassenger(){
        flight1.addPassenger(passenger1);
        assertEquals( 1, flight1.getSize() ) ;
    }

    @Test
    public void testGetPassengerOnFlight(){
        flight1.addPassenger(passenger1);
        flight1.addPassenger(passenger2);
        assertEquals("Tony", flight1.getPassenger("Tony").getName() );
    }


}
