package quanLyHoaDon;

public class DanhSachHoaDon {
	private HoaDon[] danhSach;
	private int count = 0;

	public DanhSachHoaDon(int n) {
		danhSach = new HoaDon[n];
	}

	public boolean them(HoaDon hd) {
		boolean check = true;
		for (int i = 0; i < count; i++) {
			if (danhSach[i].getMaHoaDon().equalsIgnoreCase(hd.getMaHoaDon()))
				check = false;
		}
		if (check) {
			danhSach[count] = hd;
			count++;
			return true;
		}
		return false;
	}

	public String toString() {
		String s = "";
		for (int i = 0; i < count; i++)
			s = s + "\n" + danhSach[i].toString();
		return s;
	}

	public int thongKeSoLuongHDTheoGio() {
		int count = 0;
		for (HoaDon hoaDon : danhSach)
			if (hoaDon instanceof HoaDonTheoGio)
				count++;
		return count;
	}

	public int thongKeSoLuongHDTheoNgay() {
		int count = 0;
		for (HoaDon hoaDon : danhSach)
			if (hoaDon instanceof HoaDonTheoNgay)
				count++;
		return count;
	}

	public double tinhTongThanhTien(int thang, int nam) {
		int sum = 0, sum2 = 0;
		for (int i = 0; i < count; i++) {
			if (danhSach[i].getNgayHoaDon().getYear() == nam && danhSach[i].getNgayHoaDon().getMonthValue() == thang) {
				if (danhSach[i] instanceof HoaDonTheoNgay)
					sum += danhSach[i].tinhThanhTien();
				if (danhSach[i] instanceof HoaDonTheoGio)
					sum2 += danhSach[i].tinhThanhTien();
			}
		}
		return sum + sum2;
	}
}
