package cristianofmc.com.github.employeemanager.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import cristianofmc.com.github.employeemanager.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    
}
