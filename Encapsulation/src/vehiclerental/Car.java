package vehiclerental;

public class Car extends Vehicle implements Insurable {
    private String insurancePolicyNumber;

    public Car(String number, double rate, String policy) {
        super(number, "Car", rate);
        this.insurancePolicyNumber = policy;
    }

    public double calculateRentalCost(int days) {
        return getRentalRate() * days;
    }

    public double calculateInsurance() {
        return getRentalRate() * 0.1;
    }

    public String getInsuranceDetails() {
        return "Policy: " + insurancePolicyNumber;
    }
}
