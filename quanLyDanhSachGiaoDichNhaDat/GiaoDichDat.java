package quanLyDanhSachGiaoDichNhaDat;

import java.text.DecimalFormat;
import java.time.LocalDate;

public class GiaoDichDat extends NhaDat {
	private boolean loaiDat;

	public boolean isLoaiDat() {
		return loaiDat;
	}

	public void setLoaiDat(boolean loaiDat) {
		this.loaiDat = loaiDat;
	}

	public GiaoDichDat(String maGiaoDich, LocalDate ngayGiaoDich, double donGia, double dienTich, boolean loaiDat) {
		super(maGiaoDich, ngayGiaoDich, donGia, dienTich);
		setLoaiDat(loaiDat);
	}

	public GiaoDichDat(String maGiaoDich, LocalDate ngayGiaoDich, double donGia, double dienTich) {
		super(maGiaoDich, ngayGiaoDich, donGia, dienTich);
	}

	public double thanhTien() {
		if (isLoaiDat())
			return getDienTich() * getDonGia();
		else
			return getDienTich() * getDonGia() * 1.5;
	}

	@Override
	public String toString() {
		DecimalFormat df = new DecimalFormat("##,000.000");
		String ld = "";
		if (isLoaiDat())
			ld = "Loai B/C";
		else
			ld = "Loai A";
		return "Giao Dich Dat [Ma Giao Dich: " + getMaGiaoDich() + ", Loai Dat: " + ld + ", Don Gia: "
				+ df.format(getDonGia()) + ", Dien Tich: " + getDienTich() + ", Thanh Tien: " + df.format(thanhTien())
				+ "]";
	}

}
