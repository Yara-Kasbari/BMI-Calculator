package Java_Assignment1;

import java.util.Scanner;

public class Sec4_1200245 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);

		double max = 0.0; // Decalaring and initializing max ,maxId and maxAge to use them
		int maxAge = 0; // for finding the maximum energy ratio for age and id
		int maxId = 0;
		double carbohydrates = 0; // declaring and initializing carbohydrates,
									// fats,protein
		double fat = 0;
		double protein = 0;
		while (true) { // while loop to check if the input number is -1

			System.out.println("Ask the user to enter the person ID ( -1 to end) : ");
			int ID = scan.nextInt();
			if (ID == -1) // if statment that check if the input ==-1 , if it is ==-1 then it will break
				break; // and will print the avarege of grams and calories and the max energy ration
			System.out.println("Ask the user to enter Age  ( -1 to end) : ");
			int Age = scan.nextInt();
			if (Age == -1)
				break;
			System.out.println("Ask the user to enter the amount of carbohydrates in grams  ( -1 to end) : ");
			carbohydrates = scan.nextDouble();
			if (carbohydrates == -1)
				break;
			System.out.println("Ask the user to enter the amount of fat in grams  ( -1 to end) : ");
			fat = scan.nextDouble();
			if (fat == -1)
				break;
			System.out.println("Ask the user to enter the amount of protein in grams  ( -1 to end) : ");
			protein = scan.nextDouble();
			if (protein == -1)
				break; // break when the user enter -1 it will exit the loop .

			// calling the methods
			System.out.println("Total Grams : " + totalInGrams(carbohydrates, fat, protein)); // calling totalInGrams
			System.out.println("Total Calorie : " + totalInCalories(carbohydrates, fat, protein)); // calling
																									// totalInCalories
			percentOfCalories(carbohydrates, fat, protein); // calling percentOfCalories

			// finding the max energy ratio
			double ProteinEnergyRatio = protein / (carbohydrates + fat);
			if (ProteinEnergyRatio > max) {
				max = ProteinEnergyRatio;
				maxAge = Age;
				maxId = ID;

			}

		}

		// calling the methods that will print on the screen when the user
		// enter -1.

		System.out.println("Average Grams : " + avaregeGrams(carbohydrates, fat, protein));
		System.out.println("Avarege Calories : " + avaregeCalories(carbohydrates, fat, protein));
		System.out.println("Person " + maxId + "  Age  " + maxAge + "  has the maximum Protein:Energy Ratio.");

	}

	// a method to calculate the total in grams
	public static double totalInGrams(double carbs, double protein, double fats) {
		double total = carbs + protein + fats;
		return total;
	}

	// a method that converts the grams to calories then calculating its total in
	// calories.
	public static double totalInCalories(double carbs, double fats, double protein) {

		double calories = (carbs * 4) + (fats * 9) + (protein * 4);
		return calories;
	}

	// calculating the percent for every input and finding the protein energy ratio
	public static void percentOfCalories(double carbs, double fats, double protein) {

		double calories = (carbs * 4) + (fats * 9) + (protein * 4);
		double ProteinEnergyRatio = protein / (carbs + fats); // calculating the protein energy ratio
		double percent1 = ((carbs * 4) / calories) * 100; // finding the % for carbs
		double percent2 = ((fats * 9) / calories) * 100; // finding the % for fats
		double percent3 = ((protein * 4) / calories) * 100; // finding the % for protein

		System.out.println("Percent of calories from each macronutrient:");
		System.out.printf("Carbohydrate : %.1f%%\n", percent1); // %% means to print the percent after the number
		System.out.printf("fats : %.1f%%\n", percent2);
		System.out.printf("protein : %.1f%%\n", percent3);
		System.out.printf("Protein:Energy Ratio : %.1f\n ", ProteinEnergyRatio);

	}

	// a method that calulates the avarege grams
	public static double avaregeGrams(double carbs, double fats, double protein) {

		double AverageGrams = totalInGrams(carbs, fats, protein) / 3;
		return AverageGrams;
	}

	// calculating avarege calories
	public static double avaregeCalories(double carbs, double fats, double protein) {

		double avaregeCalories = totalInCalories(carbs, fats, protein) / 3;
		return avaregeCalories;
	}

}
