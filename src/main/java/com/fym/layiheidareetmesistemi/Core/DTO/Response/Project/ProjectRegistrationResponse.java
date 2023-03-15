package com.fym.layiheidareetmesistemi.Core.DTO.Response.Project;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public class ProjectRegistrationResponse {
    String projectName;
    String registrationDate;
    String lbm;
    String about;
    String note;
    String settlementAndVillage;
    String buildingAndHouse;
    String expirationDate;
    String additionalExpirationDate;
    Double completedPercent;
}
