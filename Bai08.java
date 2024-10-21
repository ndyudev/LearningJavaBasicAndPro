package lab02;

import java.util.Scanner;

public class Bai08 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhập vào 1 số nguyên bất kì:");
		int x = scanner.nextInt();
		
		for(int i = 1 ; i<=10; i++) {
			System.out.printf(" %d x %d = %d ", x, i, x * i);
			System.out.println("\n");
		}
		
	}
}
