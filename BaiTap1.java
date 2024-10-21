package MSVTechnologyGroup;

import java.util.Scanner;

public class BaiTap1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhập tên :");
		String name = scanner.nextLine();

		System.out.println("Nhập Điểm :");
		int score = scanner.nextInt();

		System.out.println(name + " có điểm = " + score);

		scanner.close();
	}
}
