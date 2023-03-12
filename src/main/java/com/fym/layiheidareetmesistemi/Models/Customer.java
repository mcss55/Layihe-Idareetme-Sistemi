package com.fym.layiheidareetmesistemi.Models;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Table(name = "customers")
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    @Column(name = "name")
    String name;
    @Column(name = "legal_address")
    String legalAddress;
    @Column(name = "actual_address")
    String actualAddress;
    @Column(name = "phone_number")
    String phoneNumber;
    @Column(name = "voen")
    String voen;

    @OneToMany(mappedBy = "customer")
    List<Project> projects;
}
