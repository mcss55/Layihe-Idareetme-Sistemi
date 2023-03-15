package com.fym.layiheidareetmesistemi.Repositories;

import com.fym.layiheidareetmesistemi.Models.ProductionCalendar.NonWorkingDay;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NonWorkingDayRepository extends JpaRepository<NonWorkingDay, Integer> {
}
