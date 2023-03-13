package com.fym.layiheidareetmesistemi.Core.Rules.Abstracts.Employee;

import com.fym.layiheidareetmesistemi.Core.DTO.Request.Employee.EmployeeRegistrationRequest;

public interface IEmployeeRules {
//    bu hisseni mence daha yaxsi elemek olar her class ucun ayrica elemekdense
//    her yerde tekrarlanacaq jeneric classnan elyek bele zulm olacaq
//    yadaki validation lybray olmamis olmaz idi onu istifade etmek olar
    void checkPasswordLength(EmployeeRegistrationRequest employee);
    void checkFirstNameLength(EmployeeRegistrationRequest employee);
    void checkFatherNameLength(EmployeeRegistrationRequest employee);
    void checkLastNameLength(EmployeeRegistrationRequest employee);
    void checkNullFields(EmployeeRegistrationRequest employee);
}
