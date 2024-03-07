public class Main {
    public static void main(String[] args) {
        Doctor doctor = new Doctor("Dr.kamau", 40, "Cardiology");
        Patient patient = new Patient("Joy Wanjiru", 35, "Fever");

        Hospital hospital = new Hospital();
        hospital.setDoctor(doctor);
        hospital.setPatient(patient);

        hospital.displayDoctorDetails();
        System.out.println();
        hospital.displayPatientDetails();
    }
}
