/**
 Viết chương trình nhập các hệ số của phương trình bậc 2. Tính delta và xuất căn delta ra màn hình.
 */
package lab1;
import java.util.Scanner;

public class Bai4_Delta {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Nhap he so a: ");
		double a = scanner.nextDouble();
		
		System.out.print("Nhap he so b: ");
		double b = scanner.nextDouble();
		
		System.out.print("Nhap he so c: ");
		double c = scanner.nextDouble();
		
		double Delta = Math.pow(b,2) - 4 * a * c;
		
		System.out.println("Delta = "+ Delta);
		System.out.println("CanDelta = "+ Math.sqrt(Delta));
	}

}
