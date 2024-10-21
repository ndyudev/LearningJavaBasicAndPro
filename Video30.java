package lab04;

public class Video30 {
	public static void main(String[] args) {
		Product test = new Product();
		Product pr1 = test.nhapThongTin("computer", 200, 1.0);
		test.xuatThongTin(pr1);
		System.out.println(" tax = " + test.getTaxPrixce(pr1.getPrice(), pr1.getTax()));
	}
}
