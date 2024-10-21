package lab02;

import java.util.Scanner;

public class Bai02 {
	public static void giaiPhuongTrinhBacNhat(int a, int b) {
		System.out.printf("Giai Phuong Trinh Bat Nhat %dx + %d = 0 \n", a, b);

		if (a == 0 && b == 0) {
			System.out.println(" Phuong Trinh Co Vo So Nghiem");
		} else if (a == 0 && b != 0) {
			System.out.println("{Phuong Trinh Khong Co Nghiem");
		} else {
			float x = (float) b / a;
			System.out.printf("Phuong Trinh Co Nghiem = %.5f ", x);
		}
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Nhập vào biến a =");
		int a = scanner.nextInt();
		System.out.println("Nhập vào biến b =");
		int b = scanner.nextInt();
		System.out.println("Nhập vào biến c =");
		int c = scanner.nextInt();
		System.out.printf("Giai Phuong Trinh Bat Nhat %dx^2 + %dx + %d = 0 \n", a, b, c);

		if (a == 0) {
			// Xử lý phương trình bậc nhất
			giaiPhuongTrinhBacNhat(b, c);
		} else {
			int delta = b * b - 4 * a * c;
			if (delta < 0) {
				System.out.println("Phương Trình Vô Nghiệm");
			} else if (delta == 0) {
				float x = (float) -b / (2 * a);
				System.out.printf("Phương Trình Có Nghiệm Kép x = %.3f \n", x);
			} else {
				double x1 = (-b + Math.sqrt(delta)) / (2 * a);
				double x2 = (-b - Math.sqrt(delta)) / (2 * a);
				System.out.printf("Phương Trình Có 2 Nghiệm Riêng Biệt, x1=%.3f, x2=%.3f \n", x1, x2);
			}
		}
	}
}
