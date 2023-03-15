package com.fym.layiheidareetmesistemi.Core.Rules.Concretes.Department;

import com.fym.layiheidareetmesistemi.Core.DTO.Request.Department.DepartmentRegistrationRequest;
import com.fym.layiheidareetmesistemi.Core.Exceptions.Department.DepartmentException;
import com.fym.layiheidareetmesistemi.Core.Rules.Abstracts.Department.IDepartmentRules;

public class DepartmentRules implements IDepartmentRules {
    @Override
    public void checkDepartmentNameLength(DepartmentRegistrationRequest department) {
        if(department.getName().length() < 3)
            throw new DepartmentException("Şöbə adı minimum 3 uzunluğunda olmalıdı!");
    }

    @Override
    public void checkNullFields(DepartmentRegistrationRequest department) {
        if(department.getName() == null )
            throw new DepartmentException("Şöbə adı boş olmamalıdır!");
    }
}
