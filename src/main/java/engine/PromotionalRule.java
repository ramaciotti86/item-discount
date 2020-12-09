package engine;

import model.Cart;

public interface PromotionalRule {
    void setNextRule(PromotionalRule nextRule);
    void apply(Cart cart);
    void applyNextIfExists(Cart cart);
}
