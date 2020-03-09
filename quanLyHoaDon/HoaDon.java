package quanLyHoaDon;

import java.time.LocalDate;

public abstract class HoaDon {
	private String maHoaDon;
	private LocalDate ngayHoaDon;
	private String tenKhachHang;
	private int maPhong;
	private double donGia;

	public String getMaHoaDon() {
		return maHoaDon;
	}

	public void setMaHoaDon(String maHoaDon) {
		this.maHoaDon = maHoaDon;
	}

	public LocalDate getNgayHoaDon() {
		return ngayHoaDon;
	}

	public void setNgayHoaDon(LocalDate ngayHoaDon) {
		this.ngayHoaDon = ngayHoaDon;
	}

	public String getTenKhachHang() {
		return tenKhachHang;
	}

	public void setTenKhachHang(String tenKhachHang) {
		this.tenKhachHang = tenKhachHang;
	}

	public int getMaPhong() {
		return maPhong;
	}

	public void setMaPhong(int maPhong) {
		this.maPhong = maPhong;
	}

	public double getDonGia() {
		return donGia;
	}

	public void setDonGia(double donGia) {
		this.donGia = donGia;
	}

	public HoaDon(String maHoaDon, LocalDate ngayHoaDon, String tenKhachHang, int maPhong, double donGia) {
		super();
		this.maHoaDon = maHoaDon;
		this.ngayHoaDon = ngayHoaDon;
		this.tenKhachHang = tenKhachHang;
		this.maPhong = maPhong;
		this.donGia = donGia;
	}

	public HoaDon() {
		super();
	}

	public abstract double tinhThanhTien();

	@Override
	public String toString() {
		return "HoaDon [maHoaDon=" + maHoaDon + ", ngayHoaDon=" + ngayHoaDon + ", tenKhachHang=" + tenKhachHang
				+ ", maPhong=" + maPhong + ", donGia=" + donGia + ", tinhThanhTien()=" + tinhThanhTien() + "]";
	}
}
