package quanLyDanhSachGiaoDichNhaDat;

import java.text.DecimalFormat;
import java.time.LocalDate;

public class NhaDat {
	private String maGiaoDich;
	private LocalDate ngayGiaoDich;
	private double donGia;
	private double dienTich;

	public String getMaGiaoDich() {
		return maGiaoDich;
	}

	public void setMaGiaoDich(String maGiaoDich) {
		this.maGiaoDich = maGiaoDich;
	}

	public LocalDate getNgayGiaoDich() {
		return ngayGiaoDich;
	}

	public void setNgayGiaoDich(LocalDate ngayGiaoDich) {
		this.ngayGiaoDich = ngayGiaoDich;
	}

	public double getDonGia() {
		return donGia;
	}

	public void setDonGia(double donGia) {
		this.donGia = donGia;
	}

	public double getDienTich() {
		return dienTich;
	}

	public void setDienTich(double dienTich) {
		this.dienTich = dienTich;
	}

	public NhaDat(String maGiaoDich, LocalDate ngayGiaoDich, double donGia, double dienTich) {
		super();
		setMaGiaoDich(maGiaoDich);
		setNgayGiaoDich(ngayGiaoDich);
		setDonGia(donGia);
		setDienTich(dienTich);
	}

	public NhaDat() {
		super();
	}

	public double thanhTien() {
		return dienTich * donGia;
	}

	@Override
	public String toString() {
		DecimalFormat df = new DecimalFormat("##,000");
		return "Nha Dat [Ma Giao Dich: " + maGiaoDich + ", Ngay Giao Dich: " + ngayGiaoDich + ", Don Gia: "
				+ df.format(donGia) + ", Dien Tich: " + dienTich + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((maGiaoDich == null) ? 0 : maGiaoDich.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		NhaDat other = (NhaDat) obj;
		if (maGiaoDich == null) {
			if (other.maGiaoDich != null)
				return false;
		} else if (!maGiaoDich.equals(other.maGiaoDich))
			return false;
		return true;
	}

}
