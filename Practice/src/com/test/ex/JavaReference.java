package com.test.ex;

public class JavaReference {

	int j=80;
	static int i=8;
	public static void main(String[] args) {

		JavaReference javaReference= new JavaReference();
		Employee emp= new Employee();
		emp.setId("1213");
		emp.setName("Vinay");
		emp.setRoolno(12313);
		
		System.out.println(javaReference.j);
		//JavaReference.getName(emp);
		
		System.out.println(emp.getName());
		
	}
	
	public static void getName(Employee emp){
		
		System.out.println(i);
		
		i++;
		System.out.println(i+1);
		
		Employee emp1= new Employee(emp);
		
		
		emp1.setName("Megha");
	}

}
