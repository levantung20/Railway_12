package com.vti.entity;

public class Employee extends Staff{
	private String task;
	
	public Employee(String name, int age , Gender gender, String address,
			String task) {
			super(naem ,age, gender, address);
			this.task = task;
			
	}
	@Override
	public String toString() {
		return super.toString()+ "Position: Employee [task=" + task +
				"]";
		
	}
}
