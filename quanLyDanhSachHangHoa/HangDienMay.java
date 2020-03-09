package quanLyDanhSachHangHoa;

public class HangDienMay extends HangHoa {
	private int thoiGianBaoHanh;
	private int congSuat;

	public int getThoiGianBaoHanh() {
		return thoiGianBaoHanh;
	}

	public void setThoiGianBaoHanh(int thoiGianBaoHanh) {
		this.thoiGianBaoHanh = thoiGianBaoHanh;
	}

	public int getCongSuat() {
		return congSuat;
	}

	public void setCongSuat(int congSuat) {
		this.congSuat = congSuat;
	}

	public HangDienMay(String maHang, String tenHang, double donGia, int soLuongTon, int thoiGianBaoHanh,
			int congSuat) {
		super(maHang, tenHang, donGia, soLuongTon);
		this.thoiGianBaoHanh = thoiGianBaoHanh;
		this.congSuat = congSuat;
	}

	public HangDienMay(String maHang, String tenHang, double donGia, int soLuongTon) {
		super(maHang, tenHang, donGia, soLuongTon);
	}

	@Override
	public String danhGiaMucDoBanBuon() {
		if (getSoLuongTon() > 0 && getSoLuongTon() < 3)
			return "Ban duoc";
		return "Khong danh gia";
	}

	@Override
	public double tinhTienVat() {
		return getSoLuongTon() * getDonGia() * 0.1;
	}

	@Override
	public String toString() {
		return "HangDienMay [thoiGianBaoHanh=" + thoiGianBaoHanh + ", congSuat=" + congSuat + ", danhGiaMucDoBanBuon()="
				+ danhGiaMucDoBanBuon() + ", tinhTienVat()=" + tinhTienVat() + ", toString()=" + super.toString() + "]";
	}

}
