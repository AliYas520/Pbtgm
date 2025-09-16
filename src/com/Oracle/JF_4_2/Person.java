package com.Oracle.JF_4_2;

public class Person {
	
	private String name;
	private int age;
	
	public Person(String n, int a) {
		name = n;
		age = a;
	}
	
	public String getPersonName() {
		return name;
	}
	public int getPersonAge() {
		return age;
	}
	
	public void setPersonName(String name) {
		this.name = name;
	}
	public void setPersonAge(int age) {
		this.age = age;
	}
}
