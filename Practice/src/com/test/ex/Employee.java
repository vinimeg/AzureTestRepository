package com.test.ex;

public class Employee {

	private String name;
	private Integer roolno;
	private String id;
	private Employee emp;
	
	public Employee(){
		
	}
	
	public Employee(Employee emp){
		this.emp=emp;
	}
	
	public Employee(String name, Integer roolno, String id) {
		super();
		this.name = name;
		this.roolno = roolno;
		this.id = id;
	}
	
	public Employee getEmp() {
		return emp;
	}

	public void setEmp(Employee emp) {
		this.emp = emp;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getRoolno() {
		return roolno;
	}
	public void setRoolno(Integer roolno) {
		this.roolno = roolno;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	
	
}
