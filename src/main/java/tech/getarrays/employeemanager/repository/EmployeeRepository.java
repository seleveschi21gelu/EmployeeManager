package tech.getarrays.employeemanager.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tech.getarrays.employeemanager.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Long> {
}
