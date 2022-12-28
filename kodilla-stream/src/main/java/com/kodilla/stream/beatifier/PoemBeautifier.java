package com.kodilla.stream.beatifier;

public class PoemBeautifier {

    public void beatify(String textInput, PoemDecorator decorator) {
        String result = decorator.decorate(textInput);
        System.out.println(result);
    }
}
