/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.64
 * Generated at: 2022-06-29 06:40:24 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views.admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class admin_005fnhanvien_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("jar:file:/C:/DevPrograms/ClothesShop/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/ClothesShop/WEB-INF/lib/jstl-1.2.jar!/META-INF/c.tld", Long.valueOf(1153359882000L));
    _jspx_dependants.put("/WEB-INF/lib/jstl-1.2.jar", Long.valueOf(1654499598573L));
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

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvarStatus_005fvar_005fitems;

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
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvarStatus_005fvar_005fitems = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvarStatus_005fvar_005fitems.release();
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

      out.write("\r\n");
      out.write("\r\n");
      out.write("<div class=\"container-fluid text-center\" style=\"border: 1px solid black\">    \r\n");
      out.write("  <div class=\"row content\">\r\n");
      out.write("    <div class=\"col-sm-2 sidenav\" style=\"text-align: left\">\r\n");
      out.write("      <p><a class=\"nav-link active\" href=\"./\">\r\n");
      out.write("              <i class=\"bi bi-house-fill\"></i>\r\n");
      out.write("              Trang Chủ\r\n");
      out.write("            </a></p>\r\n");
      out.write("      <p><a class=\"nav-link\" href=\"quanlydanhmucSP\">\r\n");
      out.write("              <i class=\"bi bi-folder\"></i>\r\n");
      out.write("              Danh Mục Sản Phẩm\r\n");
      out.write("            </a></p>\r\n");
      out.write("      <p><a class=\"nav-link\" href=\"quanlysanpham\">\r\n");
      out.write("              <i class=\"bi bi-file-earmark-text\"></i>\r\n");
      out.write("              Sản Phẩm\r\n");
      out.write("            </a></p>\r\n");
      out.write("            <p><a class=\"nav-link\" href=\"quanlydonhang\">\r\n");
      out.write("              <i class=\"bi bi-minecart\"></i>\r\n");
      out.write("              Quản Lý Đơn Hàng\r\n");
      out.write("            </a></p>\r\n");
      out.write("            <p><a class=\"nav-link\" href=\"quanlynguoidung\">\r\n");
      out.write("              <i class=\"bi bi-people-fill\"></i>\r\n");
      out.write("              Quản Lý Người Dùng\r\n");
      out.write("            </a></p>\r\n");
      out.write("            <p>\r\n");
      out.write("				<a class=\"nav-link\" href=\"quanlynhanvien\"> <i\r\n");
      out.write("					class=\"bi bi-question-circle-fill\"></i> Quản Lý Nhân Viên\r\n");
      out.write("				</a>\r\n");
      out.write("			</p>\r\n");
      out.write("            <p><a class=\"nav-link\" href=\"baocao\">\r\n");
      out.write("              <i class=\"bi bi-bar-chart-line\"></i>\r\n");
      out.write("              Báo Cáo\r\n");
      out.write("            </a></p>\r\n");
      out.write("    </div>\r\n");
      out.write("    <div class=\"col-sm-10 text-left\"> \r\n");
      out.write("    <div style=\"float:left; width: 49%\">\r\n");
      out.write("    <h1><b>Danh sách nhân viên</b></h1>\r\n");
      out.write("    <form action=\"timkiem_admin\" method=\"GET\">\r\n");
      out.write("    <input type=\"text\" placeholder=\"Nhập tên nhân viên..\" name=\"tenad\" style=\"width: 40%; margin-bottom: 1%;\" onchange=\"this.form.submit()\">\r\n");
      out.write("    <button type=\"submit\">Tìm</button>\r\n");
      out.write("    </form>\r\n");
      out.write("    <table border=\"1\" style=\"width: 80%;\">\r\n");
      out.write("    <tr><th style=\"width: 20%\">ID</th><th style=\"width: 30%\">Tài khoản</th><th style=\"width: 30%\">Họ tên</th></tr>\r\n");
      out.write("    \r\n");
      out.write("    ");
      if (_jspx_meth_c_005fforEach_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("    \r\n");
      out.write("    ");
      if (_jspx_meth_c_005fforEach_005f1(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("    </table>\r\n");
      out.write("    </div>\r\n");
      out.write("    \r\n");
      out.write("    <div style=\"width: 49%; float: right; border-left: 1px solid black; text-align: center;\">\r\n");
      out.write("  		<h2 class=\"text-center\"><b>Tạo tài khoản admin</b></h2>\r\n");
      out.write("				<h5 style=\"color: red;\" class=\"text-center\">\r\n");
      out.write("					<?=$msg?>\r\n");
      out.write("				</h5>\r\n");
      out.write("			<form action=\"dangkyadmin\" method=\"POST\" modelAttribute=\"admin\">\r\n");
      out.write("				<table style=\"width: 100%; height: 200px\">\r\n");
      out.write("					<tr>\r\n");
      out.write("						<td><b>Email: </b></td>\r\n");
      out.write("						<td><input type=\"email\" name=\"taikhoan\"\r\n");
      out.write("								placeholder=\"Mời nhập email\" required /></td>\r\n");
      out.write("					</tr>\r\n");
      out.write("					<tr>\r\n");
      out.write("						<td><b>Mật khẩu: </b></td>\r\n");
      out.write("						<td><input type=\"password\" name=\"pass\"\r\n");
      out.write("								placeholder=\"Mời nhập mật khẩu\" required/></td>\r\n");
      out.write("					</tr>\r\n");
      out.write("					<tr>\r\n");
      out.write("						<td><b>Họ và tên: </b></td>\r\n");
      out.write("						<td><input type=\"text\" name=\"hoten\"\r\n");
      out.write("								placeholder=\"Mời nhập họ và tên\" required/></td>\r\n");
      out.write("					</tr>\r\n");
      out.write("					<tr>\r\n");
      out.write("						<td></td>\r\n");
      out.write("						<td><button type=\"submit\" class=\"btn block\">Đăng ký</button></td>\r\n");
      out.write("					</tr>\r\n");
      out.write("				</table>\r\n");
      out.write("			</form>\r\n");
      out.write("			\r\n");
      out.write("    </div>\r\n");
      out.write("    </div>\r\n");
      out.write("  </div>\r\n");
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

  private boolean _jspx_meth_c_005fforEach_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvarStatus_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    boolean _jspx_th_c_005fforEach_005f0_reused = false;
    try {
      _jspx_th_c_005fforEach_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005fforEach_005f0.setParent(null);
      // /WEB-INF/views/admin/admin_nhanvien.jsp(47,4) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fforEach_005f0.setVar("timkiem_ad");
      // /WEB-INF/views/admin/admin_nhanvien.jsp(47,4) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
      _jspx_th_c_005fforEach_005f0.setItems(new org.apache.jasper.el.JspValueExpression("/WEB-INF/views/admin/admin_nhanvien.jsp(47,4) '${timkiem_ad}'",_jsp_getExpressionFactory().createValueExpression(_jspx_page_context.getELContext(),"${timkiem_ad}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
      // /WEB-INF/views/admin/admin_nhanvien.jsp(47,4) name = varStatus type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fforEach_005f0.setVarStatus("index");
      int[] _jspx_push_body_count_c_005fforEach_005f0 = new int[] { 0 };
      try {
        int _jspx_eval_c_005fforEach_005f0 = _jspx_th_c_005fforEach_005f0.doStartTag();
        if (_jspx_eval_c_005fforEach_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
          do {
            out.write("\r\n");
            out.write("      <tr><td>");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${timkiem_ad.id_ad }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write("</td><td>");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${timkiem_ad.taikhoan }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write("</td><td>");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${timkiem_ad.hoten }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write("</td>\r\n");
            out.write("      <td><a href=\"xoanhanvien?idnv=");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${timkiem_ad.id_ad }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write("\">Xóa</a></td>\r\n");
            out.write("      <td><a href=\"doimatkhau?idnv=");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${timkiem_ad.id_ad }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write("\">Đổi mật khẩu</a></td></tr>\r\n");
            out.write("    ");
            int evalDoAfterBody = _jspx_th_c_005fforEach_005f0.doAfterBody();
            if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
              break;
          } while (true);
        }
        if (_jspx_th_c_005fforEach_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          return true;
        }
      } catch (java.lang.Throwable _jspx_exception) {
        while (_jspx_push_body_count_c_005fforEach_005f0[0]-- > 0)
          out = _jspx_page_context.popBody();
        _jspx_th_c_005fforEach_005f0.doCatch(_jspx_exception);
      } finally {
        _jspx_th_c_005fforEach_005f0.doFinally();
      }
      _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvarStatus_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f0);
      _jspx_th_c_005fforEach_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fforEach_005f0, _jsp_getInstanceManager(), _jspx_th_c_005fforEach_005f0_reused);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fforEach_005f1(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f1 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvarStatus_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    boolean _jspx_th_c_005fforEach_005f1_reused = false;
    try {
      _jspx_th_c_005fforEach_005f1.setPageContext(_jspx_page_context);
      _jspx_th_c_005fforEach_005f1.setParent(null);
      // /WEB-INF/views/admin/admin_nhanvien.jsp(53,4) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fforEach_005f1.setVar("admin");
      // /WEB-INF/views/admin/admin_nhanvien.jsp(53,4) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
      _jspx_th_c_005fforEach_005f1.setItems(new org.apache.jasper.el.JspValueExpression("/WEB-INF/views/admin/admin_nhanvien.jsp(53,4) '${admin}'",_jsp_getExpressionFactory().createValueExpression(_jspx_page_context.getELContext(),"${admin}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
      // /WEB-INF/views/admin/admin_nhanvien.jsp(53,4) name = varStatus type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fforEach_005f1.setVarStatus("index");
      int[] _jspx_push_body_count_c_005fforEach_005f1 = new int[] { 0 };
      try {
        int _jspx_eval_c_005fforEach_005f1 = _jspx_th_c_005fforEach_005f1.doStartTag();
        if (_jspx_eval_c_005fforEach_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
          do {
            out.write("\r\n");
            out.write("    <tr><td>");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${admin.id_ad }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write("</td><td>");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${admin.taikhoan }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write("</td><td>");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${admin.hoten }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write("</td><td><a href=\"xoanhanvien?idnv=");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${admin.id_ad }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write("\">Xóa</a></td>\r\n");
            out.write("    <td><a href=\"doimatkhau?idnv=");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${admin.id_ad }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write("\">Đổi mật khẩu</a></td></tr>\r\n");
            out.write("    ");
            int evalDoAfterBody = _jspx_th_c_005fforEach_005f1.doAfterBody();
            if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
              break;
          } while (true);
        }
        if (_jspx_th_c_005fforEach_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          return true;
        }
      } catch (java.lang.Throwable _jspx_exception) {
        while (_jspx_push_body_count_c_005fforEach_005f1[0]-- > 0)
          out = _jspx_page_context.popBody();
        _jspx_th_c_005fforEach_005f1.doCatch(_jspx_exception);
      } finally {
        _jspx_th_c_005fforEach_005f1.doFinally();
      }
      _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvarStatus_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f1);
      _jspx_th_c_005fforEach_005f1_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fforEach_005f1, _jsp_getInstanceManager(), _jspx_th_c_005fforEach_005f1_reused);
    }
    return false;
  }
}