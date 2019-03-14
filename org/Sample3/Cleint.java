package org.Sample3;
import org.Sample3.Employee;
import org.Sample3.Company;
public class Cleint {
public void clientName() {
	System.out.println("Air Inida");

}
public static void main(String[] args) {
	Cleint ci= new Cleint();
	ci.clientName();
	Employee details=new Employee();
	details.empId();
	details.empName();
	details.division();
	details.salary();
	Company e=new Company();
	e.companyName();
	e.compID();
}
	
}
