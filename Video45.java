package chapter7;

public class Video45 {
	public static void main(String[] args) {
		System.out.println("run video 45");
		
		SinhVien it1 = new SinhVienIT(10, 7);
		System.out.println("sinh vien it score = " + it1.getScore());
		
		SinhVien cokhi1 = new SinhVienCoKhi(6,9);
		System.out.println("sinh vien co khi score = " + cokhi1.getScore());
	}
}
