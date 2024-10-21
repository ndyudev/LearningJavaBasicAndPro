package chapter6;

import java.util.ArrayList;

public class Video38 {
    public static void main(String[] args) {

        Student st1 = new Student("Hoi Dan IT", "1");
        Student st2 = new Student("Nguyễn Van A", "1");
        Student st3 = new Student("Eric Pham", "1");
        Student st4 = new Student("Trần Văn Nam", "1");
        Student st5 = new Student("Nguyễn Hary Pham", "1");

        ArrayList<Student> arr = new ArrayList<>();
        arr.add(st5);
        arr.add(st4);
        arr.add(st3);
        arr.add(st2);
        arr.add(st1);
        
        // Sửa lỗi trong vòng lặp for
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i).getName().startsWith("Nguyễn")) {
                System.out.println("Start with Nguyễn: " + arr.get(i));
            }
    }
		
        System.out.println(">>> Check array: " + arr);
////		System.out.println("Nhap vao user name:");
////		Scanner scanner = new Scanner (System.in);
////		String username = scanner.nextLine();
////		
////		
////		System.out.println("Nhap vao password:");
////		String password = scanner.nextLine();
////		
////		
////		System.out.println("username =" + username + "password =" +password);
////		
////		if(username.equals("hoidanit") && password.length () > 6){
////			System.out.println("Valid input");
////			
////			
//
//		}
//	//			scanner.close();
	}
}
