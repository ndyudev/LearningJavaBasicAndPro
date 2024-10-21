package lab02;

import java.util.Scanner;

public class Bai03 {
	public static void main(String[] args) {
		// - Nếu số điện <= 100 => số tiền = số điện x 1000
		// - Nếu số điện > 100
		// => số tiền = 100 * 1000 + (số điện - 100) * 1500
		Scanner scanner = new Scanner(System.in);

		System.out.println("Chuong trinh tinh tien dien");
		System.out.printf("Nhap vao so dien");
		int a = scanner.nextInt();
		if (a <= 100) {
			int money = a * 1000;
			System.out.println("So tien dien bang =" + money);
		} else {
			int money = 100 * 1000 + (a - 100) * 1500;
			System.out.println("So tien dien = " + money);
		}
		scanner.close();
	}

}
