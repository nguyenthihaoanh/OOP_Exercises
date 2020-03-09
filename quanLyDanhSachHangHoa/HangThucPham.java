package quanLyDanhSachHangHoa;

import java.time.LocalDate;

public class HangThucPham extends HangHoa {
	private String nhaCungCap;
	private LocalDate ngaySanXuat;
	private LocalDate ngayHetHan;

	public String getNhaCungCap() {
		return nhaCungCap;
	}

	public void setNhaCungCap(String nhaCungCap) {
		this.nhaCungCap = nhaCungCap;
	}

	public LocalDate getNgaySanXuat() {
		return ngaySanXuat;
	}

	public void setNgaySanXuat(LocalDate ngaySanXuat) {
		if (ngaySanXuat.isBefore(LocalDate.now()))
			this.ngaySanXuat = ngaySanXuat;
		this.ngaySanXuat = LocalDate.now();
	}

	public LocalDate getNgayHetHan() {
		return ngayHetHan;
	}

	public void setNgayHetHan(LocalDate ngayHetHan) {
		if (ngayHetHan.isAfter(ngaySanXuat))
			this.ngayHetHan = ngayHetHan;
		this.ngayHetHan = ngaySanXuat;
	}

	public HangThucPham(String maHang, String tenHang, double donGia, int soLuongTon, String nhaCungCap,
			LocalDate ngaySanXuat, LocalDate ngayHetHan) {
		super(maHang, tenHang, donGia, soLuongTon);
		this.nhaCungCap = nhaCungCap;
		this.ngaySanXuat = ngaySanXuat;
		this.ngayHetHan = ngayHetHan;
	}

	public HangThucPham(String maHang, String tenHang, double donGia, int soLuongTon) {
		super(maHang, tenHang, donGia, soLuongTon);
	}

	@Override
	public String danhGiaMucDoBanBuon() {
		if (getSoLuongTon() > 0 && ngayHetHan.isBefore(LocalDate.now()))
			return "Kho ban";
		return "Khong danh gia";
	}

	@Override
	public double tinhTienVat() {
		return getSoLuongTon() * getDonGia() * 0.05;
	}

	@Override
	public String toString() {
		return "HangThucPham [nhaCungCap=" + nhaCungCap + ", ngaySanXuat=" + ngaySanXuat + ", ngayHetHan=" + ngayHetHan
				+ ", danhGiaMucDoBanBuon()=" + danhGiaMucDoBanBuon() + ", tinhTienVat()=" + tinhTienVat()
				+ ", toString()=" + super.toString() + "]";
	}

}
