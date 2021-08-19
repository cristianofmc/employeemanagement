package cristianofmc.com.github.employeemanager.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

import cristianofmc.com.github.employeemanager.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    @Transactional
    void deleteEmployeeById(Long id);

    Optional<Employee> findEmployeeById(Long id);
}
