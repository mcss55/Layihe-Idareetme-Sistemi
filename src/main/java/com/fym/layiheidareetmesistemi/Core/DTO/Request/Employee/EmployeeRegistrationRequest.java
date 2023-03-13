package com.fym.layiheidareetmesistemi.Core.DTO.Request.Employee;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class EmployeeRegistrationRequest {
    @NotNull
    @NotBlank
    @Size(min = 3)
    String firstName;
    @NotNull
    @NotBlank
    @Size(min = 3)
    String lastName;
    @NotNull
    @NotBlank
    @Size(min = 3)
    String fatherName;
    @NotNull
    @NotBlank
    @Size(min = 2)
    String position;
    @NotNull
    @NotBlank
    @Size(min = 8)
    String password;
}
