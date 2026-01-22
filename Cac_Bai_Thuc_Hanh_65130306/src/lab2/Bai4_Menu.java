/**
 * Viết chương trình tổ chức 1 menu gồm 3 chức năng để gọi 3 bài trên và một chức
năng để thoát khỏi ứng dụng.
 */
package lab2;
import java.util.Scanner;

public class Bai4_Menu {

	public static void main(String[] args) {
		menu();
	}
	
	public static void menu()
	{
		Scanner scanner = new Scanner(System.in);
		int chon;
		
		do
		{
			
			System.out.println("1. Giai phuong trinh bac 1.");
			System.out.println("2. Giai phuong trinh bac 2.");
			System.out.println("3. Tinh tien dien.");
			System.out.println("4. Ket thuc.");
			System.out.print("Chon chuc nang tu 1-4: ");
			chon = scanner.nextInt();
			
			switch (chon)
			{
			case 1: 
					GiaiPT1();
					break;
			case 2: 
					GiaiPT2();
					break;
			case 3: 
					Tinhtiendien();
					break;
			case 4: 
					System.out.println("Ket thuc chuong trinh!");
					break;
			default:
					System.out.println("Khong ton tai!");
			}
		}
		while (chon != 4);
	}
	
	// Giai PT Bac 1
	public static void GiaiPT1() {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Nhap he so a: ");
		double a = scanner.nextDouble();
		
		System.out.print("Nhap he so b: ");
		double b = scanner.nextDouble();
		
		if(a == 0)
		{
			if(b == 0) 
			{
				System.out.println("Phuong trinh vo so nghiem.");
			}
			else
			{
				System.out.println("Phuong trinh vo nghiem.");
			}
		}
		else 
		{
			System.out.printf("Phuong trinh co nghiem la: %.2f\n", -b/a);
		}
	}
	
	// Giai PT Bac 2
	public static void GiaiPT2() {
		
		Scanner scanner = new Scanner (System.in);
		
		System.out.print("Nhap he so a: ");
		double a = scanner.nextDouble();
		
		System.out.print("Nhap he so b: ");
		double b = scanner.nextDouble();
		
		System.out.print("Nhap he so c: ");
		double c = scanner.nextDouble();
		
		if(a == 0)
		{
			if(b == 0)
			{
				if(c == 0) 
				{
					System.out.println("Phuong trinh vo so nghiem.");
				}
				else
				{
					System.out.println("Phuong trinh vo nghiem.");
				}
			}
			else 
			{
				System.out.printf("Phuong trinh co nghiem la x = %.2f\n", -c/b);
			}
		}
		else
		{
			double Delta = Math.pow(b,2) - 4 * a * c;
			
			if(Delta < 0)
			{
				System.out.println("Phuong trinh vo nghiem.");
			}
			else if(Delta == 0) 
			{
				System.out.printf("Phuong trinh co nghiem kep x = %.2f\n", -b/(2*a));
			}
			else 
			{
				System.out.println("Phuong trinh co hai nghiem phan biet: ");
				System.out.printf("x1 = %.2f\n", (-b + Math.sqrt(Delta))/(2*a));
				System.out.printf("x2 = %.2f\n", (-b - Math.sqrt(Delta))/(2*a));
			}
		}
	}
	
	//Tinh Tien Dien
	public static void Tinhtiendien() {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Nhap so dien cua thang: ");
		double sodien = scanner.nextDouble();
		double tien;
		if(sodien >=0  && sodien <= 50)
		{
			tien = sodien * 1000;
		}
		else 
		{
			tien = 50*1000 + (sodien - 50)*1200;
		}
		
		System.out.printf("So tien dien phai dong la: %.0f VND\n", tien);
	}
}
