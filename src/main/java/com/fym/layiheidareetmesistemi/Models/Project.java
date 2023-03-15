package com.fym.layiheidareetmesistemi.Models;
import com.fym.layiheidareetmesistemi.Models.ProjectProperties.Priority;
import com.fym.layiheidareetmesistemi.Models.ProjectProperties.Status;
import com.fym.layiheidareetmesistemi.Models.RegionSettlement.RegionAndCity;
import com.fym.layiheidareetmesistemi.Models.StreetAssignment.StreetAndAvenue;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

import java.util.Set;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Table(name = "projects")
public class Project {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "customer_id")
    Customer customer;
    @Column(name = "name")
    String projectName;
    @Column(name = "registration_date")
    String registrationDate;
    @Column(name = "lbm")
    String lbm;
    @Column(name = "about")
    String about;
    @Column(name = "note")
    String note;
    @ManyToOne
    @JoinColumn(name = "region_id")
    RegionAndCity regionAndCity;

    @Column(name = "settlement_and_village")
    String settlementAndVillage;
    @ManyToOne
    @JoinColumn(name = "atreet_and_avenue_id")
    StreetAndAvenue streetAssignment;
    @Column(name = "building_house")
    String buildingAndHouse;
    @Column(name = "expiration_date")
    String expirationDate;
    @Column(name = "additional_expiration_date")
    String additionalExpirationDate;
    @ManyToMany
    @JoinTable(name = "project_department",
            joinColumns = @JoinColumn(name = "project_id"),
            inverseJoinColumns = @JoinColumn(name = "department_id"))
    Set<Department> departments;
    @ManyToOne
    @JoinColumn(name = "priority_id", referencedColumnName = "id")
    Priority priority;
    @ManyToOne
    @JoinColumn(name = "status_id", referencedColumnName = "id")
    Status status;

    @Column(name = "project_completed_percent")
    Double completedPercent;
}
