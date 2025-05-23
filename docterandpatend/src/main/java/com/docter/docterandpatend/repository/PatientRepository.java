package com.docter.docterandpatend.repository;

import com.docter.docterandpatend.model.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientRepository extends JpaRepository<Patient, Long> {
}