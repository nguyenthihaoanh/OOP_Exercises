package quanLyHoaDon;

import java.time.LocalDate;

public class HoaDonTheoNgay extends HoaDon {
	private int soNgayThue;

	public int getSoNgayThue() {
		return soNgayThue;
	}

	public void setSoNgayThue(int soNgayThue) {
		this.soNgayThue = soNgayThue;
	}

	public HoaDonTheoNgay(String maHoaDon, LocalDate ngayHoaDon, String tenKhachHang, int maPhong, double donGia,
			int soNgayThue) {
		super(maHoaDon, ngayHoaDon, tenKhachHang, maPhong, donGia);
		this.soNgayThue = soNgayThue;
	}

	public HoaDonTheoNgay(String maHoaDon, LocalDate ngayHoaDon, String tenKhachHang, int maPhong, double donGia) {
		super(maHoaDon, ngayHoaDon, tenKhachHang, maPhong, donGia);
	}

	public double tinhThanhTien() {
		if (soNgayThue <= 7)
			return soNgayThue * getDonGia();
		else
			return 7 * getDonGia() + (soNgayThue - 7) * getDonGia() * 0.2;
	}

	@Override
	public String toString() {
		return "HoaDonTheoNgay [soNgayThue=" + soNgayThue + ", tinhThanhTien()=" + tinhThanhTien() + ", getMaHoaDon()="
				+ getMaHoaDon() + ", getNgayHoaDon()=" + getNgayHoaDon() + ", getTenKhachHang()=" + getTenKhachHang()
				+ ", getMaPhong()=" + getMaPhong() + ", getDonGia()=" + getDonGia() + "]";
	}
}
