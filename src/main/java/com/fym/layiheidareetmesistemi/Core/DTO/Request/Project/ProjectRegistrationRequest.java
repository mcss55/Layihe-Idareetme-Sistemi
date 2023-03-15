package com.fym.layiheidareetmesistemi.Core.DTO.Request.Project;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@RequiredArgsConstructor
public class ProjectRegistrationRequest {

    @NotNull
    @NotBlank
    @Size(min = 3)
    String projectName;
    @NotNull
    @NotBlank
    @Size(min = 7)
    String registrationDate;
    @NotNull
    @NotBlank
    @Size(min = 3)
    String lbm;
    @NotNull
    @NotBlank
    @Size(min = 3)
    String about;
    @NotNull
    @NotBlank
    @Size(min = 3)
    String note;
    @NotNull
    @NotBlank
    @Size(min = 3)
    String settlementAndVillage;
    @NotNull
    @NotBlank
    @Size(min = 3)
    String buildingAndHouse;
    @NotNull
    @NotBlank
    @Size(min = 3)
    String expirationDate;
    String additionalExpirationDate;
    Double completedPercent;

}
