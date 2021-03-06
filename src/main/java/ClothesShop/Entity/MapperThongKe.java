package ClothesShop.Entity;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class MapperThongKe implements RowMapper<String[]>{
	public String[] mapRow(ResultSet rs, int rowNum) throws SQLException {
		String[] list = new String[3];
		list[0] = String.valueOf(rs.getInt("chitietdonhang.id_sp"));
		list[1] = String.valueOf(rs.getInt("sum(chitietdonhang.soluong)"));
		list[2] = rs.getString("sanpham.ten_sp");
		return list;
	}
}
