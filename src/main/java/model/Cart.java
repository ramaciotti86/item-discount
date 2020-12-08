package model;

import lombok.*;
import repository.ProductRepository;

import java.util.HashMap;
import java.util.Map;

@Data
@ToString
@Builder
@EqualsAndHashCode
@NoArgsConstructor
public class Cart {

    private Map<String, CartItem> items;
    private ProductRepository repository;

    public Cart (ProductRepository productRepository){
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

}
