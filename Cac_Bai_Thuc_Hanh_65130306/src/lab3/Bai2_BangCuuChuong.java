/**
 * Viết chương trình xuất ra màn hình bảng cửu chương
 */
package lab3;
import java.util.Scanner;

public class Bai2_BangCuuChuong {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("BANG CUU CHUONG: ");
		
		for(int i = 2; i <= 9; i++)
		{
			for (int j = 1; j <= 10; j++)
			{
				System.out.printf("%d x %d = %d", i, j, i*j);
				System.out.println();
			}
		}
	}

}
