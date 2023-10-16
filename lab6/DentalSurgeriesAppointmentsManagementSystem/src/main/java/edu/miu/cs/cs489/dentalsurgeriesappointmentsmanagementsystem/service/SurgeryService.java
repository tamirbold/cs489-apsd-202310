package edu.miu.cs.cs489.dentalsurgeriesappointmentsmanagementsystem.service;

import edu.miu.cs.cs489.dentalsurgeriesappointmentsmanagementsystem.models.Surgery;

import java.util.List;

public interface SurgeryService {
    List<Surgery> getAllSurgeryList();
    Surgery getSurgeryById(Long surgeryId);
    Surgery updateSurgery(Surgery surgery);
    void deleteSurgery(Surgery surgery);
    Surgery addNewSurgery(Surgery surgery);
}
