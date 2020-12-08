import model.Cart;
import model.CartItem;
import repository.ProductRepository;

import java.util.HashMap;

public class Application {

    public static void main(String[] args) {
        Cart cart = new Cart(new ProductRepository());

        //Change scenario number to test different scenarios
        Integer scenario = 1;

        switch (scenario){
            case 1: {
                //First scenario
                cart.addItem(CartItem.builder().id("0001").quantity(1).build());
                cart.addItem(CartItem.builder().id("0001").quantity(1).build());
                cart.addItem(CartItem.builder().id("0002").quantity(1).build());
                cart.addItem(CartItem.builder().id("0003").quantity(1).build());
            }
            case 2: {
                //Second scenario
                cart.addItem(CartItem.builder().id("0001").quantity(1).build());
                cart.addItem(CartItem.builder().id("0001").quantity(1).build());
                cart.addItem(CartItem.builder().id("0001").quantity(1).build());
            }
            case 3: {
                //Third scenario
                cart.addItem(CartItem.builder().id("0002").quantity(1).build());
                cart.addItem(CartItem.builder().id("0002").quantity(1).build());
                cart.addItem(CartItem.builder().id("0003").quantity(1).build());
            }
            default: {
                cart.setItems(new HashMap<String, CartItem>());
            }
        }
    }
}
