package com.fym.layiheidareetmesistemi.Core.DTO.Request.Job;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class JobRegistrationRequest {

    @NotNull
    @NotBlank
    @Size(min = 3)
    String jobName;
}
