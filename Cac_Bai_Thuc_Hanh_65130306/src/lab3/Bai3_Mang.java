/**
 * Viết chương trình nhập mảng số nguyên từ bàn phím.
 Sắp xếp và xuất mảng vừa nhập ra màn hình.
 Xuất phần tử có giá trị nhỏ nhất ra màn hình
 Tính và xuất ra màn hình trung bình cộng các phần tử chia hết cho 3
 */
package lab3;
import java.util.Scanner;
import java.util.Arrays;

public class Bai3_Mang {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Nhap so luong phan tu cua mang: ");
		int n = scanner.nextInt();
		int[] array = new int[n];
		
		System.out.print("Nhap cac phan tu cua mang: ");
		for(int i = 0; i < n; i++)
		{
			System.out.printf("array[%d] = ", i);
			array[i] = scanner.nextInt();
		}
		Arrays.sort(array);
		System.out.print("Mang sau khi sap xep: ");
		System.out.println(Arrays.toString(array));
		
		//Phan tu nho nhat
		int Min = array[0];
		System.out.println("Phan tu nho nhat trong mang la: " + Min);
		
		//Trung binh cong cac phan tu chia het cho 3
		int tong = 0;
		int dem = 0;
		
		for(int x : array)
		{
			if(x % 3 == 0)
			{
				tong += x;
				dem++;
			}
		}
		if(dem == 0)
		{
			System.out.println("Khong co phan tu chia het cho 3.");
		}
		else
		{
			double TBC = tong/dem;
			System.out.println("TBC cua cac phan tu chia het cho 3 = " + TBC);
		}
	}

}
