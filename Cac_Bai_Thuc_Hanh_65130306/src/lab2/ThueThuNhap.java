/*
 * Viết chương trình tính thuế thu nhập. Giả sử thu nhập gồm lương và thưởng
 * Thuế thu nhập được tính như sau
 * Dưới 9tr: ko đóng thuế
 * Từ 9-15 triệu: thuế 10%
 * Từ 15-30tr: 15%
 * Trên 30tr: 20%
 */
package lab2;
import java.util.Scanner;

public class ThueThuNhap {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Nhap thu nhập: ");
		double thuNhap = scanner.nextDouble();
		
		double thue;
		
		if (thuNhap < 9) {
			thue = 0;
		}
		else if (thuNhap < 15) {
			thue = thuNhap * 0.1;
		}
		else if (thuNhap < 30) {
			thue = thuNhap * 0.15;
		}
		else {
			thue = thuNhap * 0.2;
		}
		
		System.out.printf("Thue thu nhap phai dong: %.2f trieu dong", thue);
		
		
	}
}
