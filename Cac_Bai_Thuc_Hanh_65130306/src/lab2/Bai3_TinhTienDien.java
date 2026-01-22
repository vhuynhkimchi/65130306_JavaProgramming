/**
 Viết chương trình nhập vào số điện sử dụng của tháng và tính tiền điện theo
phương pháp lũy tiến
✓ Nếu số điện sử dụng từ 0 đến 50 thì giá mỗi số điện là 1000
✓ Nếu số điện sử dụng trên 50 thì giá mỗi số điện vượt hạn mức là 1200
 */
package lab2;
import java.util.Scanner;

public class Bai3_TinhTienDien {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Nhap so dien cua thang: ");
		double sodien = scanner.nextDouble();
		double tien;
		if(sodien >=0  && sodien <= 50)
		{
			tien = sodien * 1000;
		}
		else 
		{
			tien = 50*1000 + (sodien - 50)*1200;
		}
		
		System.out.printf("So tien dien phai dong la: %.0f VND", tien);
	}

}
