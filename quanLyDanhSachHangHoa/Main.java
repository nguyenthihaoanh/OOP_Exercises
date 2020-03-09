package quanLyDanhSachHangHoa;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		DanhSachHangHoa list = new DanhSachHangHoa();
		list.them(new HangDienMay("1", "Dien Thoai", 20000, 2, 10, 11));
		list.them(
				new HangThucPham("2", "Gao", 3000, 5, "asdfg", LocalDate.of(2019, 01, 20), LocalDate.of(2019, 05, 30)));
		list.them(new HangSanhSu("3", "Coc", 5000, 3, "asdfghj", LocalDate.of(2019, 10, 15)));
		int chon;
		do {
			System.out.println("1. In toàn bộ danh sách các hàng hóa");
			System.out.println("2. In danh sách các hàng thực phẩm");
			System.out.println("3. In danh sách các hàng sành sứ");
			System.out.println("4. In danh sách các hàng điện máy");
			System.out.println("5. Tìm kiếm hàng hóa khi biết mã hàng");
			System.out.println("6. Sắp xếp hàng hóa theo tên hàng tăng dần");
			System.out.println("7. Sắp xếp hàng hóa theo số lượng tồn giảm dần");
			System.out.println("8. Xuất các hàng thực phẩm khó bán");
			System.out.println("9. Xóa hàng hóa khi biết mã hàng");
			System.out.println("10. Sửa thông tin đơn giá của hàng hóa khi biết mã hàng");
			System.out.println("Chọn danh mục: ");
			chon = new Scanner(System.in).nextInt();
			switch (chon) {
			case 1:
				System.out.println(list);
				break;
			case 2:
				System.out.println(list.inHangThucPham());
				break;
			case 3:
				System.out.println(list.inHangSanhSu());
				break;
			case 4:
				System.out.println(list.inHangDienMay());
				break;
			case 5:
				System.out.println("Nhập mã cần tìm: ");
				String ma = new Scanner(System.in).nextLine();
				System.out.println("Kết quả tìm kiếm");
				HangHoa kq = list.timTheoMaHang(ma);
				if (kq != null)
					System.out.println(list.timTheoMaHang(ma));
				else
					System.out.println("Không tìm thấy!!!");
				break;
			case 6:
				System.out.println("Sắp xếp hàng hóa theo tên hàng tăng dần");
				list.sapXepTangHangTheoTen();
				System.out.println(list);
				break;
			case 7:
				System.out.println("Sắp xếp hàng hóa theo số lượng tồn giảm dần");
				list.sapXepGiamHangTheoSoLuongTon();
				System.out.println(list);
				break;
			case 8:
				System.out.println(list.xuatHangTPKhoBan());
				break;
			case 9:
				System.out.println("Nhập mã cần xóa: ");
				String ma1 = new Scanner(System.in).nextLine();
				System.out.println("Kết quả sau xóa");
				boolean kq1 = list.xoaTheoMa(ma1);
				if (kq1)
					System.out.println(list);
				else
					System.out.println("Không tìm thấy!!!");
				break;
			case 10:
				System.out.println("Nhập mã cần sửa: ");
				String ma11 = new Scanner(System.in).nextLine();
				System.out.println("Nhập đơn giá mới: ");
				double donGia = new Scanner(System.in).nextDouble();
				System.out.println("Kết quả sau sửa");
				boolean kq11 = list.suaDonGiaKhiBietMa(ma11, donGia);
				if (kq11)
					System.out.println(list);
				else
					System.out.println("Không tìm thấy!!!");
				break;
			default:
				break;
			}
		} while (chon != 0);
	}
}
