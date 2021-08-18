package cristianofmc.com.github.employeemanager.service;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import cristianofmc.com.github.employeemanager.model.Employee;
import cristianofmc.com.github.employeemanager.repository.EmployeeRepository;

@Service
public class EmployeeService{
    private final EmployeeRepository employeeRepository;

    @Autowired
    public EmployeeService(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    public Employee addEmployee(Employee employee){
        employee.setEmployeeCode(UUID.randomUUID().toString());
        return employeeRepository.save(employee);
    }
}
