package com.letsstartcoding.spring.repository;

import com.letsstartcoding.spring.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@SuppressWarnings("unused")
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}