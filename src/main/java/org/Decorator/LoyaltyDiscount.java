package org.Decorator;

public class LoyaltyDiscount {
    public double applyDiscount(double totalCost, String loyaltyStatus) {
        double discount = 0;

        if (loyaltyStatus.equals("Gold")) {
            discount = 0.20;
        } else if (loyaltyStatus.equals("Silver")) {
            discount = 0.10;
        } else if (loyaltyStatus.equals("Bronze")) {
            discount = 0.05;
        }

        return totalCost * (1 - discount);
    }
}
