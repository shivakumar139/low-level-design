import entity.User;

public class EmailNotifier implements Notifier {
    private final User user;
    public EmailNotifier(User user) {
        this.user = user;
    }

    @Override
    public void send(String msg){
        System.out.println("Sending Email " + msg + " To " + getEmail());
    }

    @Override
    public String getEmail() {
        return user.getEmail();
    }

    @Override
    public String getMobile() {
        return user.getMobile();
    }


}
