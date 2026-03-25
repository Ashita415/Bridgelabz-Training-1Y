package hospital;

public class Runner {
        public static void main(String[] args) {
            Patient p1 = new InPatient(1, "Ranjit", 30, 5, 2000);
            Patient p2 = new OutPatient(2, "Aaj", 25, 500);

            ((MedicalRecord) p1).addRecord("Fever Treatment");
            ((MedicalRecord) p2).addRecord("General Checkup");

            Patient[] patients = {p1, p2};

            for (Patient p : patients) {
                System.out.println(p.getPatientDetails());
                System.out.println("Bill: " + p.calculateBill());
                System.out.println("Records: " + ((MedicalRecord) p).viewRecords());
                System.out.println("----------------------");
            }
        }
}
