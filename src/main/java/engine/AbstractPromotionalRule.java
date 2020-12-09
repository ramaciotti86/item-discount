package engine;

import model.Cart;

public class AbstractPromotionalRule implements PromotionalRule {

    protected PromotionalRule nextRule;

    @Override
    public void setNextRule(PromotionalRule nextRule) {
        this.nextRule = nextRule;
    }

    @Override
    public void apply(Cart cart) {
        rule(cart);
        applyNextIfExists(cart);
    }

    public void rule(Cart cart) {
    }

    @Override
    public void applyNextIfExists(Cart cart) {
        if(this.nextRule != null){
            this.nextRule.apply(cart);
        }
    }
}
