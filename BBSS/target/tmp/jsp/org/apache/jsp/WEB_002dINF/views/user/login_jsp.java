/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: jetty/9.2.8.v20150217
 * Generated at: 2015-09-30 15:20:07 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views.user;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"zh-CN\">\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"utf-8\">\r\n");
      out.write("<meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("<title>登录</title>\r\n");
      out.write("<!-- Bootstrap -->\r\n");
      out.write("<link  href=\"css/bootstrap.min.css\" rel=\"stylesheet\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"Font-Awesome/css/bootstrap.min.css\">\r\n");
      out.write("<link rel=\"stylesheet\" \thref=\"Font-Awesome/css/font-awesome.min.css\">\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write("body {\r\n");
      out.write("\tbackground-color: #F6F9FB;\r\n");
      out.write("}\r\n");
      out.write("#mainbox {\r\n");
      out.write("\tbackground-color: #FFF;\r\n");
      out.write("\tmargin-top: 120px;\r\n");
      out.write("\tmargin-left: 200px;\r\n");
      out.write("\twidth: 840px;\r\n");
      out.write("\theight: 430px;\r\n");
      out.write("\tpadding: 15px 15px;\r\n");
      out.write("\tborder: 1px solid #eef2f4;\r\n");
      out.write("\tbox-shadow: 0px 1px 2px #eee;\r\n");
      out.write("}\r\n");
      out.write("#mainbox img {\r\n");
      out.write("\twidth: 400px;\r\n");
      out.write("\theight: 400px;\r\n");
      out.write("}\r\n");
      out.write("#loginForm {\r\n");
      out.write("\tpadding-top: 80px;\r\n");
      out.write("\tpadding-left: 20px;\r\n");
      out.write("}\r\n");
      out.write("#loginForm .input-group {\r\n");
      out.write("\tpadding-top: 20px;\r\n");
      out.write("}\r\n");
      out.write("#loginForm img {\r\n");
      out.write("\twidth: 80px;\r\n");
      out.write("\theight: 35px;\r\n");
      out.write("}\r\n");
      out.write("#footer {\r\n");
      out.write("\tpadding-top: 50px;\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("\t<div class=\"container-fluid\">\r\n");
      out.write("\t\t<div class=\"row\" id=\"mainbox\">\r\n");
      out.write("\t\t\t<div class=\"col-md-6\">\r\n");
      out.write("\t\t\t\t<img alt=\"Bootstrap Image Preview\"\r\n");
      out.write("\t\t\t\t\tsrc=\"images/01.jpg\"\r\n");
      out.write("\t\t\t\t\tclass=\"img-rounded\" />\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"col-md-6\">\r\n");
      out.write("\t\t\t\t<form id=\"loginForm\" action=\"login\" method=\"post\"\r\n");
      out.write("\t\t\t\t\tclass=\"form-horizontal\">\r\n");
      out.write("\t\t\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t\t\t<label for=\"inputEmail3\" class=\"col-sm-2 control-label\">邮箱</label>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"col-sm-10\">\r\n");
      out.write("\t\t\t\t\t\t\t<input type=\"text\" class=\"form-control\" placeholder=\"Email\"\r\n");
      out.write("\t\t\t\t\t\t\t\tname=\"email\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${cookie.email.value}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\">\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t\t\t<label for=\"inputEmail3\" class=\"col-sm-2 control-label\">密码</label>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"col-sm-10\">\r\n");
      out.write("\t\t\t\t\t\t\t<input type=\"password\" class=\"form-control\"\r\n");
      out.write("\t\t\t\t\t\t\t\tplaceholder=\"Password\" name=\"password\"\r\n");
      out.write("\t\t\t\t\t\t\t\tvalue=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${cookie.password.value}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\">\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<!-- /input-group -->\r\n");
      out.write("\t\t\t\t\t<div class=\"form-group\" id=\"imgview\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<div class=\"col-md-8\">\r\n");
      out.write("\t\t\t\t\t\t\t<input type=\"text\" class=\"form-control pull-left \"\r\n");
      out.write("\t\t\t\t\t\t\t\tplaceholder=\"验证码\" name=\"checkcode\">\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<!-- <img  align=\"middle\" title=\"看不清，请点我\"  /> -->\r\n");
      out.write("\t\t\t\t\t\t<div class=\"col-md-4\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<img alt=\"验证图片\"\r\n");
      out.write("\t\t\t\t\t\t\t\tsrc=\"");
      out.print(request.getContextPath());
      out.write("/VerifyCodeServlet\"\r\n");
      out.write("\t\t\t\t\t\t\t\tclass=\"img-rounded  \" onclick=\"javascript:refresh(this);\"\r\n");
      out.write("\t\t\t\t\t\t\t\tonmouseover=\"mouseover(this)\" />\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"checkbox\">\r\n");
      out.write("\t\t\t\t\t\t<label> <input type=\"checkbox\" name=\"checkbox\">\r\n");
      out.write("\t\t\t\t\t\t\t记住密码\r\n");
      out.write("\t\t\t\t\t\t</label> <label class=\"pull-right\"> <a href=\"register\"\r\n");
      out.write("\t\t\t\t\t\t\tclass=\"btn btn-link btn-xs \" role=\"button\">立即注册</a>\r\n");
      out.write("\t\t\t\t\t\t</label>\r\n");
      out.write("\t\t\t\t\t\t<!--\r\n");
      out.write("                         <label class=\"pull-right\">\r\n");
      out.write("                            <a href=\"#\" class=\"btn btn-link btn-xs \" role=\"button\">忘记密码</a>\r\n");
      out.write("                        </label>\r\n");
      out.write("                        -->\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<button type=\"submit\" class=\"btn btn-primary btn-block btn-lg\">登录</button>\r\n");
      out.write("\t\t\t\t</form>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\r\n");
      out.write("\t<div class=\"text-center\" id=\"footer\">\r\n");
      out.write("\t\t<span>Copyright (C) BookSales 2004-2012, All Rights Reserved</span><span>\r\n");
      out.write("\t\t\t| </span><span>BY<a href=\"#\" class=\"btn btn-link btn-xs \"\r\n");
      out.write("\t\t\trole=\"button\">软件实训小组</a></span>\r\n");
      out.write("\t</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t<script src=\"js/jquery.min.js\"></script>\r\n");
      out.write("\t<script\r\n");
      out.write("\t\tsrc=\"js/jquery.validate.min.js\"></script>\r\n");
      out.write("\t<script\r\n");
      out.write("\t\tsrc=\"js/bootstrap.min.js\"></script>\r\n");
      out.write("\t<script>  \r\n");
      out.write("    function refresh(obj){  \r\n");
      out.write("         obj.src = \"");
      out.print(request.getContextPath());
      out.write("/VerifyCodeServlet?\"+ Math.random();\r\n");
      out.write("\t}\r\n");
      out.write("\r\n");
      out.write("\tfunction mouseover(obj) {\r\n");
      out.write("\t\tobj.style.cursor = \"pointer\";\r\n");
      out.write("\t}\r\n");
      out.write("\r\n");
      out.write("\t$(document).ready(function() {\r\n");
      out.write("\t\t$(\"#loginForm\").validate({\r\n");
      out.write("\t\t\trules : {\r\n");
      out.write("\t\t\t\temail : {\r\n");
      out.write("\t\t\t\t\trequired : true,\r\n");
      out.write("\t\t\t\t\temail : true\r\n");
      out.write("\t\t\t\t},\r\n");
      out.write("\t\t\t\tpassword : {\r\n");
      out.write("\t\t\t\t\trequired : true,\r\n");
      out.write("\t\t\t\t\tminlength : 2,\r\n");
      out.write("\t\t\t\t\tmaxlength : 10\r\n");
      out.write("\t\t\t\t},\r\n");
      out.write("\t\t\t\tcheckcode:{\r\n");
      out.write("\t\t\t\t\trequired : true,\r\n");
      out.write("\t\t\t\t\tminlength : 4,\r\n");
      out.write("\t\t\t\t\tmaxlength : 4\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t},\r\n");
      out.write("\t\t\tmessages : {\r\n");
      out.write("\t\t\t\temail : {\r\n");
      out.write("\t\t\t\t\trequired : '请输入电子邮件',\r\n");
      out.write("\t\t\t\t\temail : '请检查电子邮件的格式'\r\n");
      out.write("\t\t\t\t},\r\n");
      out.write("\t\t\t\tpassword : {\r\n");
      out.write("\t\t\t\t\trequired : '请输入密码',\r\n");
      out.write("\t\t\t\t\tminlength : \"密码最短为2位\",\r\n");
      out.write("\t\t\t\t\tmaxlength : \"密码最长为10位\"\r\n");
      out.write("\t\t\t\t},\r\n");
      out.write("\t\t\t\tcheckcode:{\r\n");
      out.write("\t\t\t\t\trequired : \"请输入验证码\",\r\n");
      out.write("\t\t\t\t\tminlength : \"验证码的的长度为4\",\r\n");
      out.write("\t\t\t\t\tmaxlength : \"验证码的的长度为4\"\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t});\r\n");
      out.write("\t});\r\n");
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
