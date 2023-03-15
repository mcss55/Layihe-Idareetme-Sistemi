package com.fym.layiheidareetmesistemi.Core.Rules.Abstracts.Employee;

import com.fym.layiheidareetmesistemi.Core.DTO.Request.Employee.EmployeeRegistrationRequest;

public interface IEmployeeRules {
    void checkPasswordLength(EmployeeRegistrationRequest employee);
    void checkFirstNameLength(EmployeeRegistrationRequest employee);
    void checkFatherNameLength(EmployeeRegistrationRequest employee);
    void checkLastNameLength(EmployeeRegistrationRequest employee);
    void checkNullFields(EmployeeRegistrationRequest employee);
}
