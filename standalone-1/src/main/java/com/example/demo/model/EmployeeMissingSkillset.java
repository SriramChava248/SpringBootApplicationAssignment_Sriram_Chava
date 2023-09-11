package com.example.demo.model;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;
@Component
public class EmployeeMissingSkillset {

	private String empId;
	private List<String> missingSkills = new ArrayList<>();
	public String getEmpId() {
		return empId;
	}
	public void setEmpId(String empId) {
		this.empId = empId;
	}
	public List<String> getMissingSkills() {
		return missingSkills;
	}
	public void setMissingSkills(List<String> missingSkills) {
		this.missingSkills = missingSkills;
	}
	@Override
	public String toString() {
		return "EmployeeMissingSkillset [empId=" + empId + ", missingSkills=" + missingSkills + "]";
	}
}
