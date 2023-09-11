package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.EmployeeMissingSkillset;
import com.example.demo.model.EmployeeSkillset;

@Service
public class ValidateSkillsApplicationService {
	
	@Autowired
	EmployeeMissingSkillset employeeMissingSkillset;
	
	public EmployeeMissingSkillset validateSkills(EmployeeSkillset employeeSkillset)
	{
		employeeMissingSkillset.setEmpId(employeeSkillset.getEmpID());
		employeeSkillset.getRequiredSkills().removeIf(skill->employeeSkillset.getActualSkills().stream()
				.anyMatch(skill2->skill2.equalsIgnoreCase(skill)));
		employeeMissingSkillset.setMissingSkills(employeeSkillset.getRequiredSkills());
		return employeeMissingSkillset;
	}
}
