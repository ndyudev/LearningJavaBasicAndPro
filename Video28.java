package lab04;

public class Video28 {
	public static void main(String[] args) {
		System.out.println("Run Bai Video 26");
		Student st1 = new Student();
		
		Student st2 = new Student("Eric", 26);
		st2.setName("Eric new setName");
		System.out.println("Check obj :" + st2.getName() + " and age =" + st2.getAge());
	}
}
