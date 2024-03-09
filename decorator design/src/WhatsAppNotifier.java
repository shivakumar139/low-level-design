
public class WhatsAppNotifier extends NotifierDecorator{
    public WhatsAppNotifier(Notifier notifier) {
        super(notifier);
    }

    public void send(String msg){
        super.send(msg);
        System.out.println("Sending Whats app" + msg + " To " + getMobile());
    }


}
