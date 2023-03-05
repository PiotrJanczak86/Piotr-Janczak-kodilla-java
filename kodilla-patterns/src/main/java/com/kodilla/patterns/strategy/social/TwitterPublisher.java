package com.kodilla.patterns.strategy.social;

public final class TwitterPublisher implements SocialPublisher {
    @Override
    public String share(){
        return ("User shares something on Twitter");
    }
}