package quanLyHoaDon;

import java.time.LocalDate;

public class HoaDonTheoGio extends HoaDon {
	private int soGioThue;

	public int getSoGioThue() {
		return soGioThue;
	}

	public void setSoGioThue(int soGioThue) {
		if (soGioThue > 30)
			this.soGioThue = 0;
		this.soGioThue = soGioThue;
	}

	public HoaDonTheoGio(String maHoaDon, LocalDate ngayHoaDon, String tenKhachHang, int maPhong, double donGia,
			int soGioThue) {
		super(maHoaDon, ngayHoaDon, tenKhachHang, maPhong, donGia);
		this.soGioThue = soGioThue;
	}

	public HoaDonTheoGio(String maHoaDon, LocalDate ngayHoaDon, String tenKhachHang, int maPhong, double donGia) {
		super(maHoaDon, ngayHoaDon, tenKhachHang, maPhong, donGia);
	}

	public double tinhThanhTien() {
		if (soGioThue <= 24)
			return soGioThue * getDonGia();
		else if (soGioThue > 24 && soGioThue <= 30)
			return 24 * soGioThue;
		else 
			return 0;
	}

	@Override
	public String toString() {
		return "HoaDonTheoGio [soGioThue=" + soGioThue + ", tinhThanhTien()=" + tinhThanhTien() + ", getMaHoaDon()="
				+ getMaHoaDon() + ", getNgayHoaDon()=" + getNgayHoaDon() + ", getTenKhachHang()=" + getTenKhachHang()
				+ ", getMaPhong()=" + getMaPhong() + ", getDonGia()=" + getDonGia() + "]";
	}
}
