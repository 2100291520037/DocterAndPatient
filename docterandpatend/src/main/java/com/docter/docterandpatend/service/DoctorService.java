package com.docter.docterandpatend.service;

import com.docter.docterandpatend.dto.DoctorDTO;
import com.docter.docterandpatend.model.Doctor;
import com.docter.docterandpatend.repository.DoctorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DoctorService {
    @Autowired
    private DoctorRepository doctorRepository;

    public Doctor addDoctor(DoctorDTO doctorDTO) {
        Doctor doctor = new Doctor(null, doctorDTO.getName(), doctorDTO.getCity(), doctorDTO.getEmail(), doctorDTO.getPhone(), doctorDTO.getSpeciality());
        return doctorRepository.save(doctor);
    }

    public void removeDoctor(Long id) {
        doctorRepository.deleteById(id);
    }

    public List<Doctor> getByCityAndSpeciality(String city, String speciality) {
        return doctorRepository.findByCityAndSpeciality(city, speciality);
    }
}
