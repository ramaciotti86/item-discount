package engine;

import model.Cart;

public class RulePercentageOrderApplyDiscount extends AbstractPromotionalRule {

    private Double total;
    private Double percentage;

    public RulePercentageOrderApplyDiscount(Double total, Double percentage) {
        this.total = total;
        this.percentage = percentage;
    }

    @Override
    public void rule(Cart cart) {
        Double cartTotal = cart.getTotal();

        if (cartTotal >= total) {
            cart.addDiscount((cartTotal-cart.getDiscount())/percentage);
        }
    }

}
