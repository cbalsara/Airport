package com.example.user.airport;

import android.view.ViewDebug;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by user on 23/11/2016.
 */

public class PassengerTest {

    Passenger passenger1;
    Passenger passenger2;
    Passenger passenger3;

    @Before
    public void Before(){
        passenger1 = new Passenger("Tim", 23, "Economy");
        passenger2 = new Passenger("Tom", 32, "Business");
        passenger3 = new Passenger("Jon", 42, "First");
    }

    @Test
    public void testHasName(){
        assertEquals( "Tim", passenger1.getName() );
    }

    @Test
    public void testHasAge(){
        assertEquals( 32, passenger2.getAge() );
    }

    @Test
    public void testTicketType(){
        assertEquals( "First", passenger3.getTicketType() );
    }




}
