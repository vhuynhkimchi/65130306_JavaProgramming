/**
 * Viết chương trình nhập 2 mảng họ tên và điểm của sinh viên.
	✓ Xuất 2 mảng đã nhập, mỗi sinh viên có thêm học lực
	o Yếu: điểm < 5
	o Trung bình: 5 <= điểm < 6.5
	o Khá: 6.5 <= điểm < 7.5
	o Giỏi: 7.5<= điểm < 9
	o Xuất sắc: điểm >= 9
	✓ Sắp xếp danh sách sinh viên đã nhập tăng dần theo điểm
 */
package lab3;
import java.util.Scanner;

public class Bai4_2Mang {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Nhap so luong sinh vien: ");
		int n = scanner.nextInt();
		String[] hoten = new String[n];
		double[] diem = new double[n];
		
		for(int i = 0; i < n; i++)
		{
			System.out.println("Sinh vien thu " + (i+1));
			
			scanner.nextLine();
			
			System.out.print("Nhap ho ten: ");
			hoten[i] = scanner.nextLine();
			
			System.out.print("Nhap diem: ");
			diem[i] = scanner.nextDouble();
		}
		
		//Sap xep sinh vien tang dan theo diem
		for(int i = 0; i < n-1; i++)
		{
			for(int j = i+1; j < n; j++)
			{
				if(diem[i] > diem[j])
				{
					double tempdiem = diem[i];
					diem[i] = diem[j];
					diem[j] = tempdiem;
					
					String tempTen = hoten[i];
					hoten[i] = hoten[j];
					hoten[j] = tempTen;
				}
			}
		}
		
		//Xuat danh sach sinh vien
		System.out.println("--------------------");
		System.out.println("DANH SACH SINH VIEN: ");
		for(int i = 0; i < n; i++)
		{
			System.out.printf("Ho ten: %s - Diem: %.2f \n", hoten[i], diem[i]);
			
			if(diem[i] < 5) System.out.println("Hoc luc Yeu.");
			else if(diem[i] < 6.5) System.out.println("Hoc luc Trung binh.");
			else if(diem[i] < 7.5) System.out.println("Hoc luc Kha.");
			else if(diem[i] < 9) System.out.println("Hoc luc Gioi.");
			else System.out.println("Hoc luc Xuat Sac.");
		}
		
		
	}

}
