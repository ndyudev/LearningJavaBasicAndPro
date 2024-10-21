package MSVTechnologyGroup;

import java.util.Scanner;

public class BaiTap2 {
	public static void main(String[] args) {
		// - chu vi hình chữ nhật
		// - diện tích hình chữ nhật
		// - cạnh nhỏ nhất của hình chữ nhật

		System.out.println("Nhập vào chiều rộng hình chữ nhật:");
		Scanner scanner = new Scanner(System.in);
		int chieuRong = scanner.nextInt();

		System.out.println("Nhập vào chiều dài hình chữ nhật:");
		int chieuDai = scanner.nextInt();

		int chuVi = (chieuDai + chieuRong) * 2;
		int dienTich = (chieuDai * chieuRong);
		int canhMin = Math.min(chieuDai, chieuRong);

		System.out.println("Chu Vi = " + chuVi);
		System.out.println("Diện Tích = " + dienTich);
		System.out.println("Cạnh Min = " + canhMin);

		scanner.close();

	}
}
