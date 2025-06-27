package OOP.application;

import OOP.data.Company;

public class NestedApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Company company = new Company();
		company.setName("Daffa");
		
		Company.Employee employee = company.new Employee();
		employee.setName("Dermawan");
		System.out.println(employee.getCompany());	
	}

}
