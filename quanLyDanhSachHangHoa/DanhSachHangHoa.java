package quanLyDanhSachHangHoa;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class DanhSachHangHoa {
	private List<HangHoa> list;

	public DanhSachHangHoa() {
		list = new ArrayList<HangHoa>();
	}

	// o Viết phương thức thêm một hàng hóa vào danh sách (thêm thành công nếu không
	// bị trùng mã hàng).
	public boolean them(HangHoa hh) {
		if (list.contains(hh))
			return false;
		list.add(hh);
		return true;
	}

	// o Viết phương thức in toàn bộ danh sách các hàng hóa.
	public String toString() {
		String s = "";
		for (HangHoa hangHoa : list)
			s += hangHoa + "\n";
		return s;
	}

	// o Viết các phương thức in từng loại hàng hóa.
	public String inHangThucPham() {
		String htp = "";
		for (HangHoa hangHoa : list)
			if (hangHoa instanceof HangThucPham)
				htp += hangHoa + "\n";
		return htp;
	}

	public String inHangDienMay() {
		String hdm = "";
		for (HangHoa hangHoa : list)
			if (hangHoa instanceof HangDienMay)
				hdm += hangHoa + "\n";
		return hdm;
	}

	public String inHangSanhSu() {
		String hss = "";
		for (HangHoa hangHoa : list)
			if (hangHoa instanceof HangSanhSu)
				hss += hangHoa + "\n";
		return hss;
	}

	// o Viết phương thức tìm kiếm hàng hóa khi biết mã hàng (trả về hàng hóa tìm
	// thấy).
	public HangHoa timTheoMaHang(String ma) {
		for (HangHoa hangHoa : list)
			if (hangHoa.getMaHang().equalsIgnoreCase(ma))
				return hangHoa;
		return null;
	}

	// o Viết phương thức sắp xếp hàng hóa theo tên hàng tăng dần.
	public void sapXepTangHangTheoTen() {
		Collections.sort(list, new Comparator<HangHoa>() {
			public int compare(HangHoa o1, HangHoa o2) {
				if (o1.getTenHang().compareToIgnoreCase(o2.getTenHang()) > 0)
					return 1;
				else if (o1.getTenHang().compareToIgnoreCase(o2.getTenHang()) < 0)
					return -1;
				return 0;
			}
		});
	}

	// o Viết phương thức sắp xếp hàng hóa theo số lượng tồn giảm dần.
	public void sapXepGiamHangTheoSoLuongTon() {
		Collections.sort(list, new Comparator<HangHoa>() {
			public int compare(HangHoa o1, HangHoa o2) {
				if (o1.getSoLuongTon() < o2.getSoLuongTon())
					return 1;
				else if (o1.getSoLuongTon() > o2.getSoLuongTon())
					return -1;

				return 0;
			}
		});
	}

	// o Viết phương thức xuất các hàng thực phẩm khó bán.
	public String xuatHangTPKhoBan() {
		String htp = "";
		for (HangHoa hangHoa : list)
			if (hangHoa instanceof HangThucPham)
				if (hangHoa.danhGiaMucDoBanBuon().equalsIgnoreCase("Kho ban"))
					htp += hangHoa + "\n";
		return htp;

	}

	// o Viết các phương thức xóa hàng hóa khi biết mã hàng.
	public boolean xoaTheoMa(String ma) {
		for (HangHoa hangHoa : list)
			if (hangHoa.getMaHang().equals(ma)) {
				list.remove(hangHoa);
				return true;
			}
		return false;
	}

	// o Viết các phương thức sửa thông tin đơn giá của hàng hóa khi biết mã hàng.
	public boolean suaDonGiaKhiBietMa(String ma, double donGia) {
		for (HangHoa hangHoa : list)
			if (hangHoa.getMaHang().equals(ma)) {
				hangHoa.setDonGia(donGia);
				return true;
			}
		return false;
	}
}
