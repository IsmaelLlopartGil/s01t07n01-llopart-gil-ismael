package edu.n7.exercise_2;

public class FaceToFaceWorker extends Worker {

	private static final int PRICE_KM = 1;

	public FaceToFaceWorker(String name, String lastName, int hourlyWage) {
		super(name, lastName, hourlyWage);
	}

	@Override
	public int calculateSalary(int hoursWorked) {
		return super.calculateSalary(hoursWorked);
	}

	public int calculateSalary(int hoursWorked, int kmTraveled) {
		return calculateSalary(hoursWorked) + (kmTraveled * PRICE_KM);
	}

	@Deprecated
	public void clearAll() {
		this.name = " ";
		this.lastName = " ";
		this.hourlyWage = 0;
	}
}
