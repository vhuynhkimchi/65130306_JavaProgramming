//Lab1_Bai1_DTB: Viết chương trình cho phép nhập họ và tên sinh viên, điểm trung bình từ bàn phím sau đó xuất ra màn hình.
package lab1;
import java.util.Scanner;

public class Bai1_DTB {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Nhap ho ten: ");
		String hoten = scanner.nextLine();
		
		System.out.print("Nhap DTB: ");
		Double DTB = scanner.nextDouble();
		
		System.out.println("Ho ten sinh vien: " + hoten);
		System.out.print("DTB sinh vien: " + DTB);
	}

}
