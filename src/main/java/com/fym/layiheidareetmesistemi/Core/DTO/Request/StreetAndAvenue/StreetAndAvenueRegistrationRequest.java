package com.fym.layiheidareetmesistemi.Core.DTO.Request.StreetAndAvenue;

import jakarta.persistence.Column;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class StreetAndAvenueRegistrationRequest {

    @NotNull
    @NotBlank
    @Size(min = 3)
    String name;
    @NotNull
    @NotBlank
    @Size(min = 3)
    String assignment;

}
