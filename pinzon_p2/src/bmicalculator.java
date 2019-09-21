import java.util.Scanner;
public class bmicalculator {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		
		/*bmi categories and values*/
		System.out.println("BMI Categories: ");
		System.out.println("Underweight = < 18.5");
		System.out.println("Normal weight = 18.5-24.9");
		System.out.println("Overweight = 25-29.9");
		System.out.println("Obesity = BMI of 30 or over");
		
		
		System.out.println("Enter weight(lbs): ");
		int weight = scnr.nextInt();/*weight in lbs*/
		
		System.out.println("Enter height(in): ");
		int height = scnr.nextInt();/*height in inches*/
		
		double bmi = (703 * weight)/(Math.pow(height, 2)); /*formula for bmi with height(inches)and weight(lbs)*/
		
		if(bmi <= 18.5) {
			System.out.printf("Your BMI: %.2f is Underweight",bmi);
		}
		else if(bmi >= 18.5 && bmi <= 24.9) {
			System.out.printf("Your BMI: %.2f is Normal weight",bmi);
		}
		else if(bmi >= 25.0 && bmi <= 29.9) {
			System.out.printf("Your BMI: %.2f is Overweight",bmi);
		}
		else if(bmi >= 30.0) {
			System.out.printf("Your BMI: %.2f is Obesity",bmi);
		}
		else {
			System.out.printf("invalid input"); /*default output if none of the conditions above are met*/
			
			scnr.close();
		}
		
		
		
		

	}

}
