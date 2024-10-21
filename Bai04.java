package lab02;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Bai04 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// Chọn ngôn ngữ
		System.out.println("Choose language (Chọn ngôn ngữ):");
		System.out.println("1. English");
		System.out.println("2. Tiếng Việt");
		System.out.print("Your choice (Lựa chọn của bạn): ");
		int langChoice = scanner.nextInt();

		// Cài đặt ngôn ngữ dựa trên lựa chọn
		Locale locale;
		switch (langChoice) {
		case 1:
			locale = Locale.ENGLISH; // Sử dụng ngôn ngữ tiếng Anh
			break;
		case 2:
			locale = new Locale("vi", "VN"); // Sử dụng ngôn ngữ tiếng Việt
			break;
		default:
			System.out.println(
					"Invalid choice. English language will be used by default. (Lựa chọn không hợp lệ. Ngôn ngữ Tiếng Anh sẽ được sử dụng mặc định.)");
			locale = Locale.ENGLISH; // Mặc định sử dụng ngôn ngữ tiếng Anh
			break;
		}
		Locale.setDefault(locale);

		// Hiển thị menu
		System.out.println(">>              PROGRAM MANAGEMENT (QUẢN LÝ CHƯƠNG TRÌNH)           <<");
		System.out.println("++ ----------------------------------------------------------------- ++");
		System.out.println("| 1. Solve linear equation (Giải phương trình bậc nhất)            |");
		System.out.println("| 2. Solve quadratic equation (Giải phương trình bậc hai)           |");
		System.out.println("| 3. Calculate and print electricity bill (Tính và in hóa đơn điện) |");
		System.out.println("| 4. Print tax bill (Khai báo thu nhập và in hóa đơn thuế)                              |");
		System.out.println("| 5. Exit (Thoát)                                                   |");
		System.out.println("++ ----------------------------------------------------------------- ++");

		int choice;
		do {
			System.out.print("Select function (Chọn chức năng): ");
			choice = scanner.nextInt();

			switch (choice) {
			case 1:
				solveLinearEquation(scanner); // Chọn chức năng giải phương trình bậc nhất
				break;
			case 2:
				solveQuadraticEquation(scanner); // Chọn chức năng giải phương trình bậc hai
				break;
			case 3:
				calculateAndPrintElectricityBill(scanner); // Chọn chức năng tính và in hóa đơn điện
				break;
			case 4:
				printTaxBill(scanner); // Chọn chức năng in hóa đơn thuế
				break;
			case 5:
				System.out.println("Exiting program... (Đang thoát chương trình...)");
				break;
			default:
				System.out.println("Invalid choice. Please choose again. (Lựa chọn không hợp lệ. Vui lòng chọn lại.)");
				break;
			}

			if (choice != 5) {
				System.out.print(
						"Do you want to use another function? (yes/no) (Bạn có muốn sử dụng chức năng khác không?): ");
				String cont = scanner.next();
				if (!cont.equalsIgnoreCase("yes")) {
					break;
				}
			}
		} while (choice != 5);

		scanner.close();
	}

	// Giải phương trình bậc nhất
	public static void solveLinearEquation(Scanner scanner) {
		// Hiển thị thông điệp và nhập dữ liệu từ bàn phím
		System.out.println(">>              SOLVE LINEAR EQUATION (GIẢI PHƯƠNG TRÌNH BẬC NHẤT)           <<");
		System.out.print("Enter coefficient a (Nhập hệ số a): ");
		int a = scanner.nextInt();
		System.out.print("Enter coefficient b (Nhập hệ số b): ");
		int b = scanner.nextInt();
		System.out.printf("Equation: %dx + %d = 0\n", a, b);
		// Kiểm tra và giải phương trình bậc nhất
		if (a == 0) {
			if (b == 0) {
				System.out.println("The equation has infinitely many solutions. (Phương trình có vô số nghiệm.)");
			} else {
				System.out.println("The equation has no solution. (Phương trình không có nghiệm.)");
			}
		} else {
			float x = (float) b / a;
			System.out.println("Solution of the equation: x = " + x + " (" + x + ")");
		}
	}

	// Giải phương trình bậc hai
	public static void solveQuadraticEquation(Scanner scanner) {
		// Hiển thị thông điệp và nhập dữ liệu từ bàn phím
		System.out.println(">>              SOLVE QUADRATIC EQUATION (GIẢI PHƯƠNG TRÌNH BẬC HAI)           <<");
		System.out.print("Enter coefficient a (Nhập hệ số a): ");
		int a = scanner.nextInt();
		System.out.print("Enter coefficient b (Nhập hệ số b): ");
		int b = scanner.nextInt();
		System.out.print("Enter coefficient c (Nhập hệ số c): ");
		int c = scanner.nextInt();
		System.out.printf("Equation: %dx^2 + %dx + %d = 0\n", a, b, c);
		// Kiểm tra và giải phương trình bậc hai
		if (a == 0) {
			System.out.println(
					"Coefficient a must be nonzero to form a quadratic equation. (Hệ số a phải khác không để tạo thành phương trình bậc hai.)");
			return;
		}
		double delta = b * b - 4 * a * c;
		if (delta < 0) {
			System.out.println("The equation has no solution. (Phương trình không có nghiệm.)");
		} else if (delta == 0) {
			double x = -b / (2.0 * a);
			System.out.println("The equation has a double root: x = " + x + " (" + x + ")");
		} else {
			double x1 = (-b + Math.sqrt(delta)) / (2 * a);
			double x2 = (-b - Math.sqrt(delta)) / (2 * a);
			System.out.println("The equation has two distinct roots: x1 = " + x1 + ", x2 = " + x2
					+ " (Phương trình có hai nghiệm phân biệt: x1 = " + x1 + ", x2 = " + x2 + ")");
		}
	}

	// Tính và in hóa đơn tiền điện
	public static void calculateAndPrintElectricityBill(Scanner scanner) {
		// Hiển thị thông điệp và nhập dữ liệu từ bàn phím
		System.out.println(">>              ELECTRICITY BILL (HÓA ĐƠN TIỀN ĐIỆN)           <<");
		System.out.print("Enter electricity usage (kWh) (Nhập lượng điện sử dụng (kWh)): ");
		int electricityUsage = scanner.nextInt();
		double electricityCost = calculateElectricityCost(electricityUsage);
		printElectricityBill(electricityUsage, electricityCost);
	}

	// Tính chi phí điện
	public static double calculateElectricityCost(int electricityUsage) {
		double cost = 0;
		if (electricityUsage <= 50) {
			cost = electricityUsage * 1000;
		} else if (electricityUsage <= 100) {
			cost = 50 * 1000 + (electricityUsage - 50) * 1200;
		} else if (electricityUsage <= 200) {
			cost = 50 * 1000 + 50 * 1200 + (electricityUsage - 100) * 1500;
		} else {
			cost = 50 * 1000 + 50 * 1200 + 100 * 1500 + (electricityUsage - 200) * 2000;
		}
		return cost;
	}

	// In hóa đơn tiền điện
	public static void printElectricityBill(int electricityUsage, double electricityCost) {
		// Hiển thị thông điệp
		System.out.println(">>              ELECTRICITY BILL (HÓA ĐƠN TIỀN ĐIỆN)           <<");
		System.out.println("++ ----------------------------------------------------------------- ++");

		// Lấy ngày và giờ hiện tại
		LocalDateTime dateTime = LocalDateTime.now();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
		String formattedDateTime = dateTime.format(formatter);

		// In thông tin hóa đơn
		System.out.println("| Date and time (Ngày và giờ): " + formattedDateTime + "               |");
		System.out.println("| Electricity usage (Lượng điện sử dụng): " + electricityUsage + " kWh         |");
		System.out.println("| Electricity cost (Chi phí điện): " + electricityCost + " VND          |");
		System.out.println("++ ----------------------------------------------------------------- ++");
	}

	// In hóa đơn thuế
	public static void printTaxBill(Scanner scanner) {
		// Hiển thị thông điệp và nhập dữ liệu từ bàn phím
		System.out.println(">>              TAX BILL (HÓA ĐƠN THUẾ)           <<");
		System.out.print("Enter taxable income (VND) (Nhập thu nhập chịu thuế (VND)): ");
		double income = scanner.nextDouble();
		double tax = calculateTax(income);

		// Lấy ngày và giờ hiện tại
		LocalDateTime dateTime = LocalDateTime.now();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
		String formattedDateTime = dateTime.format(formatter);

		// In thông tin hóa đơn thuế
		System.out.println("++ ----------------------------------------------------------------- ++");
		System.out.println("| Date and time (Ngày và giờ): " + formattedDateTime + "               |");
		System.out.println("| Taxable income (Thu nhập chịu thuế): " + income + " VND         |");
		System.out.println("| Tax (Thuế): " + tax + " VND          |");
		System.out.println("++ ----------------------------------------------------------------- ++");
	}

	// Tính thuế
	public static double calculateTax(double income) {
		if (income <= 5000000) {
			return income * 0.05;
		} else if (income <= 10000000) {
			return 250000 + (income - 5000000) * 0.1;
		} else if (income <= 18000000) {
			return 750000 + (income - 10000000) * 0.15;
		} else {
			return 1950000 + (income - 18000000) * 0.2;
		}
	}
}
