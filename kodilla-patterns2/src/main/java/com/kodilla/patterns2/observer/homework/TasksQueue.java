package com.kodilla.patterns2.observer.homework;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class TasksQueue implements Observable {

    private final List<Observer> observers;
    private final Trainee trainee;
    private final Deque<Task> taskDeque;

    public TasksQueue(Trainee trainee) {
        taskDeque = new ArrayDeque<>();
        observers = new ArrayList<>();
        this.trainee = trainee;
    }

    public void addTask(Task task) {
        taskDeque.offerLast(task);
        notifyObservers();
    }

    public Task peekTask() {
        return taskDeque.peekFirst();
    }

    public void pollTask() {
        taskDeque.pollFirst();
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(this);
        }
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    public Trainee getTrainee() {
        return trainee;
    }

    public Deque<Task> getTaskDeque() {
        return taskDeque;
    }
}