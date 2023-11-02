package com.example.obezuana.Repositories;

import com.example.obezuana.Models.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepositories extends JpaRepository<Employee, Integer> {
    Employee findByFirst_Name(String first_name);
}