package com.logicbig.AnnotssationxxsJava;

import org.springframework.data.repository.CrudRepository;
import com.logicbig.example.*;

public interface EmployeeRepository extends CrudRepository<Employee, Long> {

}