package com.kodilla.patterns2.observer.homework;

public class Mentor implements Observer {
    private final String name;
    private int tasksCount;

    public Mentor(String name) {
        this.name = name;
    }

    @Override
    public void update(TasksQueue tasksQueue) {
        System.out.println(name + ", you have new task in queue from " + tasksQueue.getTrainee().getName() + ": " + tasksQueue.getTaskDeque().peekLast().getName());
        tasksCount++;
    }

    public int getTasksCount() {
        return tasksCount;
    }
}