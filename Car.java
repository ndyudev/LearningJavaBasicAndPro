package chapter6;

public class Car extends Vehicle {
	private String modelName = "Mustang"; // Car attribute
	 public static void main(String[] args) {
	 // Create a myCar object
	 Car myCar = new Car();
	 // Call the honk() method (from the Vehicle class) on the myCar object
	 myCar.honk();
	 // Display the value of the brand attribute (from the Vehicle class) and the value of the 
	 System.out.println(myCar.brand + " " + myCar.modelName);
	 }

}
