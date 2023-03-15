package com.fym.layiheidareetmesistemi.Core.DTO.Request.NonWorkingDay;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class NonWorkingDayRegistrationRequest {

    @NonNull
    @NotBlank

    Date date;
}
