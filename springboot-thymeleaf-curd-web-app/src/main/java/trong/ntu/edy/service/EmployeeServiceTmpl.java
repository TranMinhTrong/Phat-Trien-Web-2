package trong.ntu.edy.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
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
	
	@Override
	public void saveEmployee(Employee employee) {
		// TODO Auto-generated method stub
		this.employeeReoonsitory.save(employee);
	}

	@Override
	public Employee getEmployeeById(long id) {
		// TODO Auto-generated method stub
		Optional<Employee> optinal= employeeReoonsitory.findById(id);
		Employee employee = null;
		if (optinal.isPresent()) {
			employee = optinal.get();
		}else {
			throw new RuntimeException("Employee not found for id :: "+id);
			
		}
		return employee;
	}

	@Override
	public void deleteEmployeeById(long id) {
		// TODO Auto-generated method stub
		this.employeeReoonsitory.deleteById(id);
		
	}

	@Override
	public Page<Employee> findPaginated(int pageNo, int pageSize) {
		// TODO Auto-generated method stub
		Pageable pageable =PageRequest.of(pageNo -1, pageSize);
		return this.employeeReoonsitory.findAll(pageable);
	}

}
