package trong.ntu.edy.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import trong.ntu.edy.model.Employee;
import trong.ntu.edy.reposvice.EmployeeRespository;

@Service
public class EmployeeServiceTmpl implements EmployeeService{

	@Autowired
	private EmployeeRespository employeeReoonsitory;
	@Override
	public List<Employee> getAllEmployees() {
		return employeeReoonsitory.findAll();
	}

}
