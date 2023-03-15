package com.fym.layiheidareetmesistemi.Core.DTO.Response.Customer;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CustomerRegistrationResponse {
    String firstName;
    String legalAddress;
    String actualAddress;
    String phoneNumber;
    String voen;
}
