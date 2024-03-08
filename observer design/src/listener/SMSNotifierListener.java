package listener;

public class SMSNotifierListener implements Listener{
    private String mobileNoOfListener;
    public SMSNotifierListener(String _mobileNoOfListener){
        this.mobileNoOfListener = _mobileNoOfListener;
    }
    @Override
    public void update() {
        sendSMS();
    }

    private void sendSMS(){
        System.out.println("Sending SMS to " + mobileNoOfListener);
    }
}
