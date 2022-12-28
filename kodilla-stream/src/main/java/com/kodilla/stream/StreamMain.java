package com.kodilla.stream;

import com.kodilla.stream.beatifier.PoemBeautifier;
import com.kodilla.stream.iterate.NumbersGenerator;

public class StreamMain {

    public static void main(String[] args) {

        PoemBeautifier beautifier = new PoemBeautifier();

        beautifier.beatify("Java", (textInput) -> "ABC " + textInput + " ABC");
        beautifier.beatify("Kodilla", (textInput) -> textInput.toUpperCase());
        beautifier.beatify("Kodilla", (textInput) -> textInput.substring(0,3) + "    " + textInput.substring(3,7));
        beautifier.beatify("Kodilla", (textInput) -> "*" + textInput.toLowerCase().substring(0,3) + "*");

        System.out.println("Using Stream to generate even numbers from 1 to 20");
        NumbersGenerator.generateEven(20);

    }
}