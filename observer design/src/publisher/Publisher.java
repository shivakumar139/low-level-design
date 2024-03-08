package publisher;

import listener.Listener;

public interface Publisher {
    void subscribe(String eventType, Listener listener);
    void unsubscribe(String eventType, Listener listener);
    void notifySubscribers(String eventType);
}
