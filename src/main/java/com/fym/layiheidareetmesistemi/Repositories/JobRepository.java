package com.fym.layiheidareetmesistemi.Repositories;

import com.fym.layiheidareetmesistemi.Models.Job;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JobRepository extends JpaRepository<Job, Integer> {
}
