package com.chandu;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee employee=new Employee(143,"chandu", 60000.45);
		System.out.println(employee);
		
		System.out.println("*************************");
		
		Employee employee2=new Employee();
		employee2.setId(143);
		employee2.setName("chandu");
		employee2.setSalary(60000.45);
		System.out.println(employee2.getId()+"  "+employee2.getName()+"  "+employee2.getSalary());

	}

}
