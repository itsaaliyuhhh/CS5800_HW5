package org.Decorator;

public class Cheese extends ToppingDecorator {
    public Cheese(FoodItem foodItem) {
        super(foodItem);
    }

    @Override
    public double getCost() {
        return foodItem.getCost() + 1.00;
    }

    @Override
    public String getDescription() {
        return foodItem.getDescription() + ", Cheese";
    }
}