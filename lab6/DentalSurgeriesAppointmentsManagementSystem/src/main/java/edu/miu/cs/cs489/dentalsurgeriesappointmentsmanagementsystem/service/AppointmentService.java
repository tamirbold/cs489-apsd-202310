package edu.miu.cs.cs489.dentalsurgeriesappointmentsmanagementsystem.service;

import edu.miu.cs.cs489.dentalsurgeriesappointmentsmanagementsystem.models.Appointment;

import java.util.List;

public interface AppointmentService {
    public List<Appointment> getAllAppointment();
    public Appointment getAppointmentById(Long appointmentId);
    public Appointment updateAppointment(Appointment appointment);
    public void deleteAppointment(Appointment appointment);
    public Appointment addNewAppointment(Appointment appointment);
}
