package com.docter.docterandpatend.controller;

import com.docter.docterandpatend.model.Doctor;
import com.docter.docterandpatend.model.Patient;
import com.docter.docterandpatend.service.DoctorService;
import com.docter.docterandpatend.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping("/suggestion")
public class SuggestionController {
    @Autowired
    private DoctorService doctorService;
    @Autowired
    private PatientService patientService;

    private static final Map<String, String> symptomToSpeciality = Map.of(
            "Arthritis", "Orthopaedic",
            "Back Pain", "Orthopaedic",
            "Tissue injuries", "Orthopaedic",
            "Dysmenorrhea", "Gynecology",
            "Skin infection", "Dermatology",
            "Skin burn", "Dermatology",
            "Ear pain", "ENT"
    );

    @GetMapping("/{patientId}")
    public Object suggestDoctor(@PathVariable Long patientId) {
        Patient patient = patientService.getPatientById(patientId);
        if (patient == null) return "Patient not found";

        String city = patient.getCity();
        if (!List.of("Delhi", "Noida", "Faridabad").contains(city)) {
            return "We are still waiting to expand to your location";
        }

        String speciality = symptomToSpeciality.get(patient.getSymptom());
        if (speciality == null) return "Symptom not recognized";

        List<Doctor> doctors = doctorService.getByCityAndSpeciality(city, speciality);
        if (doctors.isEmpty()) return "There isn’t any doctor present at your location for your symptom";

        return doctors;
    }
}
