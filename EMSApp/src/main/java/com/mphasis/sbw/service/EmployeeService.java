package com.mphasis.sbw.service;

import java.util.List;

import com.mphasis.sbw.dto.EmployeeDTO;

public interface EmployeeService {

	public void createOrUpdateEmployee(EmployeeDTO empDTO);
	
	public List<EmployeeDTO> getAllEmployee();
	
	public void deleteEmployee(Long id);
	
	public EmployeeDTO editEmployee(Long id);
	
}
