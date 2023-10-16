package edu.miu.cs.cs489.dentalsurgeriesappointmentsmanagementsystem.service.Impl;

import edu.miu.cs.cs489.dentalsurgeriesappointmentsmanagementsystem.models.Appointment;
import edu.miu.cs.cs489.dentalsurgeriesappointmentsmanagementsystem.repository.AppointmentRepository;
import edu.miu.cs.cs489.dentalsurgeriesappointmentsmanagementsystem.service.AppointmentService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AppointmentServiceImpl implements AppointmentService {

    private AppointmentRepository appointmentRepository;

    public AppointmentServiceImpl(AppointmentRepository appointmentRepository){
        this.appointmentRepository = appointmentRepository;
    }
    @Override
    public List<Appointment> getAllAppointment() {
        return appointmentRepository.findAll();
    }

    @Override
    public Appointment getAppointmentById(Long appointmentId) {
        return appointmentRepository.findById(appointmentId)
                .orElse(null);
    }

    @Override
    public Appointment updateAppointment(Appointment appointment) {
        return appointmentRepository.save(appointment);
    }

    @Override
    public void deleteAppointment(Appointment appointment) {
        appointmentRepository.delete(appointment);
    }

    @Override
    public Appointment addNewAppointment(Appointment appointment) {
        return appointmentRepository.save(appointment);
    }
}
