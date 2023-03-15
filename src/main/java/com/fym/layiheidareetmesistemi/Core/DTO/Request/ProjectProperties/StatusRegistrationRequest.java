package com.fym.layiheidareetmesistemi.Core.DTO.Request.ProjectProperties;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class StatusRegistrationRequest {

    @NotNull
    @NotBlank
    @Size(min = 3)
    String name;
}