/**
 * Viết chương trình nhập một số nguyên từ bàn phím và cho biết số đó có phải là số
nguyên tố hay không (số nguyên tố là số chỉ chia hết cho 1 và chính nó).
 */
package lab3;
import  java.util.Scanner;

public class Bai1_SoNguenTo {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int n;
		System.out.print("Nhap vao mot so n = ");
		n = scanner.nextInt();
		
		boolean ok = true;
		
		if(n < 2) {
			ok = false;
		}
		else
		{
			for(int i = 2; i < n-1; i++)
			{
				if(n % i == 0){
					ok = false;
					break;
				}
			}
		}
		
		if(ok == true)
		{
			System.out.printf("%d la so nguyen to.", n);
		}
		else {
			System.out.printf("%d khong phai la so nguyen to.", n);
		}
	}

}
