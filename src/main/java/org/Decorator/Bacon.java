package org.Decorator;

public class Bacon extends ToppingDecorator {
    public Bacon(FoodItem foodItem) {
        super(foodItem);
    }

    @Override
    public double getCost() {
        return foodItem.getCost() + 1.50;
    }

    @Override
    public String getDescription() {
        return foodItem.getDescription() + ", Bacon";
    }
}