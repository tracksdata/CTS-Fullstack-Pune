package com;

import java.util.ArrayList;
import java.util.List;

public class Use {
	
	public static void main(String[] args) {
		
		Department dept=new Department();
		dept.setDeptId(10);
		dept.setDeptName("IT");
		dept.setLoc("Pune");
		
		Address addr1=new Address();
		Address addr2=new Address();
		
		addr1.setAddrId(1);
		addr1.setHno("#834/A1");
		addr1.setCity("Pune");
		addr1.setAddrType("Current");
		
		
		addr2.setAddrId(2);
		addr2.setHno("#23652/N1");
		addr2.setCity("Hyderabad");
		addr2.setAddrType("Permanent");
		
		
		List<Address> addrs=new ArrayList<>();
		addrs.add(addr1);
		addrs.add(addr2);
		
		
		
		Employee emp=new Employee();
		emp.setEmpId(1024);
		emp.setEmpName("James");
		emp.setSalary(834734);
		
		emp.setDept(dept);
		emp.setAddrs(addrs);
		
		
		emp.display();
		
		
	}

}
