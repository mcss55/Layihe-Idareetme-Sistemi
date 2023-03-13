package com.fym.layiheidareetmesistemi.Services.Concretes.Employee;

import com.fym.layiheidareetmesistemi.Core.DTO.Request.Employee.EmployeeRegistrationRequest;
import com.fym.layiheidareetmesistemi.Core.Rules.Concretes.Employee.EmployeeRules;
import com.fym.layiheidareetmesistemi.Core.Utils.Mappers.Concretes.ModelManager;
import com.fym.layiheidareetmesistemi.Models.Employee;
import com.fym.layiheidareetmesistemi.Repositories.EmployeeRepository;
import com.fym.layiheidareetmesistemi.Services.Abstarcts.Employee.IEmployeeService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class EmployeeService implements IEmployeeService {
    private final EmployeeRepository employeeRepository;
    private final ModelManager modelManager;
    private final EmployeeRules employeeRules;

    @Override
    public List<Employee> getAllEmployees() {return employeeRepository.findAll();}

    @Override
    public void addEmployee(EmployeeRegistrationRequest employeeRequest)  {

        this.employeeRules.checkNullFields(employeeRequest);
        this.employeeRules.checkFirstNameLength(employeeRequest);
        this.employeeRules.checkLastNameLength(employeeRequest);
        this.employeeRules.checkFatherNameLength(employeeRequest);
        this.employeeRules.checkPasswordLength(employeeRequest);

        Employee employee=this.modelManager.forRequest().map(employeeRequest, Employee.class);

        this.employeeRepository.save(employee);

    }
}
