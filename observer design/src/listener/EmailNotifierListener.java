package listener;

public class EmailNotifierListener implements Listener{
    private String emailOfListener;
    public EmailNotifierListener(String _emailOfListener){
        this.emailOfListener = _emailOfListener;
    }
    @Override
    public void update() {
        sendEmail();
    }

    private void sendEmail(){
        System.out.println("Sending Email to " + emailOfListener);
    }
}
