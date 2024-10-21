package chapter8;

public class Pig implements IAnimal {
    @Override
    public void animalSound() {
        // Thân của phương thức animalSound() được cung cấp ở đây
        System.out.println("The pig says: wee wee");
    }

    public void sleep() {
        // Thân của phương thức sleep() được cung cấp ở đây
        System.out.println("Zzz");
    }

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}
}
