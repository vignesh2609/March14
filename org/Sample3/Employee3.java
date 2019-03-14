package org.Sample3;

public class Employee3 {
	private void empId(String name) {
		System.out.println(name);
	}
	public void empId(int regno, long phno) {
	System.out.println(regno+"\n"+phno);

	}
	public void empId(long rollno,String serialno) {
	System.out.println(rollno+"\n"+serialno);	

	}
public static void main(String[] args) {
	Employee3 emp=new Employee3();
	emp.empId("Vignesh");
	emp.empId(12345, 987564231);
	emp.empId(123456789, "asdfgh");
}
}
	
