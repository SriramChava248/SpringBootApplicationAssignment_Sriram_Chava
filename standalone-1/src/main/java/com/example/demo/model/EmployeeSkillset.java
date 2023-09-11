package com.example.demo.model;

import java.util.ArrayList;
import java.util.List;

public class EmployeeSkillset {
	private String empID;
	private List<String> requiredSkills = new ArrayList<>();
	private List<String> actualSkills = new ArrayList<>();
	public String getEmpID() {
		return empID;
	}
	public void setEmpID(String empID) {
		this.empID = empID;
	}
	public List<String> getRequiredSkills() {
		return requiredSkills;
	}
	public void setRequiredSkills(List<String> requiredSkills) {
		this.requiredSkills = requiredSkills;
	}
	public List<String> getActualSkills() {
		return actualSkills;
	}
	public void setActualSkills(List<String> actualSkills) {
		this.actualSkills = actualSkills;
	}
	@Override
	public String toString() {
		return "EmployeeSkillset [empID=" + empID + ", requiredSkills=" + requiredSkills + ", actualSkills="
				+ actualSkills + "]";
	}
}
