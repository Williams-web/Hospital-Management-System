public class Doctor {
    private String doctorId;
    private String name;
    private String specialization;
    private int patientsTreated;

    public Doctor(String doctorId, String name, String specialization){
        if(name.isEmpty()){
            throw new IllegalArgumentException("Name cannot be null or empty");
        }
        if(specialization.isEmpty()){
            throw new IllegalArgumentException("Specialization cannot be null or empty");
        }
        this.doctorId = doctorId;
        this.name = name;
        this.specialization = specialization;
    }

    public String getDoctorId(){
        return doctorId;
    }
    public void setDoctorId(String doctorId){
        this.doctorId = doctorId;
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        if(name.isEmpty()){
            throw new IllegalArgumentException("Name cannot be null or empty");
        }
        this.name = name;
    }

    public String getSpecialization(){
        return specialization;
    }
    public void setSpecialization(String specialization){
        if(specialization.isEmpty()){
            throw new IllegalArgumentException("Specialization cannot be null or empty");
        }
        this.specialization = specialization;
    }

    public int getPatientsTreated(){
        return patientsTreated;
    }
    public void setPatientsTreated(int patientsTreated){
        this.patientsTreated = patientsTreated;
    }

    public void treatPatient(){
        patientsTreated++;
        System.out.println("Patient treated successfully. Total patients treated " + patientsTreated);
    }

    @Override
    public String toString(){
        return
                "doctorId : " + doctorId + '\n' +
                "name : " + name + '\n' +
                "specialization : " + specialization + '\n';

    }
}
