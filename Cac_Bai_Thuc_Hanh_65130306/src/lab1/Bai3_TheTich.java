/**
 Viết chương trình nhập từ bàn phím cạnh của một khối lập phương. Tính và xuất thể tích của khối chữ nhật
 */
package lab1;
import java.util.Scanner;

public class Bai3_TheTich {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Nhap mot canh khoi lap phuong: ");
		double canh = scanner.nextDouble();
		
		double v = Math.pow(canh,3);
		System.out.print("The tich cua khoi lap phuong la: "+ v);
	}

}
