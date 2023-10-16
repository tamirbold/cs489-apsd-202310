package edu.miu.cs.cs489.dentalsurgeriesappointmentsmanagementsystem.service;

import edu.miu.cs.cs489.dentalsurgeriesappointmentsmanagementsystem.models.Patient;

import java.util.List;

public interface PatientService {
    List<Patient> getAllPatient();
    Patient getPatientById(Long patientId);
    Patient updatePatient(Patient patient);
    void deletePatient(Patient patient);
    Patient addNewPatient(Patient patient);
}
