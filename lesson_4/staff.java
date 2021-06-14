package com.vti.entily;

public class staff {
	private String name;
	private int age;
	private Gender gender;
	private String address;
	
	public staff(String name, int age, Gender gender, String address) {
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.address = address;
		
	}
	public String getName() {
		return name;
		
	}
	@Override
	public String toString() {
		return "Staff [name=" + name + ", age= " + age + ", gender="+
	gender + " , address=" +address+ "]";
		
	}
}
