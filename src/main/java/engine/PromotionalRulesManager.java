package engine;

public class PromotionalRulesManager {
    public PromotionalRule createRules() {
        PromotionalRule productDiscountRules = new RuleProductApplyDiscount("0001", 2, 22.99);
        PromotionalRule percentageOrderDiscountRules = new RulePercentageOrderApplyDiscount(75D, 10D);
        productDiscountRules.setNextRule(percentageOrderDiscountRules);
        return productDiscountRules;
    }
}