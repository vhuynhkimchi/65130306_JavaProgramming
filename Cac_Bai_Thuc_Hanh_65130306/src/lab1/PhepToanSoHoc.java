/**
 * Viết chương trình tìm điểm trung bình của các môn học a,b, c.
 * Trong đó môn a được tính hệ số 2
 */
package lab1;
import java.util.Scanner;

public class PhepToanSoHoc {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		double a, b, c;
		
		System.out.print("Nhap diem mon hoc a: ");
		a = scanner.nextDouble();
		
		System.out.print("Nhap diem mon hoc b: ");
		b = scanner.nextDouble();
		
		System.out.print("Nhap diem mon hoc c: ");
		c = scanner.nextDouble();
		
		double TBC = (a * 2 + b + c)/4;
		System.out.print("Diem trung binh cac mon la: " + TBC);
	}

}
