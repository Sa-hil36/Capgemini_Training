package com.cg;

import com.cg.Exception.EmployeeNotFoundException;
import com.cg.dto.EmployeeDTO;
import com.cg.dto.EntityMapper;
import com.cg.entity.Employee;
import com.cg.repo.IEmployeeRepo;
import com.cg.service.EmployeeService;
import com.cg.service.IEmployeeService;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDate;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

@SpringBootTest
@ExtendWith(MockitoExtension.class)
class ApplicationTests {

//	@Autowired
	@Mock
	private IEmployeeRepo repo;
	@InjectMocks
	private EmployeeService service;

//	@Test
//	void testEmployeeById(){
//		assertNotNull(service.getEmployee(602));
//		assertThrows(EmployeeNotFoundException.class, ()->service.getEmployee(222));
//		assertEquals("sahil", service.removeEmployee(602),getFullName());
//	}

	@Test
	void testEmployeeById(){
		EmployeeDTO eDto = new EmployeeDTO("Raghav", LocalDate.of(2002,10,12), 34000.00);
		eDto.setEmployeeId(1001);
		Employee emp = EntityMapper.convertObjectToEntity(eDto);
		Optional<Employee> op = Optional.of(emp);
		when(repo.findById(1001)).thenReturn(op);
		assertNotNull(service.getEmployee(1001));
		assertEquals("Raghav", service.getEmployee(1001).getFullName());
		assertEquals(LocalDate.of(2002,10,12), service.getEmployee(1001).getDateofbirth());
	}

	@Test
	void testEmployeeByIdWithException(){
		when(repo.findById(1002)).thenThrow(EmployeeNotFoundException.class);
		assertThrows(EmployeeNotFoundException.class,()->service.getEmployee(1002));
	}

	@Test
	void testEmployeeByName() {
		EmployeeDTO edDto = new EmployeeDTO("Sahil", LocalDate.of(2004,10,2), 40000000.0);
		edDto.setEmployeeId(1003);

		Employee emp = EntityMapper.convertObjectToEntity(edDto);

		List<Employee> empList = List.of(emp);
		when(repo.findByName("Sahil")).thenReturn(empList);
		List<EmployeeDTO> result = service.getEmployeeByName("Sahil");

		assertNotNull(result);
		assertEquals(1,result.size());
		assertEquals("Sahil", result.get(0).getFullName());
	}

	@Test
	void testEmployeeByNameException() {

		when(repo.findByName("Sahil")).thenThrow(EmployeeNotFoundException.class);

		assertThrows(EmployeeNotFoundException.class, () -> {
			service.getEmployeeByName("Sahil");
		});
	}

	@Test
	void testGetAllEmployees() {
		EmployeeDTO e1 = new EmployeeDTO("Sahil", LocalDate.of(2004,10,2), 40000000.0);
		e1.setEmployeeId(1001);
		EmployeeDTO e2 = new EmployeeDTO("Rahul", LocalDate.of(2003,5,15), 30000000.0);
		e2.setEmployeeId(1002);
		Employee emp1 = EntityMapper.convertObjectToEntity(e1);
		Employee emp2 = EntityMapper.convertObjectToEntity(e2);
		List<Employee> empList = List.of(emp1, emp2);
		when(repo.findAll()).thenReturn(empList);
		List<EmployeeDTO> result = service.getAllEmployee();
		assertNotNull(result);
		assertEquals(2, result.size());
		assertEquals("Sahil", result.get(0).getFullName());
		assertEquals("Rahul", result.get(1).getFullName());
	}

	@Test
	void testGetAllEmployeesException() {

		when(repo.findAll()).thenThrow(EmployeeNotFoundException.class);

		assertThrows(EmployeeNotFoundException.class, () -> {
			service.getAllEmployee();
		});
	}
	@Test
	void testDeleteEmployee() {
//		Employee emp = new Employee("Raghav", LocalDate.of(2002,2,1),34000.0);
//		emp.setEmp_id(1001);
//		Optional<Employee> op = Optional.of(emp);
//		when(repo.findById(1001)).thenReturn(op);
		String result = service.removeEmployee(1001);
		assertEquals("Employee Deleted", result);
	}

	@Test
	void testUpdateEmployee(){
		EmployeeDTO dto = new EmployeeDTO("sahil", LocalDate.of(2003,2,23), 300000.0);
		dto.setEmployeeId(1001);
		Employee oldEmp = EntityMapper.convertObjectToEntity(dto);
		dto.setFullName("manav");

		Employee updatedEmp = EntityMapper.convertObjectToEntity(dto);
		when(repo.findById(1001)).thenReturn(Optional.of(oldEmp));
		when(repo.saveAndFlush(any(Employee.class))).thenReturn(updatedEmp);

		EmployeeDTO res = service.updateEmployee(dto);
		assertEquals("manav", res.getFullName());
	}
}
