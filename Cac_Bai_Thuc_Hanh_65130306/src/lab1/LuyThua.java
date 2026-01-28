/*
 * Nhập 2 số thực a và b từ bàn phím
 * Tính và xuất a lũy b, gia trị nhỏ nhất của 2 số
 */
package lab1;
import java.util.Scanner;

public class LuyThua {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
	
		System.out.print("Nhap a: ");
		double a = scanner.nextDouble();
		System.out.print("Nhap b: ");
		double b = scanner.nextDouble();
		
		// Tính a lũy b
		double luyThua = Math.pow(a, b);

		// Tìm giá trị nhỏ nhất
		double min = Math.min(a, b);
		
		System.out.println("a luy b = " + luyThua);
		System.out.printf("Gia tri nho nhat cua 2 so la: " + min);
	}
	
}
