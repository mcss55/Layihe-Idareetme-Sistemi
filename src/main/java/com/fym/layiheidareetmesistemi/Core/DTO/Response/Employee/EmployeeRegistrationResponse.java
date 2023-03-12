package com.fym.layiheidareetmesistemi.Core.DTO.Response.Employee;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class EmployeeRegistrationResponse {
        String firstName;
        String lastName;
        String fatherName;
        String position;
        String password;
}
