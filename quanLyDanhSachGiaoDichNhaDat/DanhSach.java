package quanLyDanhSachGiaoDichNhaDat;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class DanhSach {
	private List<NhaDat> list;

	public DanhSach() {
		list = new ArrayList<NhaDat>();
	}

	public String toString() {
		String s = "";
		for (NhaDat nhaDat : list)
			s += nhaDat + "\n";
		return s;
	}

	/**
	 * Them nha dat moi
	 * 
	 * @param nd
	 * @return true neu them duoc
	 * @return false neu khong them duoc
	 */
	public boolean them(NhaDat nd) {
		if (list.contains(nd))
			return false;
		list.add(nd);
		return true;
	}

	public int tinhTongSoLuongGDDat() {
		int count = 0;
		for (NhaDat nhaDat : list)
			if (nhaDat instanceof GiaoDichDat)
				count++;
		return count;
	}

	public int tinhTongSoLuongGDNha() {
		int count = 0;
		for (NhaDat nhaDat : list)
			if (nhaDat instanceof GiaoDichNha)
				count++;
		return count;
	}

	public double tinhTBThanhTienGDDat() {
		double tb = 0;
		int count = 0;
		for (NhaDat nhaDat : list)
			if (nhaDat instanceof GiaoDichDat) {
				tb += nhaDat.thanhTien();
				count++;
			}
		return tb / count;
	}

	public String XuatGDDatThang9Nam2013() {
		String s = "";
		for (NhaDat nhaDat : list)
			if (nhaDat.getNgayGiaoDich().getMonthValue() == 9 && nhaDat.getNgayGiaoDich().getYear() == 2013)
				s += nhaDat + "\n";
		return s;
	}

	public boolean XoaNhaDatTheoMa(String maGiaoDich) {
		for (NhaDat nhaDat : list) {
			if (nhaDat.getMaGiaoDich() == maGiaoDich) {
				list.remove(nhaDat);
				return true;
			}
		}
		return false;
	}

	public NhaDat TimKiemNhaDatTheoMa(String maGiaoDich) {
		for (NhaDat nhaDat : list)
			if (nhaDat.getMaGiaoDich() == maGiaoDich)
				return nhaDat;
		return null;
	}

	public boolean SuaNhaDatTheoMa(String maGiaoDich, LocalDate ngayGiaoDich, double donGia, double dienTich) {
		for (NhaDat nhaDat : list) {
			if (nhaDat.getMaGiaoDich() == maGiaoDich) {
				nhaDat.setNgayGiaoDich(ngayGiaoDich);
				nhaDat.setDonGia(donGia);
				nhaDat.setDienTich(dienTich);
				return true;
			}
		}
		return false;
	}

	public void sapTangTheoMa() {

	}

	public void sapGiamTheoDonGia() {

	}
}
