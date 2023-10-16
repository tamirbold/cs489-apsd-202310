package edu.miu.cs.cs489.dentalsurgeriesappointmentsmanagementsystem.service;

import edu.miu.cs.cs489.dentalsurgeriesappointmentsmanagementsystem.models.Dentist;

import java.util.List;

public interface DentistService {
    List<Dentist> getAllDentists();
    Dentist getDentistById(Long dentsistId);
    Dentist updateDentist(Dentist dentist);
    void deleteDentist(Dentist dentist);
    Dentist addNewDentist(Dentist dentist);
}
