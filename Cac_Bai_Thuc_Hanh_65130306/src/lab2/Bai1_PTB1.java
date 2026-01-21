/**
 Viết chương trình cho phép giải phương trình bậc nhất trong đó các hệ số a và b
nhập từ bàn phím
 */
package lab2;
import java.util.Scanner;

public class Bai1_PTB1 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Nhap he so a: ");
		double a = scanner.nextDouble();
		
		System.out.print("Nhap he so b: ");
		double b = scanner.nextDouble();
		
		if(a == 0)
		{
			if(b == 0) 
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
			System.out.printf("Phuong trinh co nghiem la: %.2f", -b/a);
		}
	}

}
