package com.Oracle.JF_4_2;

import java.util.Scanner;

public class Student {

	private int studentid;
	private String name;
	private String ssn;
	private double gpa;
	public final int SCHCODE = 34958; // Const int

	// constructor
	public Student(int x, String n, String s, double g) {
		studentid = x;
		name = n;
		ssn = s;
		gpa = g;
	}

	// Method to get a students id
	public int getStudentId() {
		return studentid;
	}

	// get the other param
	public String getStudentName() {
		return name;
	}

	public String getStudentSSN() {
		return ssn;
	}

	public double getStudentGPA() {
		return gpa;
	}

	// Mutator Method to set a students id
	public void setStudentId(int studentid) {
		this.studentid = studentid;
	}

	// Other Mutators
	public void setStudentName(String name) {
		this.name = name;
	}

	public void setStudentSSN(String ssn) {
		this.ssn = ssn;
	}

	public void setStudentGPA(double gpa) {
		this.gpa = gpa;
	}
}
