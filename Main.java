public class Main {
    public static void main(String[] args) {
        Patient patient1 = new Patient("P001", "John Smith", 45, "Fever");
        Doctor doctor1 = new Doctor("D101", "De. Alice", "General Medicine");

        patient1.updateDiagnosis("Flu");

        System.out.println(patient1);
        // Treat the patient using the doctor and increase the number of patients treated
        doctor1.treatPatient();

        // Attempt to set the patient's age to negative
        try{
            patient1.setAge(-19);
        }catch (IllegalArgumentException e){
            System.out.println(e);
        }

        // Attempt to update the patient's diagnosis to null
        try{
            patient1.updateDiagnosis("");
        }catch (IllegalArgumentException e){
            System.out.println(e);
        }

    }
}