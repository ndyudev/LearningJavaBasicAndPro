package lab03;

import java.util.Arrays;
import java.util.Scanner;

public class BaiTap03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap Phan Tu Cua Arrayy : ");
		int size = sc.nextInt();
		int [] a = new int[size];
		System.out.println("Nhap Phan Tu : ");
		// For Reading The Element
		for (int i = 0; i < size ; i ++ ) {
			a[i] = sc.nextInt();
		}
		System.out.println("Array ban dau : " + Arrays.toString(a));
		Arrays.sort(a);
		System.out.println("Array sap xep :" + Arrays.toString(a));
		System.out.println(" max = " + a[a.length -1 ]);
		System.out.println(" min = " + a[a.length -1 ]);
		}
}
