package ClothesShop.Service.Admin;

import java.util.ArrayList;
import java.util.List;

import org.mindrot.jbcrypt.BCrypt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import ClothesShop.Dao.AdminDao;
import ClothesShop.Entity.Admin;
import ClothesShop.Entity.DanhMuc;
import ClothesShop.Entity.MapperDanhMuc;
import ClothesShop.Entity.Users;

@Service
public class AdminAccountImpl implements AdminIAccount {

	@Autowired

	AdminDao adminDao = new AdminDao();

// add tài khoan
	public int AddAccountAdmin(Admin admin) {

		admin.setPass(BCrypt.hashpw(admin.getPass(), BCrypt.gensalt(12)));

		return adminDao.AddAccountAdmin(admin);
	}


//	check tài khoản
	public Admin CheckAccount(Admin admin) {
		String pass = admin.getPass();//pass truyen vo chua ma
		admin = adminDao.GetAdminByAcc(admin);//lay pass cua csdl
		if (admin != null) {
			if (BCrypt.checkpw(pass, admin.getPass())) {
				return admin;
			} else {
				return null;
			}
		}
		return null;
	}

	public Admin CheckAccount(String pass_cu, int id) {
		String pass = pass_cu;//pass truyen vo chua ma
		Admin admin = adminDao.GetAdminByAcc(pass_cu, id);//lay pass cua csdl
		if (admin != null) {
			if (BCrypt.checkpw(pass, admin.getPass())) {
				return admin;
			} else {
				return null;
			}
		}
		return null;
	}


	public int SetAccountAdmin(String pass_moi, int id, Admin admin) {

		admin.setPass(BCrypt.hashpw(pass_moi, BCrypt.gensalt(12)));

		return adminDao.SetAccountAdmin(pass_moi,id, admin);
	}
}
