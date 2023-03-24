package functional.observer;

public class NotifyUsers implements Observer {

    private final Subject subject;
    private String description;
    private String userInfo;

    public NotifyUsers(Subject subject, String userInfo) {
        if (subject == null) {
            throw new IllegalArgumentException("No Publisher found.");
        }
        this.subject = subject;
        this.userInfo = userInfo;
    }

    @Override
    public void update(String description) {
        this.description = description;
        display();
    }

    private void display() {
        System.out.println("[" + userInfo + "]: " + description);
    }

    @Override
    public void subscribe() {
        System.out.println("Subscribing " + userInfo + " to " + subject.subjectDetails() + " ...");
        this.subject.subscribeObserver(this);
        System.out.println("Subscribed successfully.");
    }

    @Override
    public void unSubscribe() {
        System.out.println("Unsubscribing " + userInfo + " to " + subject.subjectDetails() + " ...");
        this.subject.unSubscribeObserver(this);
        System.out.println("Unsubscribed successfully.");
    }

}
