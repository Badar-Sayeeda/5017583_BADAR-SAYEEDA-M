package decorator;

public class SlackNotifierDecorator extends NotifierDecorator {
    public SlackNotifierDecorator(Notifier decoratedNotifier) {
        super(decoratedNotifier);
    }

    public void send(String message) {
        decoratedNotifier.send(message);
        System.out.println("Sending Slack message: " + message);
    }

}
