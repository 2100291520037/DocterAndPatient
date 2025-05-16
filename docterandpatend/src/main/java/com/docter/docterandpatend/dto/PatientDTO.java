package com.docter.docterandpatend.dto;

import jakarta.validation.constraints.*;
import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PatientDTO {
    @Size(min = 3)
    private String name;

    @Size(max = 20)
    private String city;

    @Email
    private String email;

    @Size(min = 10)
    private String phone;

    private String symptom;
}
