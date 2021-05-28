package demo.springboot.repository;

import demo.springboot.model.Employee;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface EmployeeRepository extends CrudRepository<Employee, Long> {
    List<Employee> findByEmployeeName(String employeeName);
}
