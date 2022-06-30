package ClothesShop.Dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Repository;

import ClothesShop.Entity.DonHang;
import ClothesShop.Entity.MapperDonHang;
import ClothesShop.Entity.MapperGioHang;
import ClothesShop.Entity.MapperThongKe;

@Repository
public class BaoCaoDao extends BaseDao {
//thong ke san pham theo thang hien hanh
	public List<String[]> ThongKeSanPham() {
		try {
			List<String[]> list = new ArrayList<String[]>();
			String sql = "SELECT chitietdonhang.id_sp, sanpham.ten_sp, sum(chitietdonhang.soluong) FROM chitietdonhang join sanpham join donhang where chitietdonhang.id_dh=donhang.id_dh and sanpham.id_sp=chitietdonhang.id_sp and month(donhang.thoigian_mua)=month(now()) group by chitietdonhang.id_sp";
			list = _jdbcTemplate.query(sql, new MapperThongKe());
			return list;
		} catch (EmptyResultDataAccessException e) {
			return null;
		}
	}

//thong ke don hang theo thang hien hanh
	public List<DonHang> ThongKeDonHang() {
		try {
			List<DonHang> list = new ArrayList<DonHang>();
			String sql = "SELECT * FROM donhang where month(thoigian_mua)=month(now())";
			list = _jdbcTemplate.query(sql, new MapperDonHang());
			return list;
		} catch (EmptyResultDataAccessException e) {
			return null;
		}
	}

//dem tong don hang theo thang hien hanh
	public int DemTongDH() {
		try {
			int count = 0;
			String sql = "SELECT count(*) FROM donhang where month(thoigian_mua)=month(now())";
			count = _jdbcTemplate.queryForObject(sql, Integer.class);
			return count;
		} catch (Exception e) {
			return 0;
		}
	}

//tong tien don hang theo thang hien hanh
	public int TongDH() {
		try {
			int tong = 0;
			String sql = "SELECT sum(tongtien) FROM donhang where month(thoigian_mua)=month(now())";
			tong = _jdbcTemplate.queryForObject(sql, Integer.class);
			return tong;
		} catch (Exception e) {
			return 0;
		}
	}

//dem so sp ban theo thang hien hanh
	public int DemTongSP() {
		try {
			int tong = 0;
			String sql = "SELECT sum(soluong) FROM chitietdonhang join donhang where donhang.id_dh=chitietdonhang.id_dh and month(donhang.thoigian_mua)=month(now())";
			tong = _jdbcTemplate.queryForObject(sql, Integer.class);
			return tong;
		} catch (Exception e) {
			return 0;
		}
	}

//thong ke don hang theo thang chon
	public List<DonHang> TKDH_thang(int thang_dh) {
		try {
			List<DonHang> list = new ArrayList<DonHang>();
			String sql = "SELECT * FROM donhang where month(thoigian_mua)=" + thang_dh;
			list = _jdbcTemplate.query(sql, new MapperDonHang());
			return list;
		} catch (EmptyResultDataAccessException e) {
			return null;
		}
	}

//dem tong don hang theo thang chon
	public int DemTongDH(int thang_dh) {
		try {
			int count = 0;
			String sql = "SELECT count(*) FROM donhang where month(thoigian_mua)=" + thang_dh;
			count = _jdbcTemplate.queryForObject(sql, Integer.class);
			return count;
		} catch (Exception e) {
			return 0;
		}
	}

//tong tien don theo thang chon
	public int TongDH(int thang_dh) {
		try {
			int tong = 0;
			String sql = "SELECT sum(tongtien) FROM donhang where month(thoigian_mua)=" + thang_dh;
			if (_jdbcTemplate.queryForObject(sql, Integer.class) == null) {
				tong = 0;
			} else {
				tong = _jdbcTemplate.queryForObject(sql, Integer.class);
			}
			return tong;
		} catch (Exception e) {
			return 0;
		}
	}

//thong ke san pham theo thang chon
	public List<String[]> TKSP_thang(int thang_sp) {
		try {
			List<String[]> list = new ArrayList<String[]>();
			String sql = "SELECT chitietdonhang.id_sp, sanpham.ten_sp, sum(chitietdonhang.soluong) FROM chitietdonhang join sanpham join donhang where chitietdonhang.id_dh=donhang.id_dh and sanpham.id_sp=chitietdonhang.id_sp and month(donhang.thoigian_mua)="
					+ thang_sp + " group by chitietdonhang.id_sp";
			list = _jdbcTemplate.query(sql, new MapperThongKe());
			return list;
		} catch (EmptyResultDataAccessException e) {
			return null;
		}
	}

	public int DemTongSP(int thang_sp) {
		try {
			int tong = 0;
			String sql = "SELECT sum(soluong) FROM chitietdonhang join donhang where donhang.id_dh=chitietdonhang.id_dh and month(donhang.thoigian_mua)="
					+ thang_sp;
			if (_jdbcTemplate.queryForObject(sql, Integer.class) == null) {
				tong = 0;
			} else {
				tong = _jdbcTemplate.queryForObject(sql, Integer.class);
			}
			return tong;
		} catch (Exception e) {
			return 0;
		}
	}

}
