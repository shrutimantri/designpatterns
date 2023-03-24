package functional.observer;

import java.util.List;

public class CommentaryObject implements Commentary, Subject {

    private final List<Observer> observers;
    private final String subjectDetails;
    private String description;

    public CommentaryObject(List<Observer> observers, String subjectDetails) {
        this.observers = observers;
        this.subjectDetails = subjectDetails;
    }

    @Override
    public void setDescription(String description) {
        this.description = description;
        notifyObservers();
    }

    @Override
    public void subscribeObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void unSubscribeObserver(Observer observer) {
        int index = observers.indexOf(observer);
        observers.remove(index);
    }

    @Override
    public void notifyObservers() {
        System.out.println();
        for (Observer observer : observers) {
            observer.update(description);
        }
    }

    @Override
    public String subjectDetails() {
        return subjectDetails;
    }

}
