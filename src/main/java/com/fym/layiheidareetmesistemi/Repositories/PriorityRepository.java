package com.fym.layiheidareetmesistemi.Repositories;

import com.fym.layiheidareetmesistemi.Models.ProjectProperties.Priority;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PriorityRepository extends JpaRepository<Priority, Integer> {
}
