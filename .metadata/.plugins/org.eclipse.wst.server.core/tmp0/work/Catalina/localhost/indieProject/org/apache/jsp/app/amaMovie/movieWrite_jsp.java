/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.64
 * Generated at: 2021-04-11 06:54:45 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.app.amaMovie;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class movieWrite_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("/WEB-INF/lib/standard.jar", Long.valueOf(1618043558000L));
    _jspx_dependants.put("jar:file:/Users/heekng/coding/unityTeam/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/indieProject/WEB-INF/lib/standard.jar!/META-INF/c.tld", Long.valueOf(1098678690000L));
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

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fif_0026_005ftest;

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
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.release();
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    final java.lang.String _jspx_method = request.getMethod();
    if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
      return;
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

      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("\n");
      out.write("<head>\n");
      out.write("<title>Untitled</title>\n");
      out.write("<meta charset=\"utf-8\" />\n");
      out.write("<meta name=\"viewport\"\n");
      out.write("\tcontent=\"width=device-width, initial-scale=1, user-scalable=no\" />\n");
      out.write("<link rel=\"stylesheet\"\n");
      out.write("\thref=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/assets/css/main.css\" />\n");
      out.write("<link rel=\"stylesheet\"\n");
      out.write("\thref=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/assets/css/jquery-ui.css\" />\n");
      out.write("\n");
      out.write("</head>\n");
      out.write("<style>\n");
      out.write("\n");
      out.write(".buttonEmpty{\n");
      out.write("\twidth:20%;\n");
      out.write("}\n");
      out.write("@media screen and (max-width: 980px) {\n");
      out.write("\t.buttonEmpty{\n");
      out.write("\t\twidth:40%;\n");
      out.write("\t}\n");
      out.write("}\n");
      out.write("@media screen and (min-width: 736px) {\n");
      out.write("\t/* #step1 .row div:first-child, */\n");
      out.write("\t#step2 .row div:first-child, #step3 .row div:first-child {\n");
      out.write("\t\tborder-right: solid;\n");
      out.write("\t\ttext-align: right;\n");
      out.write("\t\tpadding-right: 1rem;\n");
      out.write("\t}\n");
      out.write("\t#step2 .row div, #step3 .row div {\n");
      out.write("\t\tpadding-bottom: 1rem;\n");
      out.write("\t}\n");
      out.write("\t#step2 .row .col-1 {\n");
      out.write("\t\tpadding-left: 2em;\n");
      out.write("\t}\n");
      out.write("\t#step2 .row .col-3 {\n");
      out.write("\t\tpadding-left: 0;\n");
      out.write("\t}\n");
      out.write("\t#step3 .inputName {\n");
      out.write("\t\tpadding-left: 0;\n");
      out.write("\t}\n");
      out.write("}\n");
      out.write("@media screen and (max-width: 480px) {\n");
      out.write("\t.topH3 {\n");
      out.write("\t\tfont-size: 0.9em !important;\n");
      out.write("\t}\n");
      out.write("}\n");
      out.write("@media screen and (max-width: 736px) {\n");
      out.write("\tsection h3{\n");
      out.write("\t\tmargin-top:1em;\n");
      out.write("\t}\n");
      out.write("\tsection h4{\n");
      out.write("\t\tmargin-top:1em;\n");
      out.write("\t}\n");
      out.write("}\n");
      out.write("\n");
      out.write(".poster {\n");
      out.write("\tborder: dotted;\n");
      out.write("\tmargin: 1rem;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".stillcut {\n");
      out.write("\tborder: dotted;\n");
      out.write("\tmargin: 1rem;\n");
      out.write("}\n");
      out.write("\n");
      out.write("#step1 h4:after {\n");
      out.write("\tbackground-color: #888;\n");
      out.write("\tcontent: '';\n");
      out.write("\tdisplay: inline-block;\n");
      out.write("\theight: 1px;\n");
      out.write("\tmargin: 2em 0 0 0;\n");
      out.write("\tposition: relative;\n");
      out.write("\twidth: 5em;\n");
      out.write("}\n");
      out.write("\n");
      out.write("#posterHelp {\n");
      out.write("\tdisplay: none;\n");
      out.write("\tposition: absolute;\n");
      out.write("\twidth: 200px;\n");
      out.write("\tmargin: 0;\n");
      out.write("\tpadding: 0.5rem;\n");
      out.write("\tbackground: #FFFFFF;\n");
      out.write("\tborder-radius: 5px;\n");
      out.write("\tlist-style: none;\n");
      out.write("\tbox-shadow: 0 15px 35px rgba(50, 50, 90, 0.1), 0 5px 15px\n");
      out.write("\t\trgba(0, 0, 0, 0.07);\n");
      out.write("\tz-index: 999999;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".maker input, .actor input {\n");
      out.write("\tmargin-bottom: 0.5rem;\n");
      out.write("}\n");
      out.write(".col-custom{\n");
      out.write("\twidth:12.5%;\n");
      out.write("}\n");
      out.write("\n");
      out.write("</style>\n");
      out.write("<body class=\"is-preload\">\n");
      out.write("\t");
      if (_jspx_meth_c_005fif_005f0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\t<!-- Header -->\n");
      out.write("\t");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, (java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}/../header.jsp", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null), out, false);
      out.write("\n");
      out.write("\n");
      out.write("\t<!-- Main -->\n");
      out.write("\t<section id=\"main\">\n");
      out.write("\t\t<div class=\"container\">\n");
      out.write("\t\t\t<header class=\"major\">\n");
      out.write("\t\t\t\t<h2>작품 올리기</h2>\n");
      out.write("\t\t\t\t<br>\n");
      out.write("\t\t\t\t<h3 class=\"topH3\">\n");
      out.write("\t\t\t\t\t<a href=\"javascript:step1()\" id=\"s1\" style=\"color: #4fc2cd;\">포스터\n");
      out.write("\t\t\t\t\t\t업로드</a>&ensp;&ensp;>&ensp;&ensp;<a href=\"javascript:step2()\" id=\"s2\">기본\n");
      out.write("\t\t\t\t\t\t정보 제공</a>&ensp;&ensp;>&ensp;&ensp;<a href=\"javascript:step3()\" id=\"s3\">상세\n");
      out.write("\t\t\t\t\t\t정보 제공</a>\n");
      out.write("\t\t\t\t</h3>\n");
      out.write("\t\t\t</header>\n");
      out.write("\n");
      out.write("\t\t\t<!-- Content -->\n");
      out.write("\t\t\t<form name=\"movieWriteForm\" method=\"post\" action=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/amaMovie/MovieWriteOkAction.ama\" enctype=\"multipart/form-data\">\n");
      out.write("\t\t\t\t<section id=\"step1\">\n");
      out.write("\t\t\t\t\t<h3 style=\"display: inline;\">포스터</h3>\n");
      out.write("\t\t\t\t\t<span><img id=\"poster\" style=\"width: 17px; cursor: help;\"\n");
      out.write("\t\t\t\t\t\tsrc=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/images/question.png\"></span>\n");
      out.write("\t\t\t\t\t<div id=\"posterHelp\" style=\"display: none; resize: none;\">첫번째로\n");
      out.write("\t\t\t\t\t\t첨부된 이미지가 대표 이미지로 사용됩니다.</div>\n");
      out.write("\t\t\t\t\t<div class=\"row\" id=\"posterDiv\">\n");
      out.write("\t\t\t\t\t\t<div class=\"col-2 col-3-small poster\" style=\"padding-left: 0;\">\n");
      out.write("\t\t\t\t\t\t\t<img class=\"img posterImgView\" style=\"display:none; width:100%; height:100%;\">\n");
      out.write("\t\t\t\t\t\t\t<span class=\"image fit posterImgSpan\" style=\"padding-bottom: 30%;\">\n");
      out.write("\t\t\t\t\t\t\t\t<label for=\"posterImgMain\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<img class=\"camera\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/images/add.png\" alt=\"영화 포스터\"\n");
      out.write("\t\t\t\t\t\t\t\t\tstyle=\"width: 50px; margin: 47% auto auto auto; cursor: pointer;\" />\n");
      out.write("\t\t\t\t\t\t\t\t</label>\n");
      out.write("\t\t\t\t\t\t\t</span>\n");
      out.write("\t\t\t\t\t\t\t<input id=\"posterImgMain\" name=\"posterImgMain\" type=\"file\" onchange=\"posterAddOk(this)\" style=\"display:none;\">\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\n");
      out.write("\t\t\t\t\t<br>\n");
      out.write("\t\t\t\t\t\n");
      out.write("\t\t\t\t\t<h3>스틸컷</h3>\n");
      out.write("\t\t\t\t\t<div class=\"row\">\n");
      out.write("\t\t\t\t\t\t<div class=\"col-2 col-3-small poster\" style=\"padding-left: 0;\">\n");
      out.write("\t\t\t\t\t\t\t<img class=\"img stillCutImgView\" style=\"display:none; width:100%; height:100%;\">\n");
      out.write("\t\t\t\t\t\t\t<span class=\"image fit stillCutImgSpan\" style=\"padding-bottom: 30%;\">\n");
      out.write("\t\t\t\t\t\t\t\t<label for=\"stillCutImgMain1\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<img class=\"camera\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/images/add.png\" alt=\"영화 스틸컷\"\n");
      out.write("\t\t\t\t\t\t\t\t\tstyle=\"width: 50px; margin: 47% auto auto auto; cursor: pointer;\" />\n");
      out.write("\t\t\t\t\t\t\t\t</label>\n");
      out.write("\t\t\t\t\t\t\t</span>\n");
      out.write("\t\t\t\t\t\t\t<input id=\"stillCutImgMain1\" name=\"stillCutImg\" type=\"file\" onchange=\"stillCutAddOk(this)\" style=\"display:none;\">\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<br>\n");
      out.write("\t\t\t\t\t<div class=\"row\">\n");
      out.write("\t\t\t\t\t\t<div class=\"col-2 col-12-small\"\n");
      out.write("\t\t\t\t\t\t\tstyle=\"text-align: right; margin:0 auto; padding:0 0;\">\n");
      out.write("\t\t\t\t\t\t\t\t<a style=\"width:100%;\" href=\"#\" class=\"button small moveBtn\" onclick=\"step2()\">다음</a>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</section>\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t\t<section id=\"step2\" style=\"display: none;\">\n");
      out.write("\t\t\t\t\t<div class=\"row\">\n");
      out.write("\t\t\t\t\t\t<div class=\"col-custom col-2-medium col-12-small\" style=\"margin-left: auto;\">\n");
      out.write("\t\t\t\t\t\t\t<h4>영화 제목</h4>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t<div class=\"col-1 col-12-small\">\n");
      out.write("\t\t\t\t\t\t\t<h5>한글</h5>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t<div class=\"col-4 col-6-medium col-12-small\" style=\"margin-right:auto;\">\n");
      out.write("\t\t\t\t\t\t\t<input type=\"text\" name=\"amaTitleKor\" id=\"amaTitleKor\" value=\"\" />\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div class=\"row\">\n");
      out.write("\t\t\t\t\t\t<div class=\"col-custom col-2-medium col-12-small\" style=\"margin-left: auto;\">\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t<div class=\"col-1 col-12-small\">\n");
      out.write("\t\t\t\t\t\t\t<h5>영문</h5>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t<div class=\"col-4 col-6-medium col-12-small\" style=\"margin-right:auto;\">\n");
      out.write("\t\t\t\t\t\t\t<input type=\"text\" name=\"amaTitleEng\" id=\"amaTitleEng\" value=\"\" />\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("<!-- \t\t\t\t\t<hr class=\"mobileHr\" style=\"margin: 0.5em 0 0.5em 0;\"> -->\n");
      out.write("\n");
      out.write("\t\t\t\t\t<div class=\"row\">\n");
      out.write("\t\t\t\t\t\t<div class=\"col-custom col-2-medium col-12-small\" style=\"margin-left: auto;\">\n");
      out.write("\t\t\t\t\t\t\t<h4>제작년도</h4>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t<div class=\"col-5 col-7-medium col-12-small\" style=\"display: inherit; margin-right:auto;\">\n");
      out.write("\t\t\t\t\t\t\t<input type=\"text\" name=\"amaMakeDate\" id=\"datepicker\" value=\"\" readonly />\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t\t\t<div class=\"row\">\n");
      out.write("\t\t\t\t\t\t<div class=\"col-custom col-2-medium col-12-small\" style=\"margin-left: auto;\">\n");
      out.write("\t\t\t\t\t\t\t<h4>영상 길이</h4>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t<div class=\"col-5 col-7-medium col-12-small\" style=\"display: inherit; margin-right:auto;\">\n");
      out.write("\t\t\t\t\t\t\t<input type=\"text\" name=\"amaMovieLength\" id=\"amaMovieLength\" value=\"\"\n");
      out.write("\t\t\t\t\t\t\t\tplaceholder=\"예) 18:21 (분:초)\" />\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t\t\t<div class=\"row\">\n");
      out.write("\t\t\t\t\t\t<div class=\"col-custom col-2-medium col-12-small\" style=\"margin-left: auto;\">\n");
      out.write("\t\t\t\t\t\t\t<h4>감독</h4>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t<div class=\"col-5 col-7-medium col-12-small\" style=\"display: inherit; margin-right:auto;\">\n");
      out.write("\t\t\t\t\t\t\t<input type=\"text\" name=\"amaDirector\" id=\"amaDirector\" value=\"\" />\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t\t\t<div class=\"row\">\n");
      out.write("\t\t\t\t\t\t<div class=\"col-custom col-2-medium col-12-small\" style=\"margin-left: auto;\">\n");
      out.write("\t\t\t\t\t\t\t<h4>장르</h4>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t<div class=\"col-5 col-7-medium col-12-small\" style=\"margin-right:auto;\">\n");
      out.write("\t\t\t\t\t\t\t<select name=\"genre\" id=\"genre\">\n");
      out.write("\t\t\t\t\t\t\t\t<option value=\"\">- 영화 장르 선택 -</option>\n");
      out.write("\t\t\t\t\t\t\t\t<option value=\"1\">드라마</option>\n");
      out.write("\t\t\t\t\t\t\t\t<option value=\"1\">공포 / 스릴러</option>\n");
      out.write("\t\t\t\t\t\t\t\t<option value=\"1\">판타지</option>\n");
      out.write("\t\t\t\t\t\t\t\t<option value=\"1\">코미디</option>\n");
      out.write("\t\t\t\t\t\t\t\t<option value=\"1\">애니메이션</option>\n");
      out.write("\t\t\t\t\t\t\t\t<option value=\"1\">기타</option>\n");
      out.write("\t\t\t\t\t\t\t</select>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div class=\"row\">\n");
      out.write("\t\t\t\t\t\t<div class=\"col-custom col-2-medium col-12-small\" style=\"margin-left: auto;\">\n");
      out.write("\t\t\t\t\t\t\t<h4>영상물 등급</h4>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t<div class=\"col-5 col-7-medium col-12-small\" style=\"margin-right:auto;\">\n");
      out.write("\t\t\t\t\t\t\t<select name=\"rating\" id=\"rating\">\n");
      out.write("\t\t\t\t\t\t\t\t<option value=\"\">- 미분류 -</option>\n");
      out.write("\t\t\t\t\t\t\t\t<option value=\"1\">전체관람가</option>\n");
      out.write("\t\t\t\t\t\t\t\t<option value=\"1\">12세이상관람가</option>\n");
      out.write("\t\t\t\t\t\t\t\t<option value=\"1\">15세이상관람가</option>\n");
      out.write("\t\t\t\t\t\t\t\t<option value=\"1\">청소년관람불가</option>\n");
      out.write("\t\t\t\t\t\t\t</select>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div class=\"row\">\n");
      out.write("\t\t\t\t\t\t<div class=\"col-custom col-2-medium col-12-small\" style=\"margin-left: auto;\">\n");
      out.write("\t\t\t\t\t\t\t<h4>작품 링크</h4>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t<div class=\"col-5 col-7-medium col-12-small\" style=\"margin-right:auto;\">\n");
      out.write("\t\t\t\t\t\t\t<input type=\"text\" name=\"link\" id=\"link\" value=\"\"\n");
      out.write("\t\t\t\t\t\t\t\tplaceholder=\"예) https://youtu.be/86BST8NIpNM\" />\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div class=\"row\">\n");
      out.write("\t\t\t\t\t\t<div class=\"col-custom col-2-medium col-12-small\" style=\"margin-left: auto;\">\n");
      out.write("\t\t\t\t\t\t\t<h4>팝콘 후원</h4>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t<div class=\"col-2 col-3-medium col-6-small\">\n");
      out.write("\t\t\t\t\t\t\t<input type=\"radio\" id=\"priority-low\" name=\"popcorn\" value=\"1\" checked>\n");
      out.write("\t\t\t\t\t\t\t<label for=\"priority-low\">팝콘 받기</label>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t<div class=\"col-3 col-4-medium col-6-small\" style=\"margin-right:auto;\">\n");
      out.write("\t\t\t\t\t\t\t<input type=\"radio\" id=\"priority-normal\" value=\"0\" name=\"popcorn\">\n");
      out.write("\t\t\t\t\t\t\t<label for=\"priority-normal\">팝콘 받지 않기</label>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<br>\n");
      out.write("\t\t\t\t\t<div class=\"row\">\n");
      out.write("\t\t\t\t\t\t<div class=\"col-2 col-12-small\"\n");
      out.write("\t\t\t\t\t\t\tstyle=\"margin-left: auto; border: none; padding:0 0;\">\n");
      out.write("\t\t\t\t\t\t\t\t<a style=\"width:100%;\" href=\"#\" class=\"button small moveBtn\" onclick=\"step1()\">이전</a>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t<div class=\"buttonEmpty\"></div>\n");
      out.write("\t\t\t\t\t\t<div class=\"col-2 col-12-small\"\n");
      out.write("\t\t\t\t\t\t\tstyle=\"text-align: right; margin-right: auto; padding:0 0;\">\n");
      out.write("\t\t\t\t\t\t\t\t<a style=\"width:100%;\" href=\"#\" class=\"button small moveBtn\" onclick=\"step3()\">다음</a>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</section>\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t\t<section id=\"step3\" style=\"display: none;\">\n");
      out.write("\t\t\t\t\t<div class=\"row\">\n");
      out.write("\t\t\t\t\t\t<div class=\"col-custom col-2-medium col-12-small\" style=\"margin-left: auto;\">\n");
      out.write("\t\t\t\t\t\t\t<h4>시놉시스</h4>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t<div class=\"col-5 col-7-medium col-12-small\" style=\"margin-right: auto;\">\n");
      out.write("\t\t\t\t\t\t\t<textarea name=\"synopsis\" id=\"synopsis\" rows=\"3\" cols=\"\" style=\"resize: none;\"></textarea>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t\t\t<div class=\"row\">\n");
      out.write("\t\t\t\t\t\t<div class=\"col-custom col-2-medium col-12-small\" style=\"margin-left: auto;\">\n");
      out.write("\t\t\t\t\t\t\t<h4>연출 의도</h4>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t<div class=\"col-5 col-7-medium col-12-small\" style=\"margin-right: auto;\">\n");
      out.write("\t\t\t\t\t\t\t<textarea name=\"theme\" id=\"theme\" rows=\"3\" cols=\"\" style=\"resize: none;\"></textarea>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t\t\t<div class=\"row maker\">\n");
      out.write("\t\t\t\t\t\t<div class=\"col-custom col-2-medium col-12-small\" style=\"margin-left: auto; padding-bottom:0;\">\n");
      out.write("\t\t\t\t\t\t\t<h4>제작진</h4>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t<div class=\"col-2 col-3-medium col-5-small duty\" style=\"padding-bottom:0;\">\n");
      out.write("\t\t\t\t\t\t\t<h5>직책</h5>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t<div class=\"col-2 col-3-medium col-5-small makerName\" style=\"padding-bottom:0;\">\n");
      out.write("\t\t\t\t\t\t\t<h5>이름</h5>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t<div class=\"col-1\" style=\"margin-right: auto;\"></div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div>\n");
      out.write("\t\t\t\t\t\t<div class=\"row maker\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"col-custom col-2-medium col-12-small\" style=\"margin-left: auto;\">\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t<div style=\"padding-bottom:0;\" class=\"col-2 col-3-medium col-5-small duty\">\n");
      out.write("\t\t\t\t\t\t\t\t<input type=\"text\" name=\"makerPosition\" value=\"\" />\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t<div style=\"padding-bottom:0;\" class=\"col-2 col-3-medium col-5-small makerName\">\n");
      out.write("\t\t\t\t\t\t\t\t<input type=\"text\" name=\"makerName\" value=\"\" />\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t<div class=\"col-1 col-2-small\" style=\"margin-right: auto; padding:0;\">\n");
      out.write("\t\t\t\t\t\t\t\t<a class=\"button alt small\" id=\"addMaker\" style=\"width:100%\">추가</a>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t\t\t<div class=\"row actor\">\n");
      out.write("\t\t\t\t\t\t<div class=\"col-custom col-2-medium col-12-small\" style=\"margin-left: auto; padding-bottom:0;\">\n");
      out.write("\t\t\t\t\t\t\t<h4>출연진</h4>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t<div class=\"col-2 col-3-medium col-5-small duty\" style=\"padding-bottom:0;\">\n");
      out.write("\t\t\t\t\t\t\t<h5>배역</h5>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t<div class=\"col-2 col-3-medium col-5-small makerName\" style=\"padding-bottom:0;\">\n");
      out.write("\t\t\t\t\t\t\t<h5>배우</h5>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t<div class=\"col-1\" style=\"margin-right: auto;\"></div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div>\n");
      out.write("\t\t\t\t\t\t<div class=\"row maker\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"col-custom col-2-medium col-12-small\" style=\"margin-left: auto;\">\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t<div style=\"padding-bottom:0;\" class=\"col-2 col-3-medium col-5-small cast\">\n");
      out.write("\t\t\t\t\t\t\t\t<input type=\"text\" name=\"actorCast\" value=\"\" />\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t<div style=\"padding-bottom:0;\" class=\"col-2 col-3-medium col-5-small actorName\">\n");
      out.write("\t\t\t\t\t\t\t\t<input type=\"text\" name=\"actorName\" value=\"\" />\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t<div class=\"col-1 col-2-small\" style=\"margin-right: auto; padding:0;\">\n");
      out.write("\t\t\t\t\t\t\t\t<a class=\"button alt small\" id=\"addActor\" style=\"width:100%\">추가</a>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<br>\n");
      out.write("\t\t\t\t\t<div class=\"row\">\n");
      out.write("\t\t\t\t\t\t<div class=\"col-2 col-12-small\"\n");
      out.write("\t\t\t\t\t\t\tstyle=\"margin-left: auto; border: none; padding:0 0;\">\n");
      out.write("\t\t\t\t\t\t\t\t<a  style=\"width:100%;\" href=\"#\" class=\"button small moveBtn\" onclick=\"step2()\">이전</a>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t<div style=\"width:20%;\"></div>\n");
      out.write("\t\t\t\t\t\t<div class=\"col-2 col-12-small\"\n");
      out.write("\t\t\t\t\t\t\tstyle=\"text-align: right; margin-right: auto; padding:0 0;\">\n");
      out.write("\t\t\t\t\t\t\t\t<a style=\"width:100%;\" onclick=\"writeFormSubmit()\" class=\"button small moveBtn\">완료</a>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</section>\n");
      out.write("\n");
      out.write("\n");
      out.write("\t\t\t</form>\n");
      out.write("\n");
      out.write("\t\t</div>\n");
      out.write("\t</section>\n");
      out.write("\t<!-- Footer -->\n");
      out.write("\t");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, (java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}/../footer.jsp", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null), out, false);
      out.write("\n");
      out.write("\n");
      out.write("\t<!-- Scripts -->\n");
      out.write("\t<script>var contextPath = \"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\" </script>\n");
      out.write("\t<script\n");
      out.write("\t\tsrc=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/assets/js/jquery.min.js\"></script>\n");
      out.write("\t<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/assets/js/jquery-ui.js\"></script>\n");
      out.write("\t<script\n");
      out.write("\t\tsrc=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/assets/js/jquery.dropotron.min.js\"></script>\n");
      out.write("\t<script\n");
      out.write("\t\tsrc=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/assets/js/jquery.poptrox.min.js\"></script>\n");
      out.write("\t<script\n");
      out.write("\t\tsrc=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/assets/js/browser.min.js\"></script>\n");
      out.write("\t<script\n");
      out.write("\t\tsrc=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/assets/js/breakpoints.min.js\"></script>\n");
      out.write("\t<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/assets/js/util.js\"></script>\n");
      out.write("\t<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/assets/js/main.js\"></script>\n");
      out.write("\t<script\n");
      out.write("\t\tsrc=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/assets/js/movieWrite.js\"></script>\n");
      out.write("</body>\n");
      out.write("</html>");
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
    boolean _jspx_th_c_005fif_005f0_reused = false;
    try {
      _jspx_th_c_005fif_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005fif_005f0.setParent(null);
      // /app/amaMovie/movieWrite.jsp(105,1) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fif_005f0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${session_id eq null}", boolean.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null)).booleanValue());
      int _jspx_eval_c_005fif_005f0 = _jspx_th_c_005fif_005f0.doStartTag();
      if (_jspx_eval_c_005fif_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("\t\t<script>\n");
          out.write("\t\t   alert(\"로그인 후 이용해주세요\");\n");
          out.write("\t\t   location.replace(\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
          out.write("/member/Login.me\");\n");
          out.write("\t\t</script>\n");
          out.write("\t");
          int evalDoAfterBody = _jspx_th_c_005fif_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fif_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f0);
      _jspx_th_c_005fif_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fif_005f0, _jsp_getInstanceManager(), _jspx_th_c_005fif_005f0_reused);
    }
    return false;
  }
}