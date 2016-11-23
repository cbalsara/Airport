package com.example.user.airport;

/**
 * Created by user on 23/11/2016.
 */

public class Passenger {

    protected String name;
    protected int age;
    protected String ticket;

    public Passenger( String personName, int personAge, String ticketType ){
        this.name = personName;
        this.age = personAge;
        this.ticket = ticketType;
    }

    public String getName(){
        return this.name;
    }

    public int getAge(){
        return this.age;
    }

    public String getTicketType(){
        return this.ticket;
    }




}
