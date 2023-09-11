package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.EmployeeMissingSkillset;
import com.example.demo.model.EmployeeSkillset;
import com.example.demo.service.ValidateSkillsApplicationService;

@RestController
public class ValidateSkills {
	
	@Autowired
	ValidateSkillsApplicationService validateSkillsApplicationService;	
	@PostMapping("/employeemanagement/v1/validateEmployeeSkills")
	public ResponseEntity validateSkills(@RequestBody EmployeeSkillset employeeSkillset)
	{
		EmployeeMissingSkillset employeeMissingSkillset = validateSkillsApplicationService.validateSkills(employeeSkillset);
		return new ResponseEntity(employeeMissingSkillset, HttpStatus.CREATED);
	}
}