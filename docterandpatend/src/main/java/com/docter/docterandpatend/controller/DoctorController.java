package com.docter.docterandpatend.controller;

import com.docter.docterandpatend.dto.DoctorDTO;
import com.docter.docterandpatend.model.Doctor;
import com.docter.docterandpatend.service.DoctorService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/doctors")
public class DoctorController {
    @Autowired
    private DoctorService doctorService;

    @PostMapping
    public Doctor addDoctor(@Valid @RequestBody DoctorDTO doctorDTO) {
        return doctorService.addDoctor(doctorDTO);
    }

    @DeleteMapping("/{id}")
    public void removeDoctor(@PathVariable Long id) {
        doctorService.removeDoctor(id);
    }
}