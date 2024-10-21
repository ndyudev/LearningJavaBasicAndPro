package chapter10;

public class Video61 extends Thread {
	
	public void run() {{
		System.out.println(" start thread");
		long sum = 0L;
		for (long i = 0L; i < 10000000000L; i++) {
		sum += i;
		}
		System.out.println(" end thread");
		// TODO Auto-generated method stub
		}
		System.out.println("Hello from in Thread!");
	}
	
	public static void main(String[] args) {
		
		int MAX = 8;
		for (int i = 0; i < MAX; i++) {
		(new Video61()).start();
		}
		System.out.println("finish");
	}
}
