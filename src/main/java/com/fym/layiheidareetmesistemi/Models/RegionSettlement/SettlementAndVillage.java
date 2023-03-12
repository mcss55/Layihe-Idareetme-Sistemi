package com.fym.layiheidareetmesistemi.Models.RegionSettlement;

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
@Table(name = "settlements_and_villages")
public class SettlementAndVillage {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    @Column(name = "name")
    String name;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "region_and_city_id")
    RegionAndCity regionAndCity;
}
