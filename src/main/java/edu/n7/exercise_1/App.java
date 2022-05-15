package edu.n7.exercise_1;

public class App {

	public static void main(String[] args) {

		OnlineWorker worker1 = new OnlineWorker("Lorem", "Ipsum", 35);
		System.out.println("Salari 1: " + worker1.calculateSalary(160));

		FaceToFaceWorker worker2 = new FaceToFaceWorker("John", "von Neumann", 500);
		System.out.println("Salari 2: " + worker2.calculateSalary(160, 600));
	}

}
