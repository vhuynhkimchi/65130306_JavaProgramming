/**
 Viết chương trình cho phép giải phương trình bậc hai trong đó các hệ số a, b và c
nhập từ bàn phím
 */
package lab2;
import java.util.Scanner;

public class Bai2_PTB2 {

	public static void main(String[] args) {
		
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
					System.out.print("Phuong trinh vo so nghiem.");
				}
				else
				{
					System.out.print("Phuong trinh vo nghiem.");
				}
			}
			else 
			{
				System.out.printf("Phuong trinh co nghiem la x = %.2f", -c/b);
			}
		}
		else
		{
			double Delta = Math.pow(b,2) - 4 * a * c;
			
			if(Delta < 0)
			{
				System.out.print("Phuong trinh vo nghiem.");
			}
			else if(Delta == 0) 
			{
				System.out.printf("Phuong trinh co nghiem kep x = %.2f", -b/(2*a));
			}
			else 
			{
				System.out.println("Phuong trinh co hai nghiem phan biet: ");
				System.out.printf("x1 = %.2f\n", (-b + Math.sqrt(Delta))/(2*a));
				System.out.printf("x2 = %.2f", (-b - Math.sqrt(Delta))/(2*a));
			}
		}
	}

}
