package decorator;

public class EmailNotifie implements Notifier {
    public void send(String message) {
        System.out.println("Sending email: " + message);
    }

}
