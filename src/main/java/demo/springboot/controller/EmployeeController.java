package demo.springboot.controller;

import demo.springboot.model.Employee;
import demo.springboot.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = {"${app.security.cors.origin}"})
@RequestMapping("/api/employee")
public class EmployeeController {
    @Autowired
    private EmployeeRepository employeeRepository;

    @GetMapping(path="getAllEmployees", produces = "application/json")
    public Iterable<Employee> findAll() {
        return employeeRepository.findAll();
    }

    @PostMapping(path="createEmployee", consumes = "application/json", produces = "application/json")
    @ResponseStatus(HttpStatus.CREATED)
    public Employee create(@RequestBody Employee employee) {
        return employeeRepository.save(employee);
    }
}
