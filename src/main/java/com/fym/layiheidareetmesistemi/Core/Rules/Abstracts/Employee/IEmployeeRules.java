package com.fym.layiheidareetmesistemi.Core.Rules.Abstracts.Employee;

import com.fym.layiheidareetmesistemi.Core.DTO.Request.Employee.EmployeeRegistrationRequset;

public interface IEmployeeRules {
    void checkPasswordLength(EmployeeRegistrationRequset employee);
    void checkFirstNameLength(EmployeeRegistrationRequset employee);
    void checkFatherNameLength(EmployeeRegistrationRequset employee);
    void checkLastNameLength(EmployeeRegistrationRequset employee);
    void checkNullFields(EmployeeRegistrationRequset employee);
}
