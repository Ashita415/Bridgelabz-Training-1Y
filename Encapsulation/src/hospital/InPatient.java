package hospital;

public class InPatient extends Patient implements MedicalRecord {
    private int daysAdmitted;
    private double dailyCharge;
    private String medicalHistory = "";

    public InPatient(int id, String name, int age, int days, double charge) {
        super(id, name, age);
        this.daysAdmitted = days;
        this.dailyCharge = charge;
    }

    public double calculateBill() {
        return daysAdmitted * dailyCharge;
    }

    public void addRecord(String record) {
        medicalHistory += record + "; ";
    }

    public String viewRecords() {
        return medicalHistory;
    }
}
