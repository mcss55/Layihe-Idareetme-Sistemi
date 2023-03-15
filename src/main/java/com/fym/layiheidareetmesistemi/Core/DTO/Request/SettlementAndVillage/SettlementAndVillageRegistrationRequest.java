package com.fym.layiheidareetmesistemi.Core.DTO.Request.SettlementAndVillage;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SettlementAndVillageRegistrationRequest {

    @NotNull
    @NotBlank
    @Size(min = 3)
    String name;
}