package com.kodilla.patterns.builder.bigmac;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BigmacTestSuite {
    @Test
    void testBigmacNew(){
        //Given
        Bigmac bigmac = new Bigmac.BigmacBuilder()
                .bun("with sesame")
                .burgers(2)
                .ingredient("lettuce")
                .ingredient("bacon")
                .sauce("BBQ")
                .ingredient("nachos")
                .build();
        System.out.println(bigmac);
        //When
        int howManyIngredients = bigmac.getIngredients().size();
        int howManyBurgers = bigmac.getBurgers();
        String whatSauce = bigmac.getSauce();
        //Then
        assertEquals(3, howManyIngredients);
        assertEquals(2, howManyBurgers);
        assertEquals("BBQ", whatSauce);
    }
}
