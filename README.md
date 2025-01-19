# Hospital-Management-System

## Overview
This project is a simple Hospital Management System built in Java. It helps manage patient and doctor records, update patient diagnoses, treat patients, and handle invalid data inputs.

## Features
- Manage patient records
- Manage doctor records
- Update patient diagnoses
- Track the number of patients treated by a doctor
- Handle invalid data inputs with exceptions

## How to Use

### Patient
A `Patient` has:
- **ID**: Unique identifier
- **Name**: Patient's name
- **Age**: Patient's age
- **Diagnosis**: Current diagnosis

### Doctor
A `Doctor` has:
- **ID**: Unique identifier
- **Name**: Doctor's name
- **Specialization**: Doctor's field of expertise
- **Patients Treated**: Number of patients treated

### Running the Project
To run the project, execute the `main` method in the `Main` class. This will:
1. Create a `Patient` and a `Doctor`.
2. Update the patient's diagnosis to "Flu".
3. Print the patient's details.
4. Treat the patient and increase the doctor's `patientsTreated` count.
5. Attempt to set the patient's age to a negative value and catch the exception.
6. Attempt to update the patient's diagnosis to an empty string and catch the exception.

### Example
```java
public class Main {
    public static void main(String[] args) {
        Patient patient1 = new Patient("P001", "John Smith", 45, "Fever");
        Doctor doctor1 = new Doctor("D101", "Dr. Alice", "General Medicine");

        // Updates the diagnosis to "Flu"
        patient1.updateDiagnosis("Flu");

        System.out.println(patient1);
        doctor1.treatPatient();

        try {
            patient1.setAge(-19);
        } catch (IllegalArgumentException e) {
            System.out.println(e);
        }

        try {
            patient1.updateDiagnosis("");
        } catch (IllegalArgumentException e) {
            System.out.println(e);
        }
    }
}
