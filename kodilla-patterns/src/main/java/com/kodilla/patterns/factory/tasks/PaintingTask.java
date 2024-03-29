package com.kodilla.patterns.factory.tasks;

public class PaintingTask implements Task {
    private final String taskName;
    private  final String color;
    private final String whatToPaint;
    private boolean taskStatus = false;

    public PaintingTask(String taskName, String color, String whatToPaint) {
        this.taskName = taskName;
        this.color = color;
        this.whatToPaint = whatToPaint;
    }
    @Override
    public void executeTask(){
        System.out.println("\nYou " + taskName + " " + whatToPaint + " using color " + color);
        taskStatus = true;
    }
    @Override
    public String getTaskName() {
        return taskName;
    }
    @Override
    public boolean isTaskExecuted() {
        return taskStatus;
    }

}
