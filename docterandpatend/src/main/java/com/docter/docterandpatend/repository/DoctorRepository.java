package com.docter.docterandpatend.repository;


import com.docter.docterandpatend.model.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface DoctorRepository extends JpaRepository<Doctor, Long> {
    List<Doctor> findByCityAndSpeciality(String city, String speciality);
}