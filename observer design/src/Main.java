import entity.Product;
import entity.User;
import listener.EmailNotifierListener;
import listener.SMSNotifierListener;
import publisher.Publisher;
import publisher.PublisherManager;

public class Main {
    public static void main(String[] args) {
        Publisher publisher = new PublisherManager();
        Product apple = new Product("Iphone 15", "Apple Iphpne", 0, publisher);
        Product samsung = new Product("Samsung S23", "Samsong Phone", 0, publisher);


        User u1 = new User("Shiva", "shiva@gmail.com", "7392773322");
        User u2 = new User("jyoti", "jyoti@gmail.com", "7366777332");
        publisher.subscribe(apple.getId(), new EmailNotifierListener(u1.getEmail()));
        publisher.subscribe(samsung.getId(), new SMSNotifierListener(u2.getPhoneNo()));

        apple.updateStock(3);
        samsung.updateStock(5);
        samsung.updateStock(5);




    }
}
