package com.fym.layiheidareetmesistemi.Core.DTO.Request.Department;

import jakarta.persistence.OneToMany;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DepartmentRegistrationRequest {
    @NotNull
    @NotBlank
    @Size(min = 3)
    String name;

}
