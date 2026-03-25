package onlinefooddelivery;

public class Runner {
        public static void main(String[] args) {
            FoodItem f1 = new VegItem("Paneer Butter Masala", 250, 2, 0.1);
            FoodItem f2 = new NonVegItem("Chicken Biryani", 300, 1, 50, 0.05);

            FoodItem[] order = {f1, f2};

            for (FoodItem item : order) {
                System.out.println(item.getItemDetails());
                double total = item.calculateTotalPrice();
                double discount = ((Discountable) item).applyDiscount();
                System.out.println("Total Price: " + total);
                System.out.println("Discount: " + discount);
                System.out.println("Final Price: " + (total - discount));
                System.out.println(((Discountable) item).getDiscountDetails());
                System.out.println("----------------------");
            }
        }
}
