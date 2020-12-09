package model;

import repository.ProductRepository;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.DoubleStream;

public class Cart {

    private Map<String, CartItem> items;
    private ProductRepository repository;
    private Double discount;

    public Cart (ProductRepository productRepository){
        discount = 0.00;
        this.items = new HashMap<>();
        this.repository = productRepository;
    }

    public void addItem(CartItem cartItem){
        if(items.containsKey(cartItem.getId())){
            items.get(cartItem.getId()).setQuantity(cartItem.getQuantity() + items.get(cartItem.getId()).getQuantity());
            items.get(cartItem.getId()).setProduct(repository.findById(cartItem.getId()));
        }else{
            cartItem.setProduct(repository.findById(cartItem.getId()));
            items.put(cartItem.getId(), cartItem);
        }
    }

    public void addDiscount(Double discount){
        this.discount += Math.floor(discount * 100) / 100;
    }

    public Double getDiscount(){
        return discount;
    }

    public Map<String, CartItem> getItems() {
        return items;
    }

    public Double getTotal() {
        return Math.floor(items.values().stream().flatMapToDouble(x -> DoubleStream.of(x.getProduct().getPrice() * x.getQuantity())).sum()*100)/100;
    }
}
