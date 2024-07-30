package decorator;

public class DecoratorPatternTest {
    public static void main(String[] args) {
        // Create a basic email notifier
        Notifier emailNotifier = new EmailNotifie();
        
        // Decorate it with SMS notification capability
        Notifier smsNotifier = new SMSNotifierDecorator(emailNotifier);
        
        // Further decorate it with Slack notification capability
        Notifier slackNotifier = new SlackNotifierDecorator(smsNotifier);
        
        // Send a notification
        slackNotifier.send("Hello, World!");
    }
}

