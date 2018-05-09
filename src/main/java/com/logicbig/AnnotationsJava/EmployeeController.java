package com.logicbig.AnnotationsJava;

import java.util.List;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.logicbig.example.*;

@RestController
@RequestMapping("/crudEmployee")
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;

    @GetMapping("/getAllEmployee")
    public List<Employee> getAll() {
        return (List<Employee>) employeeService.getAllEmployee();
    }

    @PostMapping("/createEmployee")
    public Employee create(@Valid @RequestBody Employee employee) {
        return employeeService.saveEmployee(employee);
    }

    @GetMapping("/getEmployeeById/{id}")
    public Employee getById(@PathVariable(value = "id") Long employeeId) {
        Employee employee = employeeService.findEmployee(employeeId);
        return employee;
    }

    @PutMapping("/update Employee/{id}")
    public Employee update(@PathVariable(value = "id") Long employeeId,
            @Valid @RequestBody Employee employee) {
        employee.setId(employeeId);
        employeeService.saveEmployee(employee);
        return employee;
    }

    @DeleteMapping("/delete Employee/{id}")
    public ResponseEntity<?> delete(@PathVariable(value = "id") Long employeeId) {
        employeeService.deleteEmployee(employeeId);
        return ResponseEntity.ok().build();
    }
}
