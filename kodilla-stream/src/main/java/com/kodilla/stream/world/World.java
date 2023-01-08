package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class World {

    public final List<Continent> continents = new ArrayList<>();

    public void addContinent(Continent continent){
        continents.add(continent);
    }

    public List<Continent> getList() {
        return new ArrayList<Continent>(continents);
    }


    public BigDecimal getPeopleQuantity() {
        return getList().stream()
                .flatMap(countries -> countries.getList().stream())
                .map(Country::getPeopleQuantity)
                .reduce(BigDecimal.ZERO, (sum, current) -> sum = sum.add(current));
    }

}

