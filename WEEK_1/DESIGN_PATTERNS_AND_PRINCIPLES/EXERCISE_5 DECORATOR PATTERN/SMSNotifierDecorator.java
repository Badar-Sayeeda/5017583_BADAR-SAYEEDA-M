package decorator;

public class SMSNotifierDecorator extends NotifierDecorator {
    public SMSNotifierDecorator(Notifier decoratedNotifier) {
        super(decoratedNotifier);
    }

    public void send(String message) {
        decoratedNotifier.send(message);
        System.out.println("Sending SMS: " + message);
    }

}
