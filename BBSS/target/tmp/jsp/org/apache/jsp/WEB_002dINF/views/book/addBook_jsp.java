/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: jetty/9.2.8.v20150217
 * Generated at: 2015-09-22 06:29:12 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views.book;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class addBook_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

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
      out.write("<!DOCTYPE html>\r\n");
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
      out.write("/resources/css/jquery.cxcalendar.css\">\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<style>\r\n");
      out.write("#box{\r\n");
      out.write("width:80%;\r\n");
      out.write("padding-top: 20px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("</style>\r\n");
      out.write("<body>\r\n");
      out.write("<div class=\"center-block\" id=\"box\" >\r\n");
      out.write("\t<form class=\"form-horizontal\" id=\"addBook\" action=\"addBook\" method=\"post\"\r\n");
      out.write("\t\tenctype=\"multipart/form-data\">\r\n");
      out.write("\t\t<fieldset>\r\n");
      out.write("\r\n");
      out.write("\t\t\t<!-- Form Name -->\r\n");
      out.write("\t\t\t<legend>AddBook</legend>\r\n");
      out.write("\r\n");
      out.write("\t\t\t<!-- Text input-->\r\n");
      out.write("\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t<label class=\"col-md-4 control-label\" for=\"bookname\">图书名</label>\r\n");
      out.write("\t\t\t\t<div class=\"col-md-4\">\r\n");
      out.write("\t\t\t\t\t<input id=\"bookname\" name=\"bookname\" type=\"text\" placeholder=\"图书名称\"\r\n");
      out.write("\t\t\t\t\t\tclass=\"form-control input-md\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t<!-- Text input-->\r\n");
      out.write("\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t<label class=\"col-md-4 control-label\" for=\"author\">图书作者</label>\r\n");
      out.write("\t\t\t\t<div class=\"col-md-4\">\r\n");
      out.write("\t\t\t\t\t<input id=\"author\" name=\"author\" type=\"text\" placeholder=\"图书作者\"\r\n");
      out.write("\t\t\t\t\t\tclass=\"form-control input-md\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t<!-- Text input-->\r\n");
      out.write("\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t<label class=\"col-md-4 control-label\" for=\"publish\">出版社</label>\r\n");
      out.write("\t\t\t\t<div class=\"col-md-4\">\r\n");
      out.write("\t\t\t\t\t<input id=\"publish\" name=\"publish\" type=\"text\" placeholder=\"出版社\"\r\n");
      out.write("\t\t\t\t\t\tclass=\"form-control input-md\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t<!-- Text input-->\r\n");
      out.write("\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t<label class=\"col-md-4 control-label\" for=\"isbn\">ISBN</label>\r\n");
      out.write("\t\t\t\t<div class=\"col-md-4\">\r\n");
      out.write("\t\t\t\t\t<input id=\"isbn\" name=\"isbn\" type=\"text\" placeholder=\"ISBN\"\r\n");
      out.write("\t\t\t\t\t\tclass=\"form-control input-md\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t<!-- Text input-->\r\n");
      out.write("\t\t\t  <div class=\"form-group\">\r\n");
      out.write("\t\t\t\t<label class=\"col-md-4 control-label\" for=\"publishdate\" >出版时间</label>\r\n");
      out.write("\t\t\t\t<div class=\"col-md-4\">\r\n");
      out.write("\t\t\t\t\t<input id=\"publishdate\" name=\"publishdate\" type=\"text\"\r\n");
      out.write("\t\t\t\t\t\tplaceholder=\"出版时间\" class=\"form-control input-md\" data-position=\"right\" readonly>\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div> \r\n");
      out.write("\r\n");
      out.write("\t\t\t<!-- Select Basic -->\r\n");
      out.write("\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t<label class=\"col-md-4 control-label\" for=\"repertory\">图书仓库</label>\r\n");
      out.write("\t\t\t\t<div class=\"col-md-4\">\r\n");
      out.write("\t\t\t\t\t<select id=\"repertory\" name=\"repertory\" class=\"form-control\">\r\n");
      out.write("\t\t\t\t\t\t<option value=\"武汉\">武汉</option>\r\n");
      out.write("\t\t\t\t\t\t<option value=\"广州\">广州</option>\r\n");
      out.write("\t\t\t\t\t\t<option value=\"北京\">北京</option>\r\n");
      out.write("\t\t\t\t\t</select>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<!-- Select Basic -->\r\n");
      out.write("\t\t\t<!--   比较耗时\r\n");
      out.write("\t\t\t<div class=\"form-group\" id=\"classifyjson\"\r\n");
      out.write("\t\t\t\tdata-url=\"classifyJson\">\r\n");
      out.write("\t\t\t\t<label class=\"col-md-3 control-label\"\r\n");
      out.write("\t\t\t\t\tfor=\"receiveraddress\">图书分类</label>\r\n");
      out.write("\t\t\t\t\t<div class=\"col-md-3\">\r\n");
      out.write("\t\t\t\t\t\t\t<select id=\"one \" name=\"one\"  \r\n");
      out.write("\t\t\t\t\t\t\tclass=\"form-control one cxselect \" disabled=\"disabled\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<option >省份</option>\r\n");
      out.write("\t\t\t\t\t\t</select>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"col-md-3\">\r\n");
      out.write("\t\t\t\t\t\t\t<select id=\"two\" name=\"two\"  \r\n");
      out.write("\t\t\t\t\t\t\tclass=\"form-control two cxselect \" disabled=\"disabled\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<option >省份</option>\r\n");
      out.write("\t\t\t\t\t\t</select>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"col-md-3\">\r\n");
      out.write("\t\t\t\t\t\t\t<select id=\"three \" name=\"three\"  \r\n");
      out.write("\t\t\t\t\t\t\tclass=\"form-control three cxselect \" disabled=\"disabled\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<option >省份</option>\r\n");
      out.write("\t\t\t\t\t\t</select>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t-->\r\n");
      out.write("\t\t\t<!-- Select Basic -->\r\n");
      out.write("\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t<label class=\"col-md-4 control-label\" for=\"bookclassid\">图书分类</label>\r\n");
      out.write("\t\t\t\t<div class=\"col-md-2\">\r\n");
      out.write("\t\t\t\t\t<select id=\"bookOneclassid\" name=\"bookOneclassid\" class=\"form-control\" onchange=\"getTwoClassify()\" >\r\n");
      out.write("\t\t\t\t\t\t  <option value=\"-1\">一级分类</option>\r\n");
      out.write("\t\t\t\t\t</select>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"col-md-2\">\r\n");
      out.write("\t\t\t\t\t<select id=\"bookTwoclassid\" name=\"bookTwoclassid\"  \r\n");
      out.write("\t\t\t\t\t\tclass=\"form-control \" onchange=\"getThreeClassify()\">\r\n");
      out.write("\t\t\t\t\t\t  <option value=\"-1\">二级分类</option>\r\n");
      out.write("\t\t\t\t\t</select>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"col-md-2\">\r\n");
      out.write("\t\t\t\t\t<select id=\"bookThreeclassid\" name=\"bookThreeclassid\"  \r\n");
      out.write("\t\t\t\t\t\tclass=\"form-control \">\r\n");
      out.write("\t\t\t\t\t\t  <option value=\"-1\">三级分类</option>\r\n");
      out.write("\t\t\t\t\t</select>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t<!-- Text input-->\r\n");
      out.write("\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t<label class=\"col-md-4 control-label\" for=\"price\">图书价格</label>\r\n");
      out.write("\t\t\t\t<div class=\"col-md-4\">\r\n");
      out.write("\t\t\t\t\t<input id=\"price\" name=\"price\" type=\"text\" placeholder=\"10.0\"\r\n");
      out.write("\t\t\t\t\t\tclass=\"form-control input-md\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t<!-- Text input-->\r\n");
      out.write("\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t<label class=\"col-md-4 control-label\" for=\"stock\">库存量</label>\r\n");
      out.write("\t\t\t\t<div class=\"col-md-4\">\r\n");
      out.write("\t\t\t\t\t<input id=\"stock\" name=\"stock\" type=\"text\" placeholder=\"1\"\r\n");
      out.write("\t\t\t\t\t\tclass=\"form-control input-md\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t<!-- File Button -->\r\n");
      out.write("\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t<label class=\"col-md-4 control-label\" for=\"picture\">图书封面</label>\r\n");
      out.write("\t\t\t\t<div class=\"col-md-4\">\r\n");
      out.write("\t\t\t\t\t<input id=\"picture\" name=\"picture\" class=\"input-file\" type=\"file\">\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t<!-- Multiple Checkboxes -->\r\n");
      out.write("\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t<label class=\"col-md-4 control-label\" for=\"isrecommend\">是否推荐</label>\r\n");
      out.write("\t\t\t\t<div class=\"col-md-4\">\r\n");
      out.write("\t\t\t\t\t<div class=\"checkbox\">\r\n");
      out.write("\t\t\t\t\t\t<label for=\"isrecommend\"> <input type=\"checkbox\"\r\n");
      out.write("\t\t\t\t\t\t\tname=\"isrecommend\" id=\"isrecommend\" value=\"1\"> 墙裂推荐\r\n");
      out.write("\t\t\t\t\t\t</label>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t<!-- Textarea -->\r\n");
      out.write("\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t<label class=\"col-md-4 control-label\" for=\"intro\">图书简介</label>\r\n");
      out.write("\t\t\t\t<div class=\"col-md-4\">\r\n");
      out.write("\t\t\t\t\t<textarea class=\"form-control\" id=\"intro\" name=\"intro\">这是一本怎么样的书！！</textarea>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t<!-- Button -->\r\n");
      out.write("\t\t\t<div class=\"form-group\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<div class=\"col-md-4\"></div>\r\n");
      out.write("\t\t\t\t<div class=\"col-md-4\">\r\n");
      out.write("\t\t\t\t\t<button class=\"btn btn-primary\">添加</button>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t</fieldset>\r\n");
      out.write("\t</form>\r\n");
      out.write("</div>\r\n");
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
      out.write("\t </script>\r\n");
      out.write("\t <script type=\"text/javascript\">\r\n");
      out.write("\t $('#publishdate').cxCalendar({language: 'zh-cn',});\r\n");
      out.write("\t </script>\r\n");
      out.write("\r\n");
      out.write("\t<script src=\"");
      out.print(request.getContextPath());
      out.write("/resources/js/bootstrap.min.js\"></script>\r\n");
      out.write("\t <script src=\"");
      out.print(request.getContextPath());
      out.write("/resources/js/jquery.validate.min.js\"></script>\r\n");
      out.write("\t\t<script\r\n");
      out.write("\t\tsrc=\"");
      out.print(request.getContextPath());
      out.write("/resources/js/jquery.cxselect.min.js\"></script>\r\n");
      out.write("\t<script>\r\n");
      out.write("\t\r\n");
      out.write("\t\t$('#classifyjson').cxSelect({\r\n");
      out.write("\r\n");
      out.write("\t\t\tselects : [ 'one', 'two', 'three' ],\r\n");
      out.write("\t\t\tnodata : 'none'\r\n");
      out.write("\t\t});\r\n");
      out.write("\t</script>\r\n");
      out.write("\t\r\n");
      out.write("\t<script> \r\n");
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
      out.write("\t\t\t\t$(\"#bookTwoclassid\").append(\" <option value='-1' >二级分类</option>\");\r\n");
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
      out.write("\t\t\t\t$(\"#bookThreeclassid\").append(\" <option value='-1' >三级分类</option>\");\r\n");
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
      out.write("\t\t\t\t\t\tnumber:true,\r\n");
      out.write("\t\t\t\t\t\tmin:10                       \r\n");
      out.write("\t\t\t\t\t},staock:{\r\n");
      out.write("\t\t\t\t\t\tdigits:true,\r\n");
      out.write("\t\t\t\t\t\tmin:10                       \r\n");
      out.write("\t\t\t\t\t},\r\n");
      out.write("\t\t\t\t\tbookOneclassid:{\r\n");
      out.write("\t\t\t\t\t\trequired:true,\r\n");
      out.write("\t\t\t\t\t},\r\n");
      out.write("\t\t\t\t\tbookTwoclassid:{\r\n");
      out.write("\t\t\t\t\t\trequired:true,\r\n");
      out.write("\t\t\t\t\t},\r\n");
      out.write("\t\t\t\t\tbookThreeclassid:{\r\n");
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
      out.write("\t\t\t\t\t\tnumber:\"请输入价格\",\r\n");
      out.write("\t\t\t\t\t\tmin:\"价格最少为10元\"                       \r\n");
      out.write("\t\t\t\t\t},staock:{\r\n");
      out.write("\t\t\t\t\t\tdigits:\"请输入整数\",\r\n");
      out.write("\t\t\t\t\t\tmin:\"库存最少为10件\"                     \r\n");
      out.write("\t\t\t\t\t},\r\n");
      out.write("\t\t\t\t\tbookOneclassid:{\r\n");
      out.write("\t\t\t\t\t\trequired:\"请重新选择分类\"\r\n");
      out.write("\t\t\t\t\t},\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\tbookTwoclassid:{\r\n");
      out.write("\t\t\t\t\t\trequired:\"请重新选择分类\"\r\n");
      out.write("\t\t\t\t\t},\r\n");
      out.write("\t\t\t\t\tbookThreeclassid:{\r\n");
      out.write("\t\t\t\t\t\trequired:\"请重新选择分类\"\r\n");
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
}
