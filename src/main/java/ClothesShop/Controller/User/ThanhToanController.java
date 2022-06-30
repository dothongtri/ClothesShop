package ClothesShop.Controller.User;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import ClothesShop.Dao.GioHangDao;
import ClothesShop.Entity.DonHang;
import ClothesShop.Entity.SanPham;
import ClothesShop.Entity.Users;
import ClothesShop.Service.User.ThanhToanImpl;

@Controller
public class ThanhToanController {
	@Autowired
	ThanhToanImpl thanhtoanimpl;
	public ModelAndView _mvShare = new ModelAndView();

	@RequestMapping(value = "dathang", method = RequestMethod.POST)
	public ModelAndView HienThiThanhToan(HttpSession session, HttpServletRequest request) {
		String[] check;
		check = request.getParameterValues("name_check");
			Users user	= (Users) session.getAttribute("LoginInfo");
		if (check == null) {
			session.setAttribute("notification", "Vui lòng chọn sản phẩm trước khi thanh toán");
			_mvShare.setViewName("redirect:./giohang?id_kh=" + user.getId_kh());
		} else {
			_mvShare.setViewName("user/thanhtoan");
			_mvShare.addObject("hienthithanhtoan", thanhtoanimpl.HienThiThanhToan(check));
			_mvShare.addObject("tongtien", thanhtoanimpl.TongTien(check));
		}
		return _mvShare;
	}
	@Autowired
GioHangDao giohangDao;
	@RequestMapping(value = "/thanhtoan", method = RequestMethod.POST)
	public ModelAndView ThanhToan(HttpSession session, @ModelAttribute("donhang") DonHang donhang, HttpServletRequest request) {
		thanhtoanimpl.SaveThanhToan(donhang);
		int i = 0;
		int id_sp, gia, soluong;
		String size;
		int id_dh = thanhtoanimpl.getIdDonHang();
		// System.out.println(id_dh);
		while (request.getParameterValues("id_sp" + i) != null) {

			id_sp = Integer.valueOf(request.getParameterValues("id_sp" + i)[0]);
			soluong = Integer.valueOf(request.getParameterValues("soluong" + i)[0]);
			size = String.valueOf(request.getParameterValues("size" + i)[0]);
			SanPham sp = thanhtoanimpl.getSanPham(id_sp);

			thanhtoanimpl.deleteGioHang(id_sp);
			thanhtoanimpl.SaveChiTietDonHang(id_dh, size, sp.getGia(), id_sp, soluong);
			i++;
		}
		session.setAttribute("kh", donhang.getId_kh());
		session.setAttribute("count", giohangDao.Count(donhang.getId_kh()));
		_mvShare.setViewName("redirect: ./donhang?id_kh=" + donhang.getId_kh());
		return _mvShare;
	}

}
