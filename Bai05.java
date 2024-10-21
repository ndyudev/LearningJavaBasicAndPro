package lab02;

public class Bai05 {

	public static void main(String[] args) {
		String[] clubs = { "MU", "Mancity", "Liverpool" };
		clubs[0] = "Arsenal";
		String[] a = new String[5];
		a[0] = "1";

		String[] cars = { "Volvo", "BMW", "Mercedes", "Ferrari" };
		for (int i = 0; i < cars.length; i++) {
			System.out.println(cars[i]);
		}
	}
}
