import java.util.Scanner;

public class BmiCalc {

	
	public static void main(String[] args) {

		try {
			Scanner input = new Scanner(System.in);

			double weight = 0;
			double height = 0;

			System.out.print("enter weight in kg : ");
			weight = input.nextDouble();

			System.out.print("enter height in meters : ");
			height = input.nextDouble();

			double result = weight / (height * height / 10000);
			input.close();

			System.out.println("your BMI index is : " + result);

		} catch (Exception e) {
			e.printStackTrace();

		}

	}

}
