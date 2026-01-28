/**
 * Sinh số ngẫu nhiên từ 5 đến 12 xuất số đó và căn bậc 2 của nó ra màn hình
 */
package lab1;
import java.util.Scanner;

public class SinhSoNgauNhien {

	public static void main(String[] args) {
		
		int soNgauNhien = (int)(Math.random() * (12 - 5 + 1)) + 5;
		
		double canBacHai = Math.sqrt(soNgauNhien);
		
		System.out.println("So ngau nhien : " + soNgauNhien);
		System.out.printf("Can bac hai cua so ngau nhien : %.2f", canBacHai);
	}

}
