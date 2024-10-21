package Lab05;

import java.util.Scanner;
import java.util.ArrayList;

public class Bai01 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        ArrayList<Double> arrNumber = new ArrayList<>();

        while (true) {
            System.out.println("Nhập vào một số thực bất kì:");
            double input = scanner.nextDouble();
            arrNumber.add(input);
            scanner.nextLine(); // Clear buffer

            System.out.println("Continue? Y or N ???");
            String option = scanner.nextLine();
            if (option.equalsIgnoreCase("N")) {
                break;
            }
        }

        System.out.println("Check array: " + arrNumber);
        double sum = 0;
        
        // Fix vòng lặp for
        for (int i = 0; i < arrNumber.size(); i++) {  // Đổi <= thành <
            sum += arrNumber.get(i);
        }

        System.out.println("Sum of array: " + sum);
        scanner.close();
    }
}
