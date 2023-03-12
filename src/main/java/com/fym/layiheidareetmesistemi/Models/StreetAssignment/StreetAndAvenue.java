package com.fym.layiheidareetmesistemi.Models.StreetAssignment;

import com.fym.layiheidareetmesistemi.Models.Project;
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
@Table(name = "streets_and_avenues")
public class StreetAndAvenue {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    @Column(name = "name")
    String name;
    @Column(name = "assignment")
    String assignment;

    @OneToMany(mappedBy = "streetAssignment")
    List<Project> project;

}
