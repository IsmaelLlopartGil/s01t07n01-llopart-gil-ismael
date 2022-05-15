package edu.n7.exercise_1;

public class Worker {

	protected String name;
	protected String lastName;
	protected int hourlyWage;

	public Worker(String name, String lastName, int hourlyWage) {
		this.name = name;
		this.lastName = lastName;
		this.hourlyWage = hourlyWage;
	}

	public int calculateSalary(int hoursWorked) {

		return hourlyWage * hoursWorked;
	}

}
