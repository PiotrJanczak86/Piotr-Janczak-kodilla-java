package com.kodilla.stream;

import com.kodilla.stream.beatifier.PoemBeautifier;

public class StreamMain {

    public static void main(String[] args) {

        PoemBeautifier beautifier = new PoemBeautifier();

        beautifier.beatify("Java", (textInput) -> "ABC " + textInput + " ABC");
        beautifier.beatify("Kodilla", (textInput) -> textInput.toUpperCase());
        beautifier.beatify("Kodilla", (textInput) -> textInput.substring(0,3) + "    " + textInput.substring(3,7));
        beautifier.beatify("Kodilla", (textInput) -> "*" + textInput.toLowerCase().substring(0,3) + "*");
    }
}