package org.Decorator;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private List<FoodItem> foodItems = new ArrayList<>();

    public void addFoodItem(FoodItem foodItem) {
        foodItems.add(foodItem);
    }

    public double calculateTotalCost() {
        double total = 0;
        for (FoodItem item : foodItems) {
            total += item.getCost();
        }
        return total;
    }

    public void printOrder() {
        for (FoodItem item : foodItems) {
            System.out.println(item.getDescription() + ": $" + item.getCost());
        }
        System.out.println("Total Cost: $" + calculateTotalCost());
    }
}
