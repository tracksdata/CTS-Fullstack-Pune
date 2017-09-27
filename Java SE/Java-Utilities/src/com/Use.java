package com;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Use {

	public static void main(String[] args) {

		Calendar c1 = Calendar.getInstance();
		c1.set(1987, 7, 23);

		Calendar c2 = Calendar.getInstance();
		c2.set(1990, 2, 12);

		Calendar c3 = Calendar.getInstance();
		c3.set(1987, 3, 27);

		Calendar c4 = Calendar.getInstance();
		c4.set(1967, 9, 15);

		Calendar c5 = Calendar.getInstance();
		c5.set(1990, 4, 17);

		Employee e1 = new Employee(76, "Kim", 15000, c1);
		Employee e2 = new Employee(23, "Mim", 21000, c2);
		Employee e3 = new Employee(11, "Jim", 19000, c3);
		Employee e4 = new Employee(17, "Aim", 13000, c4);
		Employee e5 = new Employee(12, "Cim", 11000, c5);

		List<Employee> emps = new ArrayList<>();
		emps.add(e1);
		emps.add(e2);
		emps.add(e3);
		emps.add(e4);
		emps.add(e5);

		System.out.println("--- Original Data ---");
		Employee.display(emps);

		// Sort on EmpId
		System.out.println("--- Sort on Emp Id---");

		Collections.sort(emps);

		Employee.display(emps);

		// Sort on Emp Name
		System.out.println("--- Sort on Emp-Name ---");

		Collections.sort(emps, new Employee());

		Employee.display(emps);

		// Sort on Emp Salary
		System.out.println("--- Sort on Emp-Salary ---");

		Collections.sort(emps, new SortBySalary());

		Employee.display(emps);
		
		// Sort on Emp DOB
		System.out.println("--- Sort on Emp-DOB ---");

		Collections.sort(emps, new Comparator<Employee>() {
			@Override
			public int compare(Employee emp1, Employee emp2) {
				// TODO Auto-generated method stub
				return emp1.getDob().compareTo(emp2.getDob());
			}
		});

		Employee.display(emps);

	}

}


class SortBySalary implements Comparator<Employee> {
	@Override
	public int compare(Employee emp1, Employee emp2) {
		// TODO Auto-generated method stub
		return (int) (emp1.getSalary() - emp2.getSalary());
	}
}
