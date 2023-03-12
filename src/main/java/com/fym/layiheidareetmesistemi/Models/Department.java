package com.fym.layiheidareetmesistemi.Models;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

import java.util.List;
import java.util.Set;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Table(name = "departments")
public class Department {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    @Column(name = "name")
    String name;
    @OneToMany(mappedBy = "department")
    List<Employee> employee;

    @ManyToMany(mappedBy = "departments")
    Set<Project> projects;
    @Column(name = "department_job_percent")
    Double jobPercent;
    @Column(name = "department_completed_percent")
    Double completedPercent;
}
