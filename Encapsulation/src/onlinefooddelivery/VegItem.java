package onlinefooddelivery;

public class VegItem extends FoodItem implements Discountable {
    private double discountRate;

    public VegItem(String name, double price, int quantity, double discountRate) {
        super(name, price, quantity);
        this.discountRate = discountRate;
    }

    public double calculateTotalPrice() {
        return getPrice() * getQuantity();
    }

    public double applyDiscount() {
        return calculateTotalPrice() * discountRate;
    }

    public String getDiscountDetails() {
        return "Veg Discount Applied";
    }
}