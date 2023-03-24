package functional.observer;

import java.util.ArrayList;

public class TestObserverPattern {

    public static void main(String[] args) {
        Subject subject = new CommentaryObject(new ArrayList<>(), "Soccer Match [2022Dec24]");
        Observer observer = new NotifyUsers(subject, "Adam Warner [New York]");
        observer.subscribe();
        System.out.println();

        Observer observer2 = new NotifyUsers(subject, "Tim Ronney [London]");
        observer2.subscribe();
        Commentary commentary = ((Commentary) subject);
        commentary.setDescription("Welcome to live Soccer match");
        commentary.setDescription("Current score 0-0");
        System.out.println();
        observer2.unSubscribe();
        System.out.println();
        commentary.setDescription("It’s a goal!!");
        commentary.setDescription("Current score 1-0");
        System.out.println();

        Observer observer3 = new NotifyUsers(subject, "Marrie [Paris]");
        observer3.subscribe();
        System.out.println();
        commentary.setDescription("It’s another goal!!");
        commentary.setDescription("Half-time score 2-0");
    }

}
