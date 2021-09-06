package com.project.employeemanager.Repositories;

import com.project.employeemanager.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

    @Transactional
    void deleteEmployeeById(Long id); //QueryMethods

    Optional<Employee> findEmployeeById(Long id);
}
