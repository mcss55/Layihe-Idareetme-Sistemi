package com.fym.layiheidareetmesistemi.Core.DTO.Request.Customer;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CustomerRegistrationRequest {


    @NotNull
    @NotBlank
    @Size(min = 3)
    String firstName;

    @NotNull
    @NotBlank
    @Size(min = 3)
    String legalAddress;
    @NotNull
    @NotBlank
    @Size(min = 3)
    String actualAddress;
    @NotNull
    @NotBlank
    @Size(min = 10, max = 10)
    String phoneNumber;
    @NotNull
    @NotBlank
    @Size(min = 3)
    String voen;
}
