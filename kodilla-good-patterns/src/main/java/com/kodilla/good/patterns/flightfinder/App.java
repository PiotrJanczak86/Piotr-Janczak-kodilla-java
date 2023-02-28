package com.kodilla.good.patterns.flightfinder;

public class App {
    public static void main(String[] args) {
        FlightFinder flightFinder = new FlightFinder();
        flightFinder.findFlight("POZ", "KTW");
        flightFinder.findFlight("POZ", "MIA");
    }
}
