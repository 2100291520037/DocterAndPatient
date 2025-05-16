package com.docter.docterandpatend.controller;

import com.docter.docterandpatend.dto.PatientDTO;
import com.docter.docterandpatend.model.Patient;
import com.docter.docterandpatend.service.PatientService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/patients")
public class PatientController {
    @Autowired
    private PatientService patientService;

    @PostMapping
    public Patient addPatient(@Valid @RequestBody PatientDTO patientDTO) {
        return patientService.addPatient(patientDTO);
    }

    @DeleteMapping("/{id}")
    public void removePatient(@PathVariable Long id) {
        patientService.removePatient(id);
    }
}
