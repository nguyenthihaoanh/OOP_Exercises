package quanLyDanhSachGiaoDichNhaDat;

import java.text.DecimalFormat;
import java.time.LocalDate;

public class GiaoDichNha extends NhaDat {
	private boolean loaiNha;
	private String diaChi;

	public boolean isLoaiNha() {
		return loaiNha;
	}

	public void setLoaiNha(boolean loaiNha) {
		this.loaiNha = loaiNha;
	}

	public String getDiaChi() {
		return diaChi;
	}

	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}

	public GiaoDichNha(String maGiaoDich, LocalDate ngayGiaoDich, double donGia, double dienTich, boolean loaiNha,
			String diaChi) {
		super(maGiaoDich, ngayGiaoDich, donGia, dienTich);
		setLoaiNha(loaiNha);
		setDiaChi(diaChi);
	}

	public GiaoDichNha(String maGiaoDich, LocalDate ngayGiaoDich, double donGia, double dienTich) {
		super(maGiaoDich, ngayGiaoDich, donGia, dienTich);
	}

	public double thanhTien() {
		if (isLoaiNha())
			return getDienTich() * getDonGia();
		else
			return getDienTich() * getDonGia() * 0.9;
	}

	@Override
	public String toString() {
		DecimalFormat df = new DecimalFormat("##,000.000");
		String ln = "";
		if (isLoaiNha())
			ln = "Nha Cao Cap";
		else
			ln = "Nha Thuong";
		return "Giao Dich Nha [Ma Giao Dich: " + getMaGiaoDich() + ", Loai Nha: " + ln + ", Dia Chi: " + diaChi + "]"
				+ ", Don Gia: " + df.format(getDonGia()) + ", Dien Tich: " + getDienTich() + ", Thanh Tien: "
				+ df.format(thanhTien()) + "]";
	}

}
