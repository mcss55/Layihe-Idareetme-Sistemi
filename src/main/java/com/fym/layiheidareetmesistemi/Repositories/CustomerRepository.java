package com.fym.layiheidareetmesistemi.Repositories;

import com.fym.layiheidareetmesistemi.Models.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {
}
