package quanLyHoaDon;

import java.time.LocalDate;
import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		DanhSachHoaDon list = new DanhSachHoaDon(100);
		list.them(new HoaDonTheoGio("1", LocalDate.now(), "Nguyen Van A", 11, 5000, 32));
		list.them(new HoaDonTheoGio("2", LocalDate.now(), "Nguyen Van A", 2, 5000, 24));
		list.them(new HoaDonTheoNgay("3", LocalDate.of(2018, 07, 29), "a", 3, 2000, 5));
		list.them(new HoaDonTheoNgay("4", LocalDate.of(2018, 07, 01), "a", 4, 2000, 8));
		list.them(new HoaDonTheoNgay("6", LocalDate.now(), "a", 5, 2000, 10));
		list.them(new HoaDonTheoNgay("5", LocalDate.now(), "aasdgn", 6, 2000, 12));
		int chon;
		do {
			System.out.println("1. Xuất tất cả các hóa đơn");
			System.out.println("2. Thống kê số lượng hóa đơn theo giờ");
			System.out.println("3. Thống kê số lượng hóa đơn theo ngày");
			System.out.println("4. Tính tổng thành tiền theo ngày tháng năm");
			System.out.println("Chọn danh mục: ");
			chon = new Scanner(System.in).nextInt();
			switch (chon) {
			case 1:
				System.out.println(list);
				break;
			case 2:
				System.out.println(list.thongKeSoLuongHDTheoGio());
				break;
			case 3:
				System.out.println(list.thongKeSoLuongHDTheoNgay());
				break;
			case 4:
				System.out.println(list.tinhTongThanhTien(7, 2018));
				break;

			default:
				break;
			}
		} while (chon != 0);
	}
}
