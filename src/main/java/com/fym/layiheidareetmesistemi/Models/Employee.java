package com.fym.layiheidareetmesistemi.Models;


import com.fym.layiheidareetmesistemi.Core.Enums.Role;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Table(name = "employees")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    @Column(name = "first_name")
    String firstName;
    @Column(name = "last_name")
    String lastName;
    @Column(name = "father_name")
    String fatherName;
    @Column(name = "user_name",unique = true)
    String userName;
    @Column(name = "position")
    String position;
    @Column(name = "password")
    String password;
    @ManyToOne
    @JoinColumn(name = "department_id", referencedColumnName = "id")
    Department department;
    @Column(name = "employee_job_percent")
    Double jobPercent;
    @Column(name = "employee_completed_percent")
    Double completedPercent;
    @Column(name = "role")
    Role role;
    @ManyToOne
    @JoinColumn(name = "job_id")
    Job job;
}
