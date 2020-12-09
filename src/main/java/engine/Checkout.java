package engine;

import model.Cart;

public class Checkout {

    private PromotionalRule promotionalRules;
    private Double total;

    public Checkout(PromotionalRule promotionalRules){
        this.promotionalRules = promotionalRules;
    }

    public void scan(Cart cart){
        promotionalRules.apply(cart);
        total = cart.getTotal() - cart.getDiscount();
    }

    public Double total() {
        return Math.floor(total * 100) / 100;
    }

}
