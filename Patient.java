public class Patient {
    private String patientId;
    private String name;
    private int age;
    private String diagnosis;

    public Patient(String patientId, String name, int age, String diagnosis){
        if(age < 0){
            throw new IllegalArgumentException("Age cannot be negative");
        }
        if (diagnosis.isEmpty()){
            throw new IllegalArgumentException("Diagnosis cannot be null or empty");
        }
        this.patientId = patientId;
        this.age = age;
        this.name = name;
        this.diagnosis = diagnosis;
    }

    public String getPatientId(){
        return patientId;
    }
    public void setPatientId(String patientId){
        this.patientId = patientId;
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    public int getAge(){
        return age;
    }
    public void setAge(int age){
        if (age<0){
            throw new IllegalArgumentException("Age cannot be negative");
        }
        this.age = age;
    }

    public String getDiagnosis(){
        return diagnosis;
    }
    public void setDiagnosis(String diagnosis){
        if(diagnosis.isEmpty()){
            throw new IllegalArgumentException("Diagnosis cannot be null or empty");
        }
        this.diagnosis = diagnosis;
    }

    public void updateDiagnosis(String newDiagnosis){
        if(newDiagnosis.isEmpty()){
            throw new IllegalArgumentException("Diagnosis cannot be null or empty");
        }
        this.diagnosis = newDiagnosis;
        System.out.println("Diagnosis updated successfully to " + newDiagnosis);
    }

    @Override
    public String toString(){
        return
                "Patient ID: " + patientId + "\nName: " + name + "\nAge: " + age + "\nDiagnosis: " + diagnosis;
    }

}
