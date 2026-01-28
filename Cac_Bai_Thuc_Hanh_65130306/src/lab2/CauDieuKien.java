/*
 * Nhập số từ bàn phím. 
 * Nếu số dương thì tính và xuất căn bậc 2 của số đó ra màn hình
 */
package lab2;
import java.util.Scanner;

public class CauDieuKien {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Nhap he so a: ");
		double a = scanner.nextDouble();
	
		
		if(a > 0) {
			double canBacHai = Math.sqrt(a);
			System.out.printf("Can bac hai la: %.2f", canBacHai);
		}
		else {
			System.out.print("Khong phai so duong");
		}
		
	}
}
