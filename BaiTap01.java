package lab03;

import java.util.Scanner;

public class BaiTap01 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhập vào một số nguyên bất kì:");
		int value = scanner.nextInt();

//		1 < xxx < value 
		int count = 0;
		for (int i = 2; i < value - 1; i++) {
			if (value % i == 0) {
				System.out.println("Ước Số Khác" + i);
				count++;
				break;
			}
		}
		if (count == 0) {
			System.out.printf("%d là số nguyên tố", +value);
		} else {
			System.out.printf("&d là số KHÔNG LÀ SỐ nguyên tố", value);
		}
	}
}
