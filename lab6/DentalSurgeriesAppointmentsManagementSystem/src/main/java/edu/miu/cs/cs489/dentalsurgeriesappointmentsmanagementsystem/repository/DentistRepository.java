package edu.miu.cs.cs489.dentalsurgeriesappointmentsmanagementsystem.repository;

import edu.miu.cs.cs489.dentalsurgeriesappointmentsmanagementsystem.models.Dentist;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DentistRepository extends JpaRepository<Dentist, Long> {
}
