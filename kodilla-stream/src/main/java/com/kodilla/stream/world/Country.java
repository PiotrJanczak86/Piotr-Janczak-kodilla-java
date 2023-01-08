package com.kodilla.stream.world;

import java.math.BigDecimal;

public class Country {

    private final BigDecimal peopleQuantity;
    private final String countryName;

    public Country(String countryName, BigDecimal peopleQuantity) {
        this.peopleQuantity = peopleQuantity;
        this.countryName = countryName;
    }

    public BigDecimal getPeopleQuantity() {
        return peopleQuantity;
    }

}
