package com.kodilla.exception.test;

public class FlightFinderMain {

    public static void main(String[] args) {

        FlightFinder flightFinder = new FlightFinder();
        Flight flight1 = new Flight("KRA", "POZ");
        Flight flight2 = new Flight("KRA", "WAW");
        Flight flight3 = new Flight("KRA", "WRO");


        try {
            flightFinder.findFlight(flight1);
        } catch(RouteNotFoundException e) {
            System.out.println(e);
        }

        try {
            flightFinder.findFlight(flight2);
        } catch(RouteNotFoundException e) {
            System.out.println(e);
        }

        try {
            flightFinder.findFlight(flight3);
        } catch(RouteNotFoundException e) {
            System.out.println(e);
        }
    }
}
