package com.ajp;

public class Department {

	public static void main(String[] args) {
		
		Employee e=new Employee();
		e.setId(801);
		e.setName("Mani");
		e.setSalary(99999999);
		e.setAddress("Hyderabad");
		e.setPincode(505232);
		
		
		System.out.println("ID- "+e.getId());
		System.out.println("NAME- "+e.getName());
		System.out.println("SALARY- "+e.getSalary()+"k");
		System.out.println("ADDRESS- "+e.getAddress());
		System.out.println("PINCODE- "+e.getPincode());

	}

}
