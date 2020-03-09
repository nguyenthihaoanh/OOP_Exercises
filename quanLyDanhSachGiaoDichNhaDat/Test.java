package quanLyDanhSachGiaoDichNhaDat;

import java.text.DecimalFormat;
import java.time.LocalDate;
import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		DanhSach list = new DanhSach();
		list.them(new GiaoDichDat("1", LocalDate.of(2013, 9, 12), 12000, 25, false));
		list.them(new GiaoDichDat("2", LocalDate.now(), 35000, 30, false));
		list.them(new GiaoDichDat("3", LocalDate.of(2013, 9, 02), 24000, 45, true));
		list.them(new GiaoDichNha("4", LocalDate.of(2012, 9, 29), 100000, 32, false, "451/4"));
		list.them(new GiaoDichNha("5", LocalDate.now(), 150000, 40, true, "21A"));
		list.them(new GiaoDichNha("6", LocalDate.now(), 250000, 35, false, "3B"));
		int chon;
		do {
			System.out.println("1. Xuat tat ca danh sach giao dich nha dat");
			System.out.println("2. Xuat tong so luong cua giao dich dat");
			System.out.println("3. Xuat tong so luong cua giao dich nha");
			System.out.println("4. Xuat trung binh thanh tien cua giao dich dat");
			System.out.println("5. Xuat cac giao dich cua thang 9 nam 2013");
			System.out.println("6. Xoa nha dat theo ma");
			System.out.println("7. Sua nha dat theo ma");
			System.out.println("Chon danh mục: ");
			chon = new Scanner(System.in).nextInt();
			switch (chon) {
			case 1:
				System.out.println(list);
				break;
			case 2:
				System.out.println(list.tinhTongSoLuongGDDat());
				break;
			case 3:
				System.out.println(list.tinhTongSoLuongGDNha());
				break;
			case 4:
				System.out.println(list.tinhTBThanhTienGDDat());
				break;
			case 5:
				System.out.println(list.XuatGDDatThang9Nam2013());
				break;
			case 6:
				if(!list.XoaNhaDatTheoMa("6"))
					System.out.println("Khong co nha dat de xoa");
				System.out.println("Danh sach sau khi xoa");
				System.out.println(list);
				break;
			case 7:
				if(!list.SuaNhaDatTheoMa("1", LocalDate.now(), 24000, 30))
					System.out.println("Khong co nha dat de sua");
				System.out.println("Danh sach sau khi sua");
				System.out.println(list);
				break;
			case 8:
				break;
			default:
				break;
			}
		} while (chon != 0);
	}
}
