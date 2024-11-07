package org.Decorator;

public class HotDog implements FoodItem {
    @Override
    public double getCost() {
        return 3.00;
    }

    @Override
    public String getDescription() {
        return "Hot Dog";
    }
}
