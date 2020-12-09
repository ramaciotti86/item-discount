import engine.Checkout;
import engine.PromotionalRule;
import engine.PromotionalRulesManager;
import model.Cart;
import model.CartItem;
import repository.ProductRepository;

public class Application {

    public static void main(String[] args) {
        Cart cart = new Cart(new ProductRepository());

        //Change scenario number to test different scenarios
        Integer scenario = 3;

        switch (scenario){
            case 1: {
                //First scenario
                cart.addItem(CartItem.builder().id("0001").quantity(1).build());
                cart.addItem(CartItem.builder().id("0001").quantity(1).build());
                cart.addItem(CartItem.builder().id("0002").quantity(1).build());
                cart.addItem(CartItem.builder().id("0003").quantity(1).build());
                break;
            }
            case 2: {
                //Second scenario
                cart.addItem(CartItem.builder().id("0001").quantity(1).build());
                cart.addItem(CartItem.builder().id("0001").quantity(1).build());
                cart.addItem(CartItem.builder().id("0001").quantity(1).build());
                break;
            }
            case 3: {
                //Third scenario
                cart.addItem(CartItem.builder().id("0002").quantity(1).build());
                cart.addItem(CartItem.builder().id("0002").quantity(1).build());
                cart.addItem(CartItem.builder().id("0003").quantity(1).build());
                break;
            }
        }

        PromotionalRulesManager manager = new PromotionalRulesManager();
        PromotionalRule promotionalRules = manager.createRules();

        Checkout checkout = new Checkout(promotionalRules);
        checkout.scan(cart);
        System.out.println(checkout.total());

    }
}
