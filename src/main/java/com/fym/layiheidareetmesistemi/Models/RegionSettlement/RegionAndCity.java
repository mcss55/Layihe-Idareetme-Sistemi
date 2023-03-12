package com.fym.layiheidareetmesistemi.Models.RegionSettlement;

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
@Table(name = "regions_and_cities")
public class RegionAndCity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    @Column(name = "name")
    String name;
    @OneToMany(mappedBy = "regionAndCity")
    List<SettlementAndVillage> settlementAndVillage;

    @OneToMany(mappedBy = "regionAndCity")
    List<Project> project;
}
