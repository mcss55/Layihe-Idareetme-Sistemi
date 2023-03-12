package com.fym.layiheidareetmesistemi.Core.Rules.Concretes.Employee;

import com.fym.layiheidareetmesistemi.Core.DTO.Request.Employee.EmployeeRegistrationRequset;
import com.fym.layiheidareetmesistemi.Core.Exceptions.Employee.EmployeeException;
import com.fym.layiheidareetmesistemi.Core.Rules.Abstracts.Employee.IEmployeeRules;
import org.springframework.stereotype.Service;

@Service
public class EmployeeRules implements IEmployeeRules {

    @Override
    public void checkPasswordLength(EmployeeRegistrationRequset employee)  {
        if (employee.getPassword().length() < 8) throw new EmployeeException("Şifrə uzunluğu minimum 8 olmalıdır!");
    }

    @Override
    public void checkFirstNameLength(EmployeeRegistrationRequset employee) {

        if (employee.getPassword().length() < 3) throw new EmployeeException("İşçi adının uzunluğu minimum 3 olmalıdır!");
    }

    @Override
    public void checkFatherNameLength(EmployeeRegistrationRequset employee) {
        if (employee.getPassword().length() < 3) throw new EmployeeException("İşçi ata adının uzunluğu minimum 3 olmalıdır!");
    }

    @Override
    public void checkLastNameLength(EmployeeRegistrationRequset employee) {
        if (employee.getPassword().length() < 3) throw new EmployeeException("İşçi soyadının uzunluğu minimum 3 olmalıdır!");
    }

    @Override
    public void checkNullFields(EmployeeRegistrationRequset employee) {

        if (employee.getFirstName() == null) throw new EmployeeException("İşçi adı boş olmamalıdır!");
        if (employee.getLastName() == null) throw new EmployeeException("İşçi soyadı boş olmamalıdır!");
        if (employee.getFatherName() == null) throw new EmployeeException("İşçi ata adı boş olmamalıdır!");
        if (employee.getPassword() == null) throw new EmployeeException("İşçi şifrəsi boş olmamalıdır!");
        if (employee.getPosition() == null) throw new EmployeeException("İşçi vəzifəsi boş olmamalıdır!");

    }


}