package ClothesShop.Service.User;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ClothesShop.Dao.GioHangDao;
import ClothesShop.Entity.GioHang;
import ClothesShop.Service.Admin.IDanhMuc;

@Service
public class GioHangImpl implements IGioHang{
	@Autowired
	GioHangDao giohangDao;
	public int ThemGioHang(GioHang giohang) {
		return giohangDao.ThemGioHang(giohang);
	}
	public List<String[]> HienGioHang(int id_kh) {
		return giohangDao. HienGioHang(id_kh);
	}
	public int CongGioHang(int idsp, int idkh) {
		return giohangDao. CongGioHang(idsp, idkh);
	}
	public  int TruGioHang(int idsp, int idkh) {
		return giohangDao. TruGioHang(idsp, idkh);
	}
	public int XoaGioHang(int id, int idkh) {
		return giohangDao.XoaGioHang(id, idkh);
	}
	public int Count(int id_kh) {
		return giohangDao.Count(id_kh);
	}
	public int KiemTraGioHang(GioHang giohang) {
		return giohangDao.KiemTraGioHang(giohang);
	}
	public int UpdateGioHang(GioHang giohang) {
		return giohangDao.UpdateGioHang(giohang);
	}
	
}
