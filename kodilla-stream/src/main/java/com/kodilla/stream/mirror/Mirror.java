package com.kodilla.stream.mirror;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Mirror {


    public static void mirroring(String text) {

        final String text1 = text + " ";

        String mirrored = IntStream.range(0, text.length())
                .mapToObj(n -> text1.substring(text.length()-n-1, text.length()-n))
                .collect(Collectors.joining());

        System.out.println(mirrored);
    }

}
