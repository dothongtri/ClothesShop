/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.64
 * Generated at: 2022-06-28 08:56:45 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views.admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class admin_005fdangky_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(6);
    _jspx_dependants.put("jar:file:/C:/DevPrograms/ClothesShop/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/ClothesShop/WEB-INF/lib/spring-webmvc-5.3.18.jar!/META-INF/spring-form.tld", Long.valueOf(1648691400000L));
    _jspx_dependants.put("jar:file:/C:/DevPrograms/ClothesShop/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/ClothesShop/WEB-INF/lib/jstl-1.2.jar!/META-INF/c.tld", Long.valueOf(1153359882000L));
    _jspx_dependants.put("/WEB-INF/views/layouts/user/taglib.jsp", Long.valueOf(1655354507395L));
    _jspx_dependants.put("jar:file:/C:/DevPrograms/ClothesShop/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/ClothesShop/WEB-INF/lib/jstl-1.2.jar!/META-INF/fmt.tld", Long.valueOf(1153359882000L));
    _jspx_dependants.put("/WEB-INF/lib/jstl-1.2.jar", Long.valueOf(1654499598573L));
    _jspx_dependants.put("/WEB-INF/lib/spring-webmvc-5.3.18.jar", Long.valueOf(1654051976030L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
        return;
      }
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write('\r');
      out.write('\n');
      out.write("\r\n");
      out.write(" \r\n");
      out.write("  ");
      out.write("\r\n");
      out.write("<div class=\"container-fluid text-center\" style=\"border: 1px solid black\">\r\n");
      out.write("	<div class=\"row content\">\r\n");
      out.write("		<div class=\"col-sm-2 sidenav\" style=\"text-align: left\">\r\n");
      out.write("			<p>\r\n");
      out.write("				<a class=\"nav-link active\" href=\"./\"> <i\r\n");
      out.write("					class=\"bi bi-house-fill\"></i> Trang Chủ\r\n");
      out.write("				</a>\r\n");
      out.write("			</p>\r\n");
      out.write("			<p>\r\n");
      out.write("				<a class=\"nav-link\" href=\"quanlydanhmucSP\"> <i\r\n");
      out.write("					class=\"bi bi-folder\"></i> Danh Mục Sản Phẩm\r\n");
      out.write("				</a>\r\n");
      out.write("			</p>\r\n");
      out.write("			<p>\r\n");
      out.write("				<a class=\"nav-link\" href=\"quanlysanpham\"> <i\r\n");
      out.write("					class=\"bi bi-file-earmark-text\"></i> Sản Phẩm\r\n");
      out.write("				</a>\r\n");
      out.write("			</p>\r\n");
      out.write("			<p>\r\n");
      out.write("				<a class=\"nav-link\" href=\"quanlydonhang\"> <i\r\n");
      out.write("					class=\"bi bi-minecart\"></i> Quản Lý Đơn Hàng\r\n");
      out.write("				</a>\r\n");
      out.write("			</p>\r\n");
      out.write("			<p>\r\n");
      out.write("				<a class=\"nav-link\" href=\"quanlynguoidung\"> <i\r\n");
      out.write("					class=\"bi bi-people-fill\"></i> Quản Lý Người Dùng\r\n");
      out.write("				</a>\r\n");
      out.write("			</p>\r\n");
      out.write("			<p>\r\n");
      out.write("				<a class=\"nav-link\" href=\"#\"> <i\r\n");
      out.write("					class=\"bi bi-question-circle-fill\"></i> Quản Lý Phản Hồi\r\n");
      out.write("				</a>\r\n");
      out.write("			</p>\r\n");
      out.write("			<p>\r\n");
      out.write("				<a class=\"nav-link\" href=\"quanlydonhang\"> <i\r\n");
      out.write("					class=\"bi bi-bar-chart-line\"></i> Báo Cáo Doanh Thu\r\n");
      out.write("				</a>\r\n");
      out.write("			</p>\r\n");
      out.write("		</div>\r\n");
      out.write("\r\n");
      out.write("		<div class=\"panel panel-primary\"\r\n");
      out.write("			style=\"width: 390px; margin: 0px auto; margin-top: 50px; background-color: white; padding: 10px; border-radius: 5px; box-shadow: 2px 2px gray;\">\r\n");
      out.write("			<div class=\"panel-heading\">\r\n");
      out.write("				<h2 class=\"text-center\">Tạo tài khoản admin</h2>\r\n");
      out.write("				<h5 style=\"color: red;\" class=\"text-center\">\r\n");
      out.write("					<?=$msg?>\r\n");
      out.write("				</h5>\r\n");
      out.write("			</div>\r\n");
      out.write("			<div class=\"panel-body\" style=\"margin-left: 10px\">\r\n");
      out.write("				<form action=\"dangkyadmin\" method=\"POST\" modelAttribute=\"admin\">\r\n");
      out.write("					<div class=\"form-group\">\r\n");
      out.write("						<label for=\"email\">Email:</label> <input required=\"true\"\r\n");
      out.write("							type=\"email\" class=\"form-control\" id=\"email\" name=\"taikhoan\"\r\n");
      out.write("							value=\"\" style=\"margin-left: 10px\" placeholder=\"Nhập email\" />\r\n");
      out.write("					</div>\r\n");
      out.write("					<div class=\"form-group\">\r\n");
      out.write("						<label for=\"pwd\">Mật Khẩu:</label> <input required=\"true\"\r\n");
      out.write("							type=\"password\" class=\"form-control\" id=\"pwd\" name=\"pass\"\r\n");
      out.write("							minlength=\"6\" style=\"margin-left: 20px\"\r\n");
      out.write("							placeholder=\"Nhập mật khẩu\" />\r\n");
      out.write("					</div>\r\n");
      out.write("					<div class=\"form-group\">\r\n");
      out.write("						<label for=\"pwd\">Tên:</label> <input required=\"true\" type=\"text\"\r\n");
      out.write("							class=\"form-control\" id=\"pwd\" name=\"hoten\" minlength=\"6\"\r\n");
      out.write("							style=\"margin-left: 10px\" placeholder=\"Nhập tên\" />\r\n");
      out.write("					</div>\r\n");
      out.write("					<p style=\"height: 30px; color: red\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ statusLogin }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</p>\r\n");
      out.write("					<button type=\"submit\" class=\"btn btn-success\"\r\n");
      out.write("						style=\"display: block; margin: auto\">Đăng Ký</button>\r\n");
      out.write("				</form>\r\n");
      out.write("			</div>\r\n");
      out.write("		</div>\r\n");
      out.write("	</div>\r\n");
      out.write("</div>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
