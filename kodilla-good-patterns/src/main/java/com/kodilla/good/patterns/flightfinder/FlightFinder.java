package com.kodilla.good.patterns.flightfinder;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FlightFinder {
    private List<Flight> allFlights() {
        return List.of(
                new Flight("BER", "MIA"),
                new Flight("FRA", "CUN"),
                new Flight("FRA", "MIA"),
                new Flight("POZ", "BER"),
                new Flight("POZ", "FRA"),
                new Flight("POZ", "KTW"),
                new Flight("POZ", "WAW")
        );
    }

    public void findFlight(String from, String to) {
        List<Flight> foundFlight = findDirectFlight(from, to);
        if (foundFlight.size() > 0) {
            System.out.println("\nWe have a direct flight for you!\n" + foundFlight);
            return;
        }

        foundFlight = findIndirectFlight(from, to);
        if (foundFlight.size() > 0) {
            System.out.println("\nWe don't have a direct flight for you, here are the flights with transfer airport that we found:");
            for (int i = 0; i < foundFlight.size(); i = i + 2) {
                System.out.println(foundFlight.get(i) + " + " + foundFlight.get(i + 1));
            }
        } else {
            System.out.println("Sorry, we didn't find any flights that met your requirements.");
        }
    }

    private List<Flight> findDirectFlight(String from, String to) {
        return allFlights().stream()
                .filter(f -> f.getFrom().equals(from))
                .filter(f -> f.getTo().equals(to))
                .collect(Collectors.toList());
    }

    private List<Flight> flightsFrom(String from) {
        return allFlights().stream()
                .filter(f -> f.getFrom().equals(from))
                .collect(Collectors.toList());
    }

    private List<Flight> flightsTo(String to) {
        return allFlights().stream()
                .filter(f -> f.getTo().equals(to))
                .collect(Collectors.toList());
    }

    private List<Flight> findIndirectFlight(String from, String to) {

        List<String> firstFlightDestinations = flightsFrom(from).stream()
                .map(Flight::getTo).toList();

        List<String> secondFlightOrigins = flightsTo(to).stream()
                .map(Flight::getFrom).toList();

        List<Flight> firstFlight = flightsFrom(from).stream()
                .filter(f -> secondFlightOrigins.contains(f.getTo())).toList();

        List<Flight> secondFlight = flightsTo(to).stream()
                .filter(f -> firstFlightDestinations.contains(f.getFrom())).toList();

        List<Flight> result = new ArrayList<>();

        for (int i = 0; i < firstFlight.size(); i++) {
            result.add(firstFlight.get(i));
            result.add(secondFlight.get(i));
        }
        return result;
    }
}
