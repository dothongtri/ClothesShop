package ClothesShop.Service.Admin;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ClothesShop.Dao.DonHangDao;
import ClothesShop.Entity.DonHang;
import ClothesShop.Service.Admin.IDonHang;

@Service
public class AdminDonHangImpl implements IDonHang{
@Autowired
DonHangDao donhangDao;
	public List<DonHang> DanhSachDonHang() {
		return donhangDao.DanhSachDonHang();
	}
	public int XacNhanDonHang(int don) {
		return donhangDao.XacNhanDonHang(don);
	}
	public int ThemNhatKy(int don) {
		return donhangDao. ThemNhatKy(don);
	}
	public List<String[]> ChiTietDonHang(int don) {
		return donhangDao.ChiTietDonHang(don);
	}
	public List<DonHang> DonHang(int don) {
		return donhangDao.DonHang(don);
	}

}

