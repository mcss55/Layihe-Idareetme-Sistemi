package com.fym.layiheidareetmesistemi.Services.Abstarcts.Employee;

import com.fym.layiheidareetmesistemi.Core.DTO.Request.Employee.EmployeeRegistrationRequset;
import com.fym.layiheidareetmesistemi.Models.Employee;

import java.util.List;

public interface IEmployeeService {
    List<Employee> getAllEmployees();
    void addEmployee(EmployeeRegistrationRequset employee);
}
