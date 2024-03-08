package entity;

import publisher.Publisher;

import java.util.UUID;

public class Product {
    private String id;
    private String name;
    private String desc;
    private int stock;
    private Publisher publisher;

    public Product(String _name, String _desc, int _stock, Publisher _publisher){
        id = UUID.randomUUID().toString();
        name = _name;
        desc = _desc;
        stock = _stock;
        publisher = _publisher;
    }

    public void updateStock(int newStockCount){
        if(stock == 0){
            publisher.notifySubscribers(id);
        }
        stock += newStockCount;
    }

    public String getId(){
        return this.id;
    }
}
