package MSVTechnologyGroup;

import java.util.Scanner;

public class BaiTap3 {
	public static void main(String[] args) {
//		System.out.println("Run Bai Tap 3");
		byte a = 100;
		short b = 1000;
		int c = 342532;
		System.out.println("Nhập vào cạnh hình lập phương :");
		Scanner scanner = new Scanner(System.in);
		int canh = scanner.nextInt();
		double theTich = Math.pow(canh, 3);
		System.out.println("Thể tích hình lập phương = " + theTich);

		scanner.close();
	}
}