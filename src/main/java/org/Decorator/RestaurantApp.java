package org.Decorator;

public class RestaurantApp {
    public static void main(String[] args) {
        Order order = new Order();

        FoodItem burgerWithCheeseAndBacon = new Bacon(new Cheese(new Burger()));
        FoodItem friesWithCheese = new Cheese(new Fries());

        order.addFoodItem(burgerWithCheeseAndBacon);
        order.addFoodItem(friesWithCheese);

        System.out.println("Order details before discount:");
        order.printOrder();

        LoyaltyDiscount discount = new LoyaltyDiscount();
        double discountedTotal = discount.applyDiscount(order.calculateTotalCost(), "Gold");

        System.out.println("Discounted Total for Gold Member: $" + discountedTotal);
    }
}
