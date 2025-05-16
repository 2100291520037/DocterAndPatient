package com.docter.docterandpatend.dto;

import jakarta.validation.constraints.*;
import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class DoctorDTO {
    @Size(min = 3)
    private String name;

    @Pattern(regexp = "Delhi|Noida|Faridabad")
    private String city;

    @Email
    private String email;

    @Size(min = 10)
    private String phone;

    @Pattern(regexp = "Orthopaedic|Gynecology|Dermatology|ENT")
    private String speciality;
}