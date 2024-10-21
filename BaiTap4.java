package MSVTechnologyGroup;

import java.util.Scanner;

public class BaiTap4 {
	public static void main(String[] args) {
		System.out.println("Thu Nhap Moi Thang : ");
		Scanner scanner = new Scanner(System.in);
		double thuNhap = scanner.nextDouble(); // Đọc số thực từ bàn phím

		// Chuyển đổi số thu nhập sang đơn vị VND
		double changeMoney = thuNhap * 1000000;
		System.out.println("Thu Nhap Cua Toi La: " + changeMoney + " Đồng");

		int moNey = (int) thuNhap; // Chuyển đổi số thu nhập sang kiểu int

		if (moNey < 10) {
			System.out.println("Không đóng thuế.");
		} else if (10 <= moNey && moNey <= 15) {
			System.out.println("Thuế 10%");
		} else if (15 <= moNey && moNey <= 30) {
			System.out.println("Thuế 20%");
		} else if (30 <= moNey && moNey <= 50) {
			System.out.println("Thuế 30%");
		} else if (50 <= moNey && moNey <= 100) {
			System.out.println("Thuế 40%");
		}

		scanner.close();
	}
}
