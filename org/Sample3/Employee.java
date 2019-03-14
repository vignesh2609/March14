package org.Sample3;

public class Employee {
	public void empId() {
		System.out.println("2541");
	}
	public void empName() {
		System.out.println("Vignesh");

	}
	public void division() {
		System.out.println("Testing");

	}
	public void salary() {
		System.out.println("150000");

	}
	public static void main(String[] args) {
		Employee details=new Employee();
		details.empId();
		details.empName();
		details.division();
		details.salary();
	}

}
