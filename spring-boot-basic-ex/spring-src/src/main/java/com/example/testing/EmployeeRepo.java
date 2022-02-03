package com.example.testing;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.testing.Employee;

import java.util.Optional;

public interface EmployeeRepo extends JpaRepository<Employee, Integer> {
    void deleteEmployeeById(int id);

    Optional<Employee> findEmployeeById(int id);
}
