import entity.User;

public class NotifierDecorator implements Notifier{

    private Notifier wrapper;
    private User user;

    public NotifierDecorator(Notifier notifier){
        this.wrapper = notifier;
    }

    public NotifierDecorator(User user){
        this.user = user;
    }
    @Override
    public void send(String msg) {
        wrapper.send(msg);
    }

    @Override
    public String getEmail() {
        return wrapper.getEmail();
    }

    @Override
    public String getMobile() {
        return wrapper.getMobile();
    }

}
