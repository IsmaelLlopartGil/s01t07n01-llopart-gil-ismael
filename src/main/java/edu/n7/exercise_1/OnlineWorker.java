package edu.n7.exercise_1;

public class OnlineWorker extends Worker {

	private static final int FLAT_RATE = 40;

	public OnlineWorker(String name, String lastName, int hourlyWage) {
		super(name, lastName, hourlyWage);
	}

	@Override
	public int calculateSalary(int hoursWorked) {
		return super.calculateSalary(hoursWorked) + FLAT_RATE;
	}
}
