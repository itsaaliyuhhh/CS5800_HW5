import org.Decorator.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class OrderTest {
    @Test
    public void testBurgerWithToppingsCost() {
        FoodItem burger = new Burger();
        FoodItem burgerWithCheese = new Cheese(burger);
        FoodItem burgerWithCheeseAndBacon = new Bacon(burgerWithCheese);

        assertEquals(7.50, burgerWithCheeseAndBacon.getCost(), 0.01);
    }

    @Test
    public void testOrderTotalCost() {
        Order order = new Order();
        order.addFoodItem(new Cheese(new Burger()));
        order.addFoodItem(new Bacon(new Fries()));

        assertEquals(10.00, order.calculateTotalCost(), 0.01);
    }

    @Test
    public void testLoyaltyDiscount() {
        LoyaltyDiscount discount = new LoyaltyDiscount();
        double discountedPrice = discount.applyDiscount(10.00, "Silver");

        assertEquals(9.00, discountedPrice, 0.01);
    }
}
