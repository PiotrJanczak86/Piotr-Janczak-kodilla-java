package com.kodilla.stream.world;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


import java.math.BigDecimal;

public class WorldTestSuite {

    @Test
    void testGetPeopleQuantity() {
        //Given
        World world = new World();
        Continent africa = new Continent("Africa");
        Continent europe = new Continent("Europe");
        Continent asia = new Continent("Asia");
        world.addContinent(africa);
        world.addContinent(europe);
        world.addContinent(asia);

        //When
        europe.addCountry(new Country("Poland", new BigDecimal("37019327")));
        europe.addCountry(new Country("France", new BigDecimal("67522000")));
        africa.addCountry(new Country("Egypt", new BigDecimal("106437241")));
        africa.addCountry(new Country("South Africa", new BigDecimal("56978635")));
        asia.addCountry(new Country("Thailand", new BigDecimal("69480520")));
        asia.addCountry(new Country("Vietnam", new BigDecimal("102789598")));

        //Then
        BigDecimal expected = new BigDecimal("440227321");
        assertEquals(expected, world.getPeopleQuantity());

    }
}
