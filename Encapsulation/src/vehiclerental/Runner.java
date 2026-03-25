package vehiclerental;

public class Runner {
    public static void main(String[] args) {
        Vehicle v1 = new Car("101", 2000, "CAR123");
        Vehicle v2 = new Bike("202", 500, "BIKE456");
        Vehicle v3 = new Truck("303", 3000, "TRUCK789");

        Vehicle[] vehicles = {v1, v2, v3};

        for (Vehicle v : vehicles) {
            System.out.println("Vehicle: " + v.getType());
            System.out.println("Number: " + v.getVehicleNumber());
            System.out.println("Rental Cost (5 days): " + v.calculateRentalCost(5));
            System.out.println("Insurance: " + ((Insurable) v).calculateInsurance());
            System.out.println(((Insurable) v).getInsuranceDetails());
            System.out.println("----------------------");
        }
    }
}
