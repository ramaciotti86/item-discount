package engine;

import model.Cart;
import model.CartItem;

public class RuleProductApplyDiscount extends AbstractPromotionalRule {

    private String productId;
    private Integer quantity;
    private Double price;

    public RuleProductApplyDiscount(String productId, Integer quantity, Double price) {
        this.productId = productId;
        this.quantity = quantity;
        this.price = price;
    }

    @Override
    public void rule(Cart cart) {
        if (cart.getItems().containsKey(productId)) {
            CartItem item = cart.getItems().get(productId);
            if (item.getQuantity() >= quantity) {
                cart.addDiscount((item.getProduct().getPrice() * item.getQuantity()) - (price *item.getQuantity()));
            }
        }
    }
}