package com.docter.docterandpatend.service;



import com.docter.docterandpatend.dto.PatientDTO;
import com.docter.docterandpatend.model.Patient;
import com.docter.docterandpatend.repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PatientService {
    @Autowired
    private PatientRepository patientRepository;

    public Patient addPatient(PatientDTO patientDTO) {
        Patient patient = new Patient(null, patientDTO.getName(), patientDTO.getCity(), patientDTO.getEmail(), patientDTO.getPhone(), patientDTO.getSymptom());
        return patientRepository.save(patient);
    }

    public void removePatient(Long id) {
        patientRepository.deleteById(id);
    }

    public Patient getPatientById(Long id) {
        return patientRepository.findById(id).orElse(null);
    }
}
