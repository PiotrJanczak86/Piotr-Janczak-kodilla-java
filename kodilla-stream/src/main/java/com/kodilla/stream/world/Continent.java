package com.kodilla.stream.world;

import java.util.ArrayList;
import java.util.List;

public class Continent {

    private final List<Country> continent = new ArrayList<>();

    public Continent(String name) {
    }

    public void addCountry(Country country) {
    continent.add(country);
    }

    public List<Country> getList(){
        return new ArrayList<Country>(continent);
    }

}




