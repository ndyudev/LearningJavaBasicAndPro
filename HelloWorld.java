package MSVTechnologyGroup;

import java.util.Scanner;

public class HelloWorld {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("First number : " + Math.sqrt(81));
		int firstNumber = scanner.nextInt();
		System.out.println("Second number: ");
		int secondNumber = scanner.nextInt();
		System.out.println("Min = " + Math.min(firstNumber, secondNumber));
		scanner.close();
	}
}
