package com.fym.layiheidareetmesistemi.Core.DTO.Request.Employee;

import com.fym.layiheidareetmesistemi.Core.Enums.Role;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class EmployeeRegistrationRequset {

    String firstName;
    String lastName;
    String fatherName;
    String userName;
    String position;
    String password;
    Role role;
}
