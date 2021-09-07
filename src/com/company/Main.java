package com.company;

public class Main {

    public static void main(String[] args) {

        //checkpoint 2 Test case
Passenger person=new Passenger ("Rohini","New Delhi","Delhi",
        "Tanvi","987343241","xyz@gmail.com");

Flight SpiceJet=new Flight("A456","Spice Jet",500,78);

// checkpoint 3 Test Case
        Flight Indigo=new Flight("A986","Indigo",600,200);
        // Indigo.flightNumber="A456"; (Error while accessing private variables)
        Indigo.setAirline("British Airways");
        Indigo.getAirline();


    }



}
