package com.kodilla;

import com.kodilla.good.patterns.challenges.MovieStore;

public class Main {
    public static void main(String[] args) {
        MovieStore movieStore = new MovieStore();
        System.out.println(movieStore.allTitlesString());
    }
}