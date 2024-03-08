package publisher;

import listener.Listener;

import java.util.*;

/**
 * Concrete class for Publisher
 */
public class PublisherManager implements Publisher{

    private Map<String, Set<Listener>> eventListenerMap;
    public PublisherManager(){
        eventListenerMap = new HashMap<>();
    }


    @Override
    public void subscribe(String eventType, Listener listener) {
        eventListenerMap.putIfAbsent(eventType, new HashSet<>());
        eventListenerMap.get(eventType).add(listener);
    }

    @Override
    public void unsubscribe(String eventType, Listener listener) {
        // if event is not present
        if(!eventListenerMap.containsKey(eventType)) return;

        eventListenerMap.get(eventType).remove(listener);
    }

    @Override
    public void notifySubscribers(String eventType) {
        if(!eventListenerMap.containsKey(eventType)) return;

        eventListenerMap.get(eventType).forEach(listener -> listener.update());
    }


}
