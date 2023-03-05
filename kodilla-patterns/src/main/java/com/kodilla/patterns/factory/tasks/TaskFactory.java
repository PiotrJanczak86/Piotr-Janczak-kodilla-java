package com.kodilla.patterns.factory.tasks;

public class TaskFactory {
    public static final String SHOPPING = "SHOPPING";
    public static final String DRIVING = "DRIVING";
    public static final String PAINTING = "PAINTING";

    public Task makeTask(String taskClass){
        return switch (taskClass){
            case SHOPPING -> new ShoppingTask("grocery shopping", "red onion", 2.0);
            case DRIVING ->  new DrivingTask("drive", "the train station", "a car");
            case PAINTING -> new PaintingTask("paint", "green", "living room walls");
            default -> null;
        };
    }
}
