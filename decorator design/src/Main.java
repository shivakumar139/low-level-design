import entity.User;

public class Main {
    public static void main(String[] args) {
        User user = new User("9836876556", "shiva@gmail.com");
        Notifier notifier = new WhatsAppNotifier(new SlackNotifier(new EmailNotifier(user)));
        notifier.send("New event message");

        Notifier notifier2 = new WhatsAppNotifier(new EmailNotifier(user));
        notifier2.send("Second event");
    }
}
