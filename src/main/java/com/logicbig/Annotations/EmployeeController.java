package com.logicbig.Annotations;

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
@RequestMapping("/demoAngular")
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;

    @GetMapping("/getAllProductos")
    public List<Employee> getAllEmployee() {
        return (List<Employee>) employeeService.getAllEmployee();
    }

    @PostMapping("/createProducto")
    public Employee createEmployee(@Valid @RequestBody Employee employee) {
        return employeeService.saveEmployee(employee);
    }

    @GetMapping("/getProductoById/{id}")
    public Employee getEmployeeById(@PathVariable(value = "id") Long employeeId) {
        Employee employee = employeeService.findEmployee(employeeId);
        return employee;
    }

    @PutMapping("/updateProducto/{id}")
    public Employee updateemployee(@PathVariable(value = "id") Long employeeId,
            @Valid @RequestBody Employee employee) {
        employee.setId(employeeId);
        employeeService.saveEmployee(employee);
        return employee;
    }

    @DeleteMapping("/deleteProducto/{id}")
    public ResponseEntity<?> deleteEmployee(@PathVariable(value = "id") Long employeeId) {
        employeeService.deleteEmployee(employeeId);
        return ResponseEntity.ok().build();
    }

    @DeleteMapping("/deleteProducto/{id}")
    public ResponseEntity<?> delesssseEmployee(@PathVariable(value = "id") Long employeeId) {
        employeeService.deleteEmployee(employeeId);
        return ResponseEntity.ok().build();
    }
    
    
    @DeleteMapping("/deleteProducto/{id}")
    public ResponseEntity<?> delssssesssseEmployee(@PathVariable(value = "id") Long employeeId) {
        employeeService.deleteEmployee(employeeId);
        return ResponseEntity.ok().build();
    }
}
