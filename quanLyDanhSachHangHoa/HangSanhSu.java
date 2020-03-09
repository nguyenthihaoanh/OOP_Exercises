package quanLyDanhSachHangHoa;

import java.time.LocalDate;

public class HangSanhSu extends HangHoa {
	private String nhaSanXuat;
	private LocalDate ngayNhapKho;

	public String getNhaSanXuat() {
		return nhaSanXuat;
	}

	public void setNhaSanXuat(String nhaSanXuat) {
		this.nhaSanXuat = nhaSanXuat;
	}

	public LocalDate getNgayNhapKho() {
		return ngayNhapKho;
	}

	public void setNgayNhapKho(LocalDate ngayNhapKho) {
		if (ngayNhapKho.isBefore(LocalDate.now()))
			this.ngayNhapKho = ngayNhapKho;
		this.ngayNhapKho = LocalDate.now();
	}
//nếu số lượng tồn kho >50 và thời gian lưu kho >10 ngày 
	@Override
	public String danhGiaMucDoBanBuon() {
		if (getSoLuongTon() > 0 && getSoLuongTon() < 50 && LocalDate.now().compareTo(ngayNhapKho) > 10)
			return "Ban cham";
		return "Khong danh gia";
	}

	@Override
	public double tinhTienVat() {
		return getDonGia() * getSoLuongTon() * 0.1;
	}


	public HangSanhSu(String maHang, String tenHang, double donGia, int soLuongTon) {
		super(maHang, tenHang, donGia, soLuongTon);
	}

	@Override
	public String toString() {
		return "HangSanhSu [nhaSanXuat=" + nhaSanXuat + ", ngayNhapKho=" + ngayNhapKho + ", danhGiaMucDoBanBuon()="
				+ danhGiaMucDoBanBuon() + ", tinhTienVat()=" + tinhTienVat() + ", toString()=" + super.toString() + "]";
	}

	public HangSanhSu(String maHang, String tenHang, double donGia, int soLuongTon, String nhaSanXuat,
			LocalDate ngayNhapKho) {
		super(maHang, tenHang, donGia, soLuongTon);
		this.nhaSanXuat = nhaSanXuat;
		this.ngayNhapKho = ngayNhapKho;
	}

}
