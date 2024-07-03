/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.csc325_oop_designreview_lab;

/**
 *
 * @author MoaathAlrajab
 */
public class Student extends Human {
	// ToDo 1: Make this class a child of Human
	// ToDo 2: Fix the resulting errors
	// ToDo 3: Add a field for GPA and create a setter and a getter

	private int credits;
	private double gpa;

	protected Student(String name, short age, int credits) {
		super(name, age);
		this.credits = credits;
	}

	// getter credits
	public int getCredits() {
		return credits;
	}

	// setter credits
	public void setCredts(int credits) {
		this.credits = credits;
	}

	// getter gpa
	public double getGpa() {
		return gpa;
	}

	// setter gpa
	public void setGpa(double gpa) {
		this.gpa = gpa;
	}

	@Override
	public String getAddress() {
		return "Address not set";
	}

	@Override
	public void setAddress(String address) {

	}

	// ToDo 4: Add comments to your code
}
