/**
 *Lab1_Bai2_ChuviDT:  Viết chương trình nhập từ bàn phím 2 cạnh của hình chữ nhật. Tính và xuất chu vi, diện tích và cạnh nhỏ của hình chữ nhật.
 */
package lab1;
import java.util.Scanner;

public class Bai2_ChuviDT {

	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Nhap chieu dai a: ");
		double a = scanner.nextDouble();
		
		System.out.print("Nhap chieu rong b: ");
		double b = scanner.nextDouble();
		
		
		double c = (a + b) * 2;
		System.out.println("Chu vi HCN: " + c);
		
		double s = a * b;
		System.out.println("Dien tich HCN: " + s);
		
		double x = Math.min(a,b);
		System.out.print("Canh nho nhat cua HCN la: "+ x);
	}

}
