package edu.miu.cs.cs489.dentalsurgeriesappointmentsmanagementsystem.service.Impl;

import edu.miu.cs.cs489.dentalsurgeriesappointmentsmanagementsystem.models.Dentist;
import edu.miu.cs.cs489.dentalsurgeriesappointmentsmanagementsystem.repository.DentistRepository;
import edu.miu.cs.cs489.dentalsurgeriesappointmentsmanagementsystem.service.DentistService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DentistServiceImpl implements DentistService {
    private DentistRepository dentistRepository;
    public DentistServiceImpl(DentistRepository dentistRepository){
        this.dentistRepository = dentistRepository;
    }
    @Override
    public List<Dentist> getAllDentists() {
        return dentistRepository.findAll();
    }

    @Override
    public Dentist getDentistById(Long dentsistId) {
        return dentistRepository.findById(dentsistId)
                .orElse(null);
    }

    @Override
    public Dentist updateDentist(Dentist dentist) {
        return dentistRepository.save(dentist);
    }

    @Override
    public void deleteDentist(Dentist dentist) {
        dentistRepository.delete(dentist);
    }

    @Override
    public Dentist addNewDentist(Dentist dentist) {
        return dentistRepository.save(dentist);
    }
}
