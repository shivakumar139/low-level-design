public class SlackNotifier extends NotifierDecorator{
    public SlackNotifier(Notifier notifier) {
        super(notifier);
    }

    public void send(String msg){
        super.send(msg);
        System.out.println("Sending Slack message " + msg + " To " + getEmail());
    }
}
