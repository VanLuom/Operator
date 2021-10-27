package basic.dev;

import java.security.DrbgParameters.NextBytes;
import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap a");
		int a = sc.nextInt();
		System.out.println("Nhap b");
		int b = sc.nextInt();
		
		// Tổng
		int tong = a + b ;
		System.out.println("Tong: " + tong);
		// Hiệu
		int hieu = a - b;
		System.out.println("Hieu: " + hieu);
		// Thương
		int thuong = a / b;
		System.out.println("Thuong: " + thuong);
		// Tích
		int tich = a * b;
		System.out.println("Tich: " + tich);
		// Bien c
		boolean c = a > b;
		System.out.println("So sanh lon: " + c);
		c = a < b;
		System.out.println("So sanh nhỏ: " + c);
		c = a >= b;
		System.out.println("Lon hon hoac bang: " + c);
		c = a <= b;
		System.out.println("nho hon hoac bang: " + c);
		
		
		
		
		

	}

}
