package edu.miu.cs.cs489.dentalsurgeriesappointmentsmanagementsystem.repository;

import edu.miu.cs.cs489.dentalsurgeriesappointmentsmanagementsystem.models.Surgery;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SurgeryRepository extends JpaRepository<Surgery, Long> {
}
