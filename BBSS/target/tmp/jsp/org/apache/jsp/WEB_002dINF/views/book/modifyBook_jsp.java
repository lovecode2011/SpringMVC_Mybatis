/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: jetty/9.2.8.v20150217
 * Generated at: 2015-09-20 17:04:52 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views.book;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class modifyBook_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("jar:file:/E:/WwSDK/MavenRepo/org/apache/taglibs/taglibs-standard-impl/1.2.1/taglibs-standard-impl-1.2.1.jar!/META-INF/c.tld", Long.valueOf(1384339662000L));
    _jspx_dependants.put("file:/E:/WwSDK/MavenRepo/org/apache/taglibs/taglibs-standard-impl/1.2.1/taglibs-standard-impl-1.2.1.jar", Long.valueOf(1441547325952L));
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fif_0026_005ftest;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.release();
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
      out.write("\r\n");
      out.write("\r\n");
      out.write("<html lang=\"zh-CN\">\r\n");
      out.write("\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"utf-8\">\r\n");
      out.write("<meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("<!-- 上述3个meta标签*必须*放在最前面，任何其他内容都*必须*跟随其后！ -->\r\n");
      out.write("<title>添加图书</title>\r\n");
      out.write("<!-- Bootstrap -->\r\n");
      out.write("<link href=\"");
      out.print(request.getContextPath());
      out.write("/resources/css/bootstrap.min.css\" rel=\"stylesheet\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"");
      out.print(request.getContextPath());
      out.write("/resources/Font-Awesome/css/font-awesome.min.css\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"");
      out.print(request.getContextPath());
      out.write("/resources/css/jquery.cxcalendar.css\">\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t<form class=\"form-horizontal\" id=\"modifyBook\" action=\"modifyBook\" method=\"post\"\r\n");
      out.write("\t\tenctype=\"multipart/form-data\">\r\n");
      out.write("\t\t<fieldset>\r\n");
      out.write("\t\t\t<!-- Form Name -->\r\n");
      out.write("\t\t\t<legend>ModifyBook</legend>\r\n");
      out.write("\t\t\t<!-- Text input-->\r\n");
      out.write("\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t<label class=\"col-md-4 control-label\" for=\"bookname\">图书名</label>\r\n");
      out.write("\t\t\t\t<div class=\"col-md-4\">\r\n");
      out.write("\t\t\t\t\t<input type=\"hidden\" name =\"bookid\"/>\r\n");
      out.write("\t\t\t\t\t<input id=\"bookname\" name=\"bookname\" type=\"text\" placeholder=\"图书名称\"\r\n");
      out.write("\t\t\t\t\t\tclass=\"form-control input-md\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${book.bookname }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\">\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t<!-- Text input-->\r\n");
      out.write("\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t<label class=\"col-md-4 control-label\" for=\"author\">图书作者</label>\r\n");
      out.write("\t\t\t\t<div class=\"col-md-4\">\r\n");
      out.write("\t\t\t\t\t<input id=\"author\" name=\"author\" type=\"text\" placeholder=\"图书作者\"\r\n");
      out.write("\t\t\t\t\t\tclass=\"form-control input-md\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${book.author}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t<!-- Text input-->\r\n");
      out.write("\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t<label class=\"col-md-4 control-label\" for=\"publish\">出版社</label>\r\n");
      out.write("\t\t\t\t<div class=\"col-md-4\">\r\n");
      out.write("\t\t\t\t\t<input id=\"publish\" name=\"publish\" type=\"text\" placeholder=\"出版社\"\r\n");
      out.write("\t\t\t\t\t\tclass=\"form-control input-md\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${book.publish}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t<!-- Text input-->\r\n");
      out.write("\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t<label class=\"col-md-4 control-label\" for=\"isbn\">ISBN</label>\r\n");
      out.write("\t\t\t\t<div class=\"col-md-4\">\r\n");
      out.write("\t\t\t\t\t<input id=\"isbn\" name=\"isbn\" type=\"text\" placeholder=\"ISBN\"\r\n");
      out.write("\t\t\t\t\t\tclass=\"form-control input-md\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${book.isbn}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t<!-- Text input-->\r\n");
      out.write("\t\t\t  <div class=\"form-group\">\r\n");
      out.write("\t\t\t\t<label class=\"col-md-4 control-label\" for=\"publishdate\" >出版时间</label>\r\n");
      out.write("\t\t\t\t<div class=\"col-md-4\">\r\n");
      out.write("\t\t\t\t\t<input id=\"publishdate\" name=\"publishdate\" type=\"text\"\r\n");
      out.write("\t\t\t\t\t\tplaceholder=\"出版时间\" class=\"form-control input-md\" data-position=\"right\" readonly value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${book.publishdate}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\">\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div> \r\n");
      out.write("\r\n");
      out.write("\t\t\t<!-- Select Basic -->\r\n");
      out.write("\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t<label class=\"col-md-4 control-label\" for=\"repertory\">图书仓库</label>\r\n");
      out.write("\t\t\t\t<div class=\"col-md-4\">\r\n");
      out.write("\t\t\t\t\t<select id=\"repertory\" name=\"repertory\" class=\"form-control\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${book.repertory }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\">\r\n");
      out.write("\t\t\t\t\t\t<option value=\"武汉\">武汉</option>\r\n");
      out.write("\t\t\t\t\t\t<option value=\"广州\">广州</option>\r\n");
      out.write("\t\t\t\t\t\t<option value=\"北京\">北京</option>\r\n");
      out.write("\t\t\t\t\t</select>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<!-- Text input-->\r\n");
      out.write("\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t<label class=\"col-md-4 control-label\" for=\"author\">图书分类</label>\r\n");
      out.write("\t\t\t\t<div class=\"col-md-4\">\r\n");
      out.write("\t\t\t\t\t<input id=\"bookclassid\" name=\"bookclassid\" type=\"text\" placeholder=\"图书作者\"\r\n");
      out.write("\t\t\t\t\t\tclass=\"form-control input-md\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${book.bookclassid}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\" disabled=\"disabled\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t");
      out.write("\r\n");
      out.write("\t\t\t<!-- Text input-->\r\n");
      out.write("\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t<label class=\"col-md-4 control-label\" for=\"price\">图书价格</label>\r\n");
      out.write("\t\t\t\t<div class=\"col-md-4\">\r\n");
      out.write("\t\t\t\t\t<input id=\"price\" name=\"price\" type=\"text\" placeholder=\"price\"\r\n");
      out.write("\t\t\t\t\t\tclass=\"form-control input-md\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${book.price}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t<!-- Text input-->\r\n");
      out.write("\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t<label class=\"col-md-4 control-label\" for=\"stock\">库存量</label>\r\n");
      out.write("\t\t\t\t<div class=\"col-md-4\">\r\n");
      out.write("\t\t\t\t\t<input id=\"stock\" name=\"stock\" type=\"text\" placeholder=\"1\"\r\n");
      out.write("\t\t\t\t\t\tclass=\"form-control input-md\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${book.stock }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<!-- Text input-->\r\n");
      out.write("\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t<label class=\"col-md-4 control-label\" for=\"stock\">销售量</label>\r\n");
      out.write("\t\t\t\t<div class=\"col-md-4\">\r\n");
      out.write("\t\t\t\t\t<input id=\"sales\" name=\"sales\" type=\"text\" placeholder=\"1\"\r\n");
      out.write("\t\t\t\t\t\tclass=\"form-control input-md\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${book.sales }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t<!-- File Button -->\r\n");
      out.write("\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t<label class=\"col-md-4 control-label\" for=\"picture\">图书封面</label>\r\n");
      out.write("\t\t\t\t");
      if (_jspx_meth_c_005fif_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\t\t");
      if (_jspx_meth_c_005fif_005f1(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t<!-- Multiple Checkboxes -->\r\n");
      out.write("\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t<label class=\"col-md-4 control-label\" for=\"isrecommend\">是否推荐</label>\r\n");
      out.write("\t\t\t\t");
      if (_jspx_meth_c_005fif_005f2(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\t\t");
      if (_jspx_meth_c_005fif_005f3(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t<!-- Textarea -->\r\n");
      out.write("\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t<label class=\"col-md-4 control-label\" for=\"intro\">图书简介</label>\r\n");
      out.write("\t\t\t\t<div class=\"col-md-4\">\r\n");
      out.write("\t\t\t\t\t<textarea class=\"form-control\" id=\"intro\" name=\"intro\"> ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${book.intro }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write(" </textarea>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t<!-- Button -->\r\n");
      out.write("\t\t\t<div class=\"form-group\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<div class=\"col-md-4\"></div>\r\n");
      out.write("\t\t\t\t<div class=\"col-md-4\">\r\n");
      out.write("\t\t\t\t\t<button class=\"btn btn-primary\">修改</button>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t</fieldset>\r\n");
      out.write("\t</form>\r\n");
      out.write("\r\n");
      out.write("\t <script src=\"");
      out.print(request.getContextPath());
      out.write("/resources/js/jquery.min.js\"></script>   \r\n");
      out.write("\t\r\n");
      out.write("\t <script src=\"");
      out.print(request.getContextPath());
      out.write("/resources/js/jquery.cxcalendar.min.js\"></script>\r\n");
      out.write("\t <script src=\"");
      out.print(request.getContextPath());
      out.write("/resources/js/jquery.cxcalendar.languages.js\">\r\n");
      out.write("\t \r\n");
      out.write("\t \r\n");
      out.write("\t </script>\r\n");
      out.write("\r\n");
      out.write("\t<script src=\"");
      out.print(request.getContextPath());
      out.write("/resources/js/bootstrap.min.js\"></script>\r\n");
      out.write("\t <script src=\"");
      out.print(request.getContextPath());
      out.write("/resources/js/jquery.validate.min.js\"></script>\r\n");
      out.write("\t <script src=\"");
      out.print(request.getContextPath());
      out.write("/resources/js/jquery.validate.min.js\"></script>\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t<script> \r\n");
      out.write("\t\r\n");
      out.write("\t$(document).ready(function(){\r\n");
      out.write("\t\tvar url = \"selectClassOne\";\r\n");
      out.write("\t\t$.ajax( {\r\n");
      out.write("\t\t\ttype : \"GET\",\r\n");
      out.write("\t\t\turl : url,\r\n");
      out.write("\t\t\tdata : {},\r\n");
      out.write("\t\t\tdataType : \"JSON\",\r\n");
      out.write("\t\t\tsuccess : function(data) {\r\n");
      out.write("\t\t\t\t//data为后台返回的Json信息\r\n");
      out.write("\t\t\t\tfor(var n=0;n<data.length;n++){\r\n");
      out.write("\t\t\t\t//\talert(data.length);\r\n");
      out.write("\t\t \t\t  \tvar ids=data[n].classid;\r\n");
      out.write("\t\t \t\t  //\talert(ids);\r\n");
      out.write("\t\t\t\t\tvar names=data[n].classname;\r\n");
      out.write("\t\t\t\t//\talert(names);\r\n");
      out.write("\t\t\t\t\t$(\"#bookOneclassid\").append(\"<option  value='\"+ids+\"'>\"+names+\"</option>\");\r\n");
      out.write("\t\t     \t\t}\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t})\r\n");
      out.write("\t\t\r\n");
      out.write("\t});\r\n");
      out.write("\t\r\n");
      out.write("\tfunction getTwoClassify() {\r\n");
      out.write("\t\t$(\"#bookTwoclassid\").empty();//清空\r\n");
      out.write("\t\tvar id = document.getElementById(\"bookOneclassid\").value;\r\n");
      out.write("\t\tvar url = \"selectClassTwo/\"+id;\r\n");
      out.write("\t\t$.ajax( {\r\n");
      out.write("\t\t\ttype : \"GET\",\r\n");
      out.write("\t\t\turl : url,\r\n");
      out.write("\t\t\tdata : {},\r\n");
      out.write("\t\t\tdataType : \"JSON\",\r\n");
      out.write("\t\t\tsuccess : function(data) {\r\n");
      out.write("\t\t\t\t$(\"#bookTwoclassid\").append(\" <option >二级分类</option>\");\r\n");
      out.write("\t\t\t\t//data为后台返回的Json信息\r\n");
      out.write("\t\t\t\tfor(var n=0;n<data.length;n++){\r\n");
      out.write("\t\t\t\t//\talert(data.length);\r\n");
      out.write("\t\t \t\t  \tvar ids=data[n].classid;\r\n");
      out.write("\t\t \t\t  //\talert(ids);\r\n");
      out.write("\t\t\t\t\tvar names=data[n].classname;\r\n");
      out.write("\t\t\t\t//\talert(names);\r\n");
      out.write("\t\t\t\t\t$(\"#bookTwoclassid\").append(\"<option  value='\"+ids+\"'>\"+names+\"</option>\");\r\n");
      out.write("\t\t     \t\t}\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t})\r\n");
      out.write("\t};\r\n");
      out.write("\tfunction getThreeClassify() {\r\n");
      out.write("\t\t$(\"#bookThreeclassid\").empty();//清空\r\n");
      out.write("\t\tvar id = document.getElementById(\"bookTwoclassid\").value;\r\n");
      out.write("\t\tvar url = \"selectClassThree/\"+id;\r\n");
      out.write("\t\t$.ajax( {\r\n");
      out.write("\t\t\ttype : \"GET\",\r\n");
      out.write("\t\t\turl : url,\r\n");
      out.write("\t\t\tdata : {},\r\n");
      out.write("\t\t\tdataType : \"JSON\",\r\n");
      out.write("\t\t\tsuccess : function(data) {\r\n");
      out.write("\t\t\t\t$(\"#bookThreeclassid\").append(\" <option >三级分类</option>\");\r\n");
      out.write("\t\t\t\t//data为后台返回的Json信息\r\n");
      out.write("\t\t\t\tfor(var n=0;n<data.length;n++){\r\n");
      out.write("\t\t\t\t//\talert(data.length);\r\n");
      out.write("\t\t \t\t  \tvar ids=data[n].classid;\r\n");
      out.write("\t\t \t\t  //\talert(ids);\r\n");
      out.write("\t\t\t\t\tvar names=data[n].classname;\r\n");
      out.write("\t\t\t\t//\talert(names);\r\n");
      out.write("\t\t\t\t\t$(\"#bookThreeclassid\").append(\"<option  value='\"+ids+\"'>\"+names+\"</option>\");\r\n");
      out.write("\t\t     \t\t}\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t})\r\n");
      out.write("\t};\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t$('#publishdate').cxCalendar({language: 'zh-cn',});\r\n");
      out.write("\t\t$(document).ready(function() {\r\n");
      out.write("\t\t\t$(\"#addBook\").validate({\r\n");
      out.write("\t\t\t\trules : {\r\n");
      out.write("\t\t\t\t\tbookname : {\r\n");
      out.write("\t\t\t\t\t\trequired : true,\r\n");
      out.write("\t\t\t\t\t\tminlength : 2,\r\n");
      out.write("\t\t\t\t\t\tmaxlength : 10\r\n");
      out.write("\t\t\t\t\t},\r\n");
      out.write("\t\t\t\t\tauthor : {\r\n");
      out.write("\t\t\t\t\t\trequired : true,\r\n");
      out.write("\t\t\t\t\t\tminlength : 2,\r\n");
      out.write("\t\t\t\t\t\tmaxlength : 10\r\n");
      out.write("\t\t\t\t\t},\r\n");
      out.write("\t\t\t\t\tpublish : {\r\n");
      out.write("\t\t\t\t\t\trequired : true,\r\n");
      out.write("\t\t\t\t\t\tminlength : 2,\r\n");
      out.write("\t\t\t\t\t\tmaxlength : 20\r\n");
      out.write("\t\t\t\t\t},\r\n");
      out.write("\t\t\t\t\tisbn: {\r\n");
      out.write("\t\t\t\t\t\trequired : true,\r\n");
      out.write("\t\t\t\t\t\tminlength : 6,\r\n");
      out.write("\t\t\t\t\t\tmaxlength : 15\r\n");
      out.write("\t\t\t\t\t},\r\n");
      out.write("\t\t\t\t\tpublishDate: {\r\n");
      out.write("\t\t\t\t\t\trequired : true,\r\n");
      out.write("\t\t\t\t\t},\r\n");
      out.write("\t\t\t\t\tintro:{\r\n");
      out.write("\t\t\t\t\t\trequired : true,\r\n");
      out.write("\t\t\t\t\t\tminlength : 12,\r\n");
      out.write("\t\t\t\t\t\tmaxlength : 1000\r\n");
      out.write("\t\t\t\t\t},\r\n");
      out.write("\t\t\t\t\tprice:{\r\n");
      out.write("\t\t\t\t\t\trequired:true,\r\n");
      out.write("\t\t\t\t\t},staock:{\r\n");
      out.write("\t\t\t\t\t\trequired:true,\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t},\r\n");
      out.write("\t\t\t\tmessages : {\r\n");
      out.write("\t\t\t\t\tbookname : {\r\n");
      out.write("\t\t\t\t\t\trequired : \"请输入图书名称\",\r\n");
      out.write("\t\t\t\t\t\tminlength : \"图书名称最短为两个字\",\r\n");
      out.write("\t\t\t\t\t\tmaxlength : \"图书名称最长为10个字\"\r\n");
      out.write("\t\t\t\t\t},\r\n");
      out.write("\t\t\t\t\tauthor : {\r\n");
      out.write("\t\t\t\t\t\trequired : \"请输入作者\",\r\n");
      out.write("\t\t\t\t\t\tminlength : \"作者名称最短为两个字\",\r\n");
      out.write("\t\t\t\t\t\tmaxlength : \"作者名称最长为10个字\"\r\n");
      out.write("\t\t\t\t\t},\r\n");
      out.write("\t\t\t\t\tpublish : {\r\n");
      out.write("\t\t\t\t\t\trequired : \"请输入出版社\",\r\n");
      out.write("\t\t\t\t\t\tminlength : \"出版社名称最短为两个字\",\r\n");
      out.write("\t\t\t\t\t\tmaxlength : \"出版社名称最长为20个字\"\r\n");
      out.write("\t\t\t\t\t},\r\n");
      out.write("\t\t\t\t\tisbn: {\r\n");
      out.write("\t\t\t\t\t\trequired : \"请输入ISBN\",\r\n");
      out.write("\t\t\t\t\t\tminlength : \"ISBN最短为6\",\r\n");
      out.write("\t\t\t\t\t\tmaxlength : \"ISBN最长为15\"\r\n");
      out.write("\t\t\t\t\t},\r\n");
      out.write("\t\t\t\t\tpublishDate: {\r\n");
      out.write("\t\t\t\t\t\trequired : \"请选择出版时间\",\r\n");
      out.write("\t\t\t\t\t},\r\n");
      out.write("\t\t\t\t\tintro:{\r\n");
      out.write("\t\t\t\t\t\trequired : \"请输入简介\",\r\n");
      out.write("\t\t\t\t\t\tminlength : \"简介最短为12个字\",\r\n");
      out.write("\t\t\t\t\t\tmaxlength : \"简介最长为1000个字\"\r\n");
      out.write("\t\t\t\t\t},\r\n");
      out.write("\t\t\t\t\tprice:{\r\n");
      out.write("\t\t\t\t\t\trequired:\"请输入价格\",\r\n");
      out.write("\t\t\t\t\t},staock:{\r\n");
      out.write("\t\t\t\t\t\trequired:\"请输入库存\",\r\n");
      out.write("\t\t\t\t\t}\r\n");
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

  private boolean _jspx_meth_c_005fif_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f0.setParent(null);
    // /WEB-INF/views/book/modifyBook.jsp(151,4) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fif_005f0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${book.picture!=NULL}", boolean.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_005fif_005f0 = _jspx_th_c_005fif_005f0.doStartTag();
    if (_jspx_eval_c_005fif_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\t<div class=\"col-md-3\">\r\n");
        out.write("\t\t\t\t\t<img alt=\"图书封面\" src=\"http://wwhahapic.tunnel.mobi/");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${book.picture }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
        out.write("\" width=\"200px\" height=\"150px\" >\r\n");
        out.write("\t\t\t\t\t<input type=\"hidden\" name =\"picturename\" value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${book.picture }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
        out.write("\">\r\n");
        out.write("\t\t\t\t</div>\r\n");
        out.write("\t\t\t\t<div class=\"col-md-3\">\r\n");
        out.write("\t\t\t\t\t<input id=\"picture\" name=\"picture\" class=\"input-file\" type=\"file\">\r\n");
        out.write("\t\t\t\t</div>\r\n");
        out.write("\t\t\t\t");
        int evalDoAfterBody = _jspx_th_c_005fif_005f0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fif_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f0);
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f1(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f1 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f1.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f1.setParent(null);
    // /WEB-INF/views/book/modifyBook.jsp(160,4) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fif_005f1.setTest(false);
    int _jspx_eval_c_005fif_005f1 = _jspx_th_c_005fif_005f1.doStartTag();
    if (_jspx_eval_c_005fif_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t\t<div class=\"col-md-4\">\r\n");
        out.write("\t\t\t\t\t<input id=\"picture\" name=\"picture\" class=\"input-file\" type=\"file\">\r\n");
        out.write("\t\t\t\t</div>\r\n");
        out.write("\t\t\t\t");
        int evalDoAfterBody = _jspx_th_c_005fif_005f1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fif_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f1);
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f2(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f2 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f2.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f2.setParent(null);
    // /WEB-INF/views/book/modifyBook.jsp(171,4) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fif_005f2.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${book.isrecommend==0}", boolean.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_005fif_005f2 = _jspx_th_c_005fif_005f2.doStartTag();
    if (_jspx_eval_c_005fif_005f2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t\t<div class=\"col-md-4\">\r\n");
        out.write("\t\t\t\t\t<div class=\"checkbox\">\r\n");
        out.write("\t\t\t\t\t\t<label for=\"isrecommend\"> <input type=\"checkbox\"\r\n");
        out.write("\t\t\t\t\t\t\tname=\"isrecommend\" id=\"isrecommend\" value=\"1\"> 墙裂推荐\r\n");
        out.write("\t\t\t\t\t\t</label>\r\n");
        out.write("\t\t\t\t\t</div>\r\n");
        out.write("\t\t\t\t</div>\r\n");
        out.write("\t\t\t\t");
        int evalDoAfterBody = _jspx_th_c_005fif_005f2.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fif_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f2);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f2);
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f3(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f3 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f3.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f3.setParent(null);
    // /WEB-INF/views/book/modifyBook.jsp(180,4) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fif_005f3.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${book.isrecommend==1}", boolean.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_005fif_005f3 = _jspx_th_c_005fif_005f3.doStartTag();
    if (_jspx_eval_c_005fif_005f3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t\t<div class=\"col-md-4\">\r\n");
        out.write("\t\t\t\t\t<div class=\"checkbox\">\r\n");
        out.write("\t\t\t\t\t\t<label for=\"isrecommend\"> <input type=\"checkbox\"\r\n");
        out.write("\t\t\t\t\t\t\tname=\"isrecommend\" id=\"isrecommend\" value=\"1\" checked=\"checked\"> 墙裂推荐\r\n");
        out.write("\t\t\t\t\t\t</label>\r\n");
        out.write("\t\t\t\t\t</div>\r\n");
        out.write("\t\t\t\t</div>\r\n");
        out.write("\t\t\t\t");
        int evalDoAfterBody = _jspx_th_c_005fif_005f3.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fif_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f3);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f3);
    return false;
  }
}
