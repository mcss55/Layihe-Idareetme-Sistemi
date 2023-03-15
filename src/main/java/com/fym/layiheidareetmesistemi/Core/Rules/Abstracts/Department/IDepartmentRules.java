package com.fym.layiheidareetmesistemi.Core.Rules.Abstracts.Department;

import com.fym.layiheidareetmesistemi.Core.DTO.Request.Department.DepartmentRegistrationRequest;

public interface IDepartmentRules {
    void checkDepartmentNameLength(DepartmentRegistrationRequest department);
    void checkNullFields(DepartmentRegistrationRequest department);
}
