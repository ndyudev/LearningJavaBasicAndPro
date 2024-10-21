package lab02;

import java.util.Arrays;
import java.util.Scanner;

public class Bai09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhập số lượng phần tử của Array:");
        int size = sc.nextInt();

        int[] a = new int[size];

        System.out.println("Nhập phần tử: ");

        // Đọc các phần tử của mảng
        for (int i = 0; i < size; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println("Arry ban đầu :" + Arrays.toString(a));
//        Arrays.sort(a);
//        System.out.println("Array sắp xếp :" + Arrays.toString(a));
//        System.out.println(" max = " + a[a.length - 1]);
//        System.out.println(" min = " + a[0]);
        int max = a[0];
        for(int i = 0; i < a.length; i ++) {
        	max = Math.max(max, a[i]);
        }
        
        int min = a[0];
        for(int i = 0; i < a.length; i++) {
        	min = Math.min(min, a[i]);
        }
        System.out.println(" max = " + max );
        System.out.println(" min = " + min );
        sc.close();  // Đóng đối tượng Scanner
    }
}
