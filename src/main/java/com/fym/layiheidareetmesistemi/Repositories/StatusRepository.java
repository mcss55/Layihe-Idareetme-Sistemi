package com.fym.layiheidareetmesistemi.Repositories;

import com.fym.layiheidareetmesistemi.Models.ProjectProperties.Status;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StatusRepository extends JpaRepository<Status, Integer> {
}
