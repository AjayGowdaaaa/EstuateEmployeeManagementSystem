package com.employeeManagement.service;

import java.io.InputStream;
import java.util.List;
import java.util.Optional;

import javax.print.DocFlavor.INPUT_STREAM;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.multipart.MultipartFile;

import com.employeeManagement.entity.Employee;

public interface EmployeeServiceInterface {

	String uploadPhoto(String path, MultipartFile file,Long empId);

	InputStream getResource(String path, Long empId);
	
	Employee addEmployee(Employee employee);

	List<Employee> getAllEmployees();

	Employee getEmployeeById(Long empId);

	Employee deleteEmployeeById(Long empId);

	Employee updateEmployee(Long empId, Employee employee);

	Employee getEmployeeByPhone(Long phone);

	Employee getEmployeeByEmail(String email);
	
	Optional<Employee> findById(Long id);
}
