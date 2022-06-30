<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<style>
table {
	font-family: arial, sans-serif;
	border-collapse: collapse;
	width: 100%;
}
table edit {
	font-family: arial, sans-serif;
	
	width: 100%;
}

td, th {
	border: 1px solid #dddddd;
	text-align: left;
	padding: 8px;
}

tr:nth-child(even) {
	background-color: #dddddd;
}

</style>
<div class="container-fluid text-center" style="border: 1px solid black">    
  <div class="row content">
    <div class="col-sm-2 sidenav" style="text-align: left;height:150%">
      <p><a class="nav-link active" href="./">
              <i class="bi bi-house-fill"></i>
              Trang Chủ
            </a></p>
      <p><a class="nav-link" href="quanlydanhmucSP">
              <i class="bi bi-folder"></i>
              Danh Mục Sản Phẩm
            </a></p>
      <p><a class="nav-link" href="quanlysanpham">
              <i class="bi bi-file-earmark-text"></i>
              Sản Phẩm
            </a></p>
            <p><a class="nav-link" href="quanlydonhang">
              <i class="bi bi-minecart"></i>
              Quản Lý Đơn Hàng
            </a></p>
            <p><a class="nav-link" href="quanlynguoidung">
              <i class="bi bi-people-fill"></i>
              Quản Lý Người Dùng
            </a></p>
            <p>
				<a class="nav-link" href="quanlynhanvien"> <i
					class="bi bi-question-circle-fill"></i> Quản Lý Nhân Viên
				</a>
			</p>
            <p><a class="nav-link" href="baocao">
              <i class="bi bi-bar-chart-line"></i>
              Báo Cáo
            </a></p>
    </div>
    <div class="col-sm-10 text-left"> 
    <div style="float:left; width: 49%">
    <h1  style="text-align: center"><b>Danh sách nhân viên</b></h1>
    <form action="timkiem_admin" method="GET" style= "margin-left: 10%">
    <input type="text" placeholder="Nhập tên nhân viên" name="tenad" style="width: 40%; margin-bottom: 1%;" onchange="this.form.submit()">
    <button type="submit">Tìm</button>
    </form>
    <table class="edit" border="1" style="width: 80%; margin-left: 10%"> 
    <tr><th style="width: 20%">ID</th><th style="width: 30%">Tài khoản</th><th style="width: 30%">Họ tên</th></tr>
    
    <c:forEach var="timkiem_ad" items="${timkiem_ad}" varStatus="index">
      <tr><td>${timkiem_ad.id_ad }</td><td>${timkiem_ad.taikhoan }</td><td>${timkiem_ad.hoten }</td>
      <td><a href="xoanhanvien?idnv=${timkiem_ad.id_ad }">Xóa</a></td>
      <td><a href="doimatkhau?idnv=${timkiem_ad.id_ad }">Đổi mật khẩu</a></td></tr>
    </c:forEach>
    
    <c:forEach var="admin" items="${admin}" varStatus="index">
    <tr><td>${admin.id_ad }</td><td>${admin.taikhoan }</td><td>${admin.hoten }</td><td><a href="xoanhanvien?idnv=${admin.id_ad }">Xóa</a></td>
    <td><a href="doimatkhau?idnv=${admin.id_ad }">Đổi mật khẩu</a></td></tr>
    </c:forEach>
    </table>
    </div>
    
    <div style="width: 49%; float: right; border-left: 1px solid black; text-align: center;">
  		<h2 class="text-center"><b>Tạo tài khoản admin</b></h2>
				<h5 style="color: red;" class="text-center">
					<?=$msg?>
				</h5>
			<form action="dangkyadmin" method="POST" modelAttribute="admin">
				<table style="width: 100%; height: 200px">
					<tr>
						<td style="background-color: #ffffff;border:0" ><b>Email: </b></td>
						<td style="background-color: #ffffff;border:0"><input type="email" name="taikhoan"
								placeholder="Mời nhập email" /></td>
					</tr>
					<tr>
						<td style="background-color: #ffffff;border:0"><b style="background-color: #ffffff">Mật khẩu: </b></td>
						<td style="background-color: #ffffff;border:0"><input type="password" name="pass"
								placeholder="Mời nhập mật khẩu" /></td>
					</tr>
					<tr>
						<td style="background-color: #ffffff;border:0"><b>Họ và tên: </b></td>
						<td style="background-color: #ffffff;border:0"><input type="text" name="hoten"
								placeholder="Mời nhập họ và tên" /></td>
					</tr>
					<tr style="background-color: #ffffff;border:0">
						<td style="background-color: #ffffff;border:0"></td>
						<td style="background-color: #ffffff; border:0"><button  type="submit" class="btn block">Đăng ký</button></td>
					</tr>
				</table>
			</form>
			
    </div>
    </div>
  </div>
</div>