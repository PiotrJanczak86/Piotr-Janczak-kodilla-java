package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class FlightFinder {

    public void findFlight(Flight flight) throws RouteNotFoundException {

        Map<String, Boolean> airports = new HashMap<>();
        airports.put("POZ", true);
        airports.put("KRA", true);
        airports.put("WAW", false);

        if (airports.containsKey(flight.getArrivalAirport())) {

            if (airports.get(flight.getArrivalAirport())) {
                System.out.println("Your destination airport is available. Have a nice flight.");
            } else {
                System.out.println("Sorry, your destination airport is not available at the moment. Please try again later");
            }

        } else {
            throw new RouteNotFoundException("Sorry, you entered invalid destination airport. Please try again");
        }
    }
}
