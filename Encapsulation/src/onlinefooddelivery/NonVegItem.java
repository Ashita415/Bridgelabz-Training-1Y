package onlinefooddelivery;

public class NonVegItem extends FoodItem implements Discountable {
    private double extraCharge;
    private double discountRate;

    public NonVegItem(String name, double price, int quantity, double extraCharge, double discountRate) {
        super(name, price, quantity);
        this.extraCharge = extraCharge;
        this.discountRate = discountRate;
    }

    public double calculateTotalPrice() {
        return (getPrice() * getQuantity()) + extraCharge;
    }

    public double applyDiscount() {
        return calculateTotalPrice() * discountRate;
    }

    public String getDiscountDetails() {
        return "Non-Veg Discount Applied";
    }
}
