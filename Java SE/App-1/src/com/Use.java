package com;

public class Use {
	
	
	public static void main(String[] args) {

		Employee_V3 e1 = new Employee_V3();
		Employee_V3 e2 = new Employee_V3();
		
		e1.setEmpId(10);
		e1.setEmpName("Ozvitha");
		e1.setSalary(438384);
		
		e2.setEmpId(11);
		e2.setEmpName("Kavya");
		e2.setSalary(348384);

		e1.display();
		e2.display();

	}


}
