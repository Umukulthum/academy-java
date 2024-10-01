package com.bptn.course._06_oop;

class TechDepartment extends Department {

	private double totalPurchaseAmount;

	public TechDepartment(String departmentName, int numberOfEmployees, double totalPurchaseAmount) {
		super(departmentName, numberOfEmployees);
		this.totalPurchaseAmount = totalPurchaseAmount;
	}

}
