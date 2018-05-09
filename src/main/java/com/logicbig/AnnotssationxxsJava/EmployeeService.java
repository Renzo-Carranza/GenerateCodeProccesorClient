package com.logicbig.AnnotssationxxsJava;

import java.util.Collection;

import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.logicbig.example.*;


@Service
@Transactional
public class EmployeeService {
        
        @Autowired
	protected EmployeeRepository employeeRepository;
        
	public Employee saveEmployee(Employee Employee) {
		return employeeRepository.save(Employee);
	}

	public Boolean deleteEmployee(Long id) {
		Employee temp = employeeRepository.findOne(id);
		if(temp!=null){
                  employeeRepository.delete(temp);
                  return true;
		}
		return false;
	}

	public Employee editEmployee(Employee employee) {
		return employeeRepository.save(employee);
	}

        public Collection<Employee> getAllEmployee() {
		Iterable<Employee> itr = employeeRepository.findAll();
		return (Collection<Employee>)itr;
	}

	public Employee findEmployee(Long id) {
		return employeeRepository.findOne(id);
	}
}
