/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: jetty/9.2.8.v20150217
 * Generated at: 2015-09-22 07:32:12 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views.classify;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class addClassifyOne_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("jar:file:/E:/WwSDK/MavenRepo/org/apache/taglibs/taglibs-standard-impl/1.2.1/taglibs-standard-impl-1.2.1.jar!/META-INF/c.tld", Long.valueOf(1384339662000L));
    _jspx_dependants.put("file:/E:/WwSDK/MavenRepo/org/apache/taglibs/taglibs-standard-impl/1.2.1/taglibs-standard-impl-1.2.1.jar", Long.valueOf(1441547325952L));
  }

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

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
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"zh-CN\">\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"utf-8\">\r\n");
      out.write("<meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("<!-- 上述3个meta标签*必须*放在最前面，任何其他内容都*必须*跟随其后！ -->\r\n");
      out.write("<title>添加图书</title>\r\n");
      out.write("<!-- Bootstrap -->\r\n");
      out.write("<link\r\n");
      out.write("\thref=\"");
      out.print(request.getContextPath());
      out.write("/resources/css/bootstrap.min.css\"\r\n");
      out.write("\trel=\"stylesheet\">\r\n");
      out.write("<link rel=\"stylesheet\"\r\n");
      out.write("\thref=\"");
      out.print(request.getContextPath());
      out.write("/resources/Font-Awesome/css/font-awesome.min.css\">\r\n");
      out.write("</head>\r\n");
      out.write("<style>\r\n");
      out.write("#box{\r\n");
      out.write("width:80%;\r\n");
      out.write("padding-top: 100px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("</style>\r\n");
      out.write("<body>\r\n");
      out.write("<div class=\"center-block\" id=\"box\" >\r\n");
      out.write("\t<form class=\"form-horizontal \" id=\"addClassifyOne\" action=\"addClassifyOne\"\r\n");
      out.write("\t\tmethod=\"post\">\r\n");
      out.write("\t\t<fieldset>\r\n");
      out.write("\t\t\t<!-- Form Name -->\r\n");
      out.write("\t\t\t<legend>addClassifyOne</legend>\r\n");
      out.write("\t\t\t<!-- Text input-->\r\n");
      out.write("\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t<label class=\"col-md-4 control-label\" for=\"classname\">一级图书目录</label>\r\n");
      out.write("\t\t\t\t<div class=\"col-md-4\">\r\n");
      out.write("\t\t\t\t\t<input id=\"classname\" name=\"classname\" type=\"text\"\r\n");
      out.write("\t\t\t\t\t\tplaceholder=\"图书分类\" class=\"form-control input-md\">\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<!-- Button -->\r\n");
      out.write("\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t<div class=\"col-md-4\"></div>\r\n");
      out.write("\t\t\t\t<div class=\"col-md-4\">\r\n");
      out.write("\t\t\t\t\t<button class=\"btn btn-primary\">添加</button>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</fieldset>\r\n");
      out.write("\t</form>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<script src=\"");
      out.print(request.getContextPath());
      out.write("/resources/js/jquery.min.js\"></script>\r\n");
      out.write("\t<script\r\n");
      out.write("\t\tsrc=\"");
      out.print(request.getContextPath());
      out.write("/resources/js/jquery.validate.min.js\"></script>\r\n");
      out.write("\t<script\r\n");
      out.write("\t\tsrc=\"");
      out.print(request.getContextPath());
      out.write("/resources/js/bootstrap.min.js\"></script>\r\n");
      out.write("\t<script>\r\n");
      out.write("\t\t$(document).ready(function() {\r\n");
      out.write("\t\t\t$(\"#addClassifyOne\").validate({\r\n");
      out.write("\t\t\t\trules : {\r\n");
      out.write("\t\t\t\t\tclassname : {\r\n");
      out.write("\t\t\t\t\t\trequired : true,\r\n");
      out.write("\t\t\t\t\t\tminlength : 2,\r\n");
      out.write("\t\t\t\t\t\tmaxlength : 5\r\n");
      out.write("\t\t\t\t\t},\r\n");
      out.write("\t\t\t\t},\r\n");
      out.write("\t\t\t\tmessages : {\r\n");
      out.write("\t\t\t\t\tclassname : {\r\n");
      out.write("\t\t\t\t\t\trequired : \"请输入分类名称\",\r\n");
      out.write("\t\t\t\t\t\tminlength : \"名称最短长度为2位\",\r\n");
      out.write("\t\t\t\t\t\tmaxlength : \"名称最长长度为5位\"\r\n");
      out.write("\t\t\t\t\t},\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t});\r\n");
      out.write("\t\t});\r\n");
      out.write("\t</script>\r\n");
      out.write("</body>\r\n");
      out.write("\r\n");
      out.write("</html>\r\n");
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
