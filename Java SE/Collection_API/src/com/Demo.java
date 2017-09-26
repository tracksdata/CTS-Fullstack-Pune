package com;

public class Demo  {

	public static void main(String[] args) {

		Employee emp=new Employee() {
			
			@Override
			public void f1() {
				System.out.println("-- testing ");
				
			}
			
			@Override
			public void f2() {
				// TODO Auto-generated method stub
				
			}
		};
	
		emp.f1();

	}

	

	

}
