/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.54
 * Generated at: 2022-10-13 06:11:21 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("/footer.jsp", Long.valueOf(1665474817183L));
    _jspx_dependants.put("/header.jsp", Long.valueOf(1665479809088L));
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
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP?????? ?????? GET, POST ?????? HEAD ??????????????? ???????????????. Jasper??? OPTIONS ????????? ?????? ???????????????.");
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
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"css/main.css\">\r\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width,initial-scale=1, user-scalable=no\">\r\n");
      out.write("<script type=\"text/javascript\" src=\"https://code.jquery.com/jquery-latest.min.js\"></script>\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"https://cdn.jsdelivr.net/npm/slick-carousel@1.8.1/slick/slick.css\"/>\r\n");
      out.write("<script type=\"text/javascript\" src=\"https://cdn.jsdelivr.net/npm/slick-carousel@1.8.1/slick/slick.min.js\"></script>\r\n");
      out.write("<title>BUY IN HOTEL</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("<header>\r\n");
      out.write("<div class='header'>\r\n");
      out.write("	<img style='margin-left: 0px;' src='image/icon/Logo.png'>\r\n");
      out.write("	<ul class='headerUrl'>\r\n");
      out.write("		<li><a href='#ARA'>ARA ></a></li>\r\n");
      out.write("		<li><a href='#BuyInHotel'>BUY IN HOTEL ></a></li>\r\n");
      out.write("	</ul>\r\n");
      out.write("</div>\r\n");
      out.write("</header>\r\n");
      out.write("\r\n");
      out.write("<div class='mainSection' id='scroll'>\r\n");
      out.write("	<img class='mainImg mediaImg' src='image/appImg/main.png'>\r\n");
      out.write("	<div class='mainTxt'>\r\n");
      out.write("		<img class='mainImg mediaImg' src='image/icon/mainTxt.png'>\r\n");
      out.write("		<div class='linkBtn'>\r\n");
      out.write("			<button type='button' onclick='araOpen()'>ARA <img src='image/icon/linkArr.png'></button>\r\n");
      out.write("			<button type='button' onclick='buyinOpen()'>BUY IN HOTEL <img src='image/icon/linkArr.png'></button>\r\n");
      out.write("		</div>\r\n");
      out.write("	</div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<div class='araBox'>\r\n");
      out.write("	<a name='ARA'></a>\r\n");
      out.write("	<div class='araDescription'>\r\n");
      out.write("		<img class='mediaImg' src='image/appImg/araApp.png'>\r\n");
      out.write("		<div class='araTxt'>\r\n");
      out.write("			<img src='image/icon/araIcon.png'>\r\n");
      out.write("			<h4 class='araTitle'>?????? ?????? ?????? ?????????</h4>\r\n");
      out.write("			<p class='araExplain'>??????(ARA)??? ????????? ????????? ???????????? ???????????? ?????? ????????? ??????????????? ?????? ?????? ?????? ??????????????????.\r\n");
      out.write("			??????????????? ????????? ?????? ??????????????? ???????????? ?????? ????????? ???????????? ????????? ?????? ??? ?????? ????????? ?????????\r\n");
      out.write("			????????? ??? ??????, ?????? ??? ????????? ???????????? ????????? ???????????? ?????? ????????? ??? ??? ????????????.</p>\r\n");
      out.write("		</div>\r\n");
      out.write("	</div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<div class='araContents'>\r\n");
      out.write("	<h4 class='title'>ARA ?????? ?????????</h4>\r\n");
      out.write("	<div class='araSlide'>\r\n");
      out.write("		<div class=\"slider-wrap\">\r\n");
      out.write("		    <div class=\"cont\" data-dot-title=\"????????????\">\r\n");
      out.write("		    	<img class='bannerImg' src='image/card/purchase.png'>\r\n");
      out.write("		    </div>\r\n");
      out.write("		    <div class=\"cont\" data-dot-title=\"?????? ?????? ??????\">\r\n");
      out.write("		    	<img class='bannerImg' src='image/card/store.png'>\r\n");
      out.write("		    </div>\r\n");
      out.write("		    <div class=\"cont\" data-dot-title=\"???????????????\">\r\n");
      out.write("		    	<img class='bannerImg' src='image/card/buyinhotel.png'>\r\n");
      out.write("		    </div>\r\n");
      out.write("		    <div class=\"cont\" data-dot-title=\"????????????\">\r\n");
      out.write("		    	<img class='bannerImg' src='image/card/gift.png'>\r\n");
      out.write("		    </div>\r\n");
      out.write("		    <div class=\"cont\" data-dot-title=\"???????????????\">\r\n");
      out.write("		    	<img class='bannerImg' src='image/card/araGiftcard.png'>\r\n");
      out.write("		    </div>\r\n");
      out.write("		</div>\r\n");
      out.write("	</div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<div class='araVision'>\r\n");
      out.write("	<div class='araArea'>\r\n");
      out.write("		<h4 class='title'>ARA VISION</h4>\r\n");
      out.write("		<p class='description'>ARA????????? ??????????????? ?????? ??? ?????? ?????? ????????? ???????????? ???????????? ?????? ???????????? ????????? ???????????? ???????????? ???????????? ????????? ???????????????.</p>\r\n");
      out.write("		<div class='araVisionList'>\r\n");
      out.write("			<div class='araVisionBox'>\r\n");
      out.write("				<img src='image/icon/visit.png'>\r\n");
      out.write("				<h4 class='visionTitle'>?????? ?????? ??????</h4>\r\n");
      out.write("				<p class='visionTxt'>????????? ????????? ??????????????? ??????????????? ????????? ???????????? ????????? ?????????????????? ?????? ????????? ??????</p>\r\n");
      out.write("			</div>\r\n");
      out.write("			<div class='araVisionBox'>\r\n");
      out.write("				<img src='image/icon/trust.png'>\r\n");
      out.write("				<h4 class='visionTitle'>?????? ????????? ??????</h4>\r\n");
      out.write("				<p class='visionTxt'>?????? ????????? DP ???????????? ?????? ???????????? ?????? ?????? ?????? ???????????? ?????? ???????????? ?????? ?????? ??????</p>\r\n");
      out.write("			</div>\r\n");
      out.write("			<div class='araVisionBox'>\r\n");
      out.write("				<img src='image/icon/profit.png'>\r\n");
      out.write("				<h4 class='visionTitle'>?????? ?????? ??????</h4>\r\n");
      out.write("				<p class='visionTxt'>?????? ?????? ?????? ??? ??????????????? ?????? ?????? 10% ?????? ???????????? ???????????? ?????? ?????? ??????</p>\r\n");
      out.write("			</div>\r\n");
      out.write("		</div>\r\n");
      out.write("	</div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<div class='buyinBox'>\r\n");
      out.write("	<a name='BuyInHotel'></a>\r\n");
      out.write("	<div class='buyinDescription'>\r\n");
      out.write("		<img class='mediaImg' src='image/appImg/buyinApp.png'>\r\n");
      out.write("		<div>\r\n");
      out.write("			<img class='mediaImg' src='image/icon/buyinLogo.png'>\r\n");
      out.write("			<h4 class='araTitle'>?????? ?????? ?????? ?????????</h4>\r\n");
      out.write("			<p class='araExplain'>???????????????(BUY IN HOTEL)??? ??????????????? ????????? ???????????? ?????? ???????????? ???????????? ??????????????? ?????? ??????\r\n");
      out.write("			??????????????? ?????????. ?????????????????? ?????? ????????? ?????? ???????????? ???????????? ?????????????????? ???????????? ????????? ??????\r\n");
      out.write("			???????????? ??? ?????? ????????? ???????????? ?????????????????????, ?????? ?????? ?????? ???????????? ???????????? ???????????? ?????? ?????? ?????? ?????? ???\r\n");
      out.write("			??? ?????? ?????? ????????? ?????? ????????? ????????? ??? ????????? ?????????.</p>\r\n");
      out.write("		</div>\r\n");
      out.write("	</div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<div class='buyinContent'>\r\n");
      out.write("	<h4 class='title'>BUY IN HOTEL ?????? ?????????</h4>\r\n");
      out.write("	<div class='buyinSlide'>\r\n");
      out.write("		<div class=\"slider-buyin\">\r\n");
      out.write("		    <div class=\"cont\" data-dot-title=\"????????????\">\r\n");
      out.write("		    	<img class='bannerImg' src='image/card/reservation.png'>\r\n");
      out.write("		    </div>\r\n");
      out.write("		    <div class=\"cont\" data-dot-title=\"???????????? ??????\">\r\n");
      out.write("		    	<img class='bannerImg' src='image/card/amenity.png'>\r\n");
      out.write("		    </div>\r\n");
      out.write("		    <div class=\"cont\" data-dot-title=\"?????????\">\r\n");
      out.write("		    	<img class='bannerImg' src='image/card/buyRoom.png'>\r\n");
      out.write("		    </div>\r\n");
      out.write("		    <div class=\"cont\" data-dot-title=\"????????????\">\r\n");
      out.write("		    	<img class='bannerImg' src='image/card/product.png'>\r\n");
      out.write("		    </div>\r\n");
      out.write("		    <div class=\"cont\" data-dot-title=\"???????????????\">\r\n");
      out.write("		    	<img class='bannerImg' src='image/card/giftcard.png'>\r\n");
      out.write("		    </div>\r\n");
      out.write("		</div>\r\n");
      out.write("	</div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<div class='discountBox'>\r\n");
      out.write("	<div class='discountArea'>\r\n");
      out.write("		<img class='mediaImg' src='image/appImg/coupon.png'>\r\n");
      out.write("		<div>\r\n");
      out.write("			<h4 class='title'>?????? ?????? ????????? ???????????? ??????</h4>\r\n");
      out.write("			<p class='description'>?????? ??? 3???????????? ?????? 30?????? ?????? ??????.<br>\r\n");
      out.write("				??????, ?????? ??? ????????? ?????? ???????????? ????????? ?????? ????????? ??? ?????? ???????????????\r\n");
      out.write("				????????????. ????????? ????????? ???????????? ???????????? ?????? ???????????? ???????????????.\r\n");
      out.write("			</p>\r\n");
      out.write("		</div>\r\n");
      out.write("	</div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<div class='buyinvision'>\r\n");
      out.write("	<div class='visionArea'>\r\n");
      out.write("		<div class='visionBox'>\r\n");
      out.write("			<h4 class='title'>BUY IN HOTEL VISION</h4>\r\n");
      out.write("			<p class='description'>???????????????????????? ???????????? ???????????? ????????? 0%??? ??????????????? ????????? ????????? ????????????\r\n");
      out.write("			?????? ?????? ??????????????? ???????????? ??? ???????????? ???????????? ???????????????.</p>\r\n");
      out.write("			<div class='buyinList'>\r\n");
      out.write("				<div class='buyinVisionBox'>\r\n");
      out.write("					<h4>01</h4>\r\n");
      out.write("					<p>????????? ZERO</p>\r\n");
      out.write("				</div>\r\n");
      out.write("				<div class='buyinVisionBox'>\r\n");
      out.write("					<h4>02</h4>\r\n");
      out.write("					<p>?????? ?????? ?????????</p>\r\n");
      out.write("				</div>\r\n");
      out.write("				<div class='buyinVisionBox'>\r\n");
      out.write("					<h4>03</h4>\r\n");
      out.write("					<p>?????? ????????? ?????? ?????? ??????</p>\r\n");
      out.write("				</div>\r\n");
      out.write("				<div class='buyinVisionBox'>\r\n");
      out.write("					<h4>04</h4>\r\n");
      out.write("					<p>????????? ??????</p>\r\n");
      out.write("				</div>\r\n");
      out.write("				<div class='buyinVisionBox'>\r\n");
      out.write("					<h4>05</h4>\r\n");
      out.write("					<p>???????????? ?????? ??????</p>\r\n");
      out.write("				</div>\r\n");
      out.write("				<div class=buyinVisionBox>\r\n");
      out.write("					<h4>06</h4>\r\n");
      out.write("					<p>????????? ????????? ??????</p>\r\n");
      out.write("				</div>\r\n");
      out.write("			</div>\r\n");
      out.write("		</div>\r\n");
      out.write("		<img class='mediaImg' src='image/appImg/fee.png'>\r\n");
      out.write("	</div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<div class='partnerShip'>\r\n");
      out.write("	<h4 class='title'>??????????????? ????????????</h4>\r\n");
      out.write("	<p>?????????????????? ????????? ????????? ????????? ?????? ????????? ???????????????.</p>\r\n");
      out.write("	<div class='sequence'>\r\n");
      out.write("		<div class='sequenceBox'>\r\n");
      out.write("			<div class='numbering'>\r\n");
      out.write("				<img src='image/icon/sequence.png'>\r\n");
      out.write("				<p>1</p>			\r\n");
      out.write("			</div>\r\n");
      out.write("			<div class='sequenceTxt'>\r\n");
      out.write("				<img src='image/icon/partnership1.png'>\r\n");
      out.write("				<h4>????????????</h4>\r\n");
      out.write("				<p>????????? ???????????????.</p>\r\n");
      out.write("			</div>\r\n");
      out.write("		</div>\r\n");
      out.write("		<div class='sequenceBox'>\r\n");
      out.write("			<div class='numbering'>\r\n");
      out.write("				<img src='image/icon/sequence.png'>\r\n");
      out.write("				<p>2</p>			\r\n");
      out.write("			</div>\r\n");
      out.write("			<div class='sequenceTxt'>\r\n");
      out.write("				<img src='image/icon/partnership2.png'>\r\n");
      out.write("				<h4>????????? ??????</h4>\r\n");
      out.write("				<p>????????? ?????? ??? ????????? ???????????????.</p>\r\n");
      out.write("			</div>\r\n");
      out.write("		</div>\r\n");
      out.write("		<div class='sequenceBox'>\r\n");
      out.write("			<div class='numbering'>\r\n");
      out.write("				<img src='image/icon/sequence.png'>\r\n");
      out.write("				<p>3</p>			\r\n");
      out.write("			</div>\r\n");
      out.write("			<div class='sequenceTxt'>\r\n");
      out.write("				<img src='image/icon/partnership3.png'>\r\n");
      out.write("				<h4>????????????</h4>\r\n");
      out.write("				<p>????????? ???????????? ????????? ???????????????.</p>\r\n");
      out.write("			</div>\r\n");
      out.write("		</div>\r\n");
      out.write("		<div class='sequenceBox'>\r\n");
      out.write("			<div class='numbering'>\r\n");
      out.write("				<img src='image/icon/sequence.png'>\r\n");
      out.write("				<p>4</p>			\r\n");
      out.write("			</div>\r\n");
      out.write("			<div class='sequenceTxt'>\r\n");
      out.write("				<img src='image/icon/partnership4.png'>\r\n");
      out.write("				<h4>????????????</h4>\r\n");
      out.write("				<p>?????? ?????? ??? ????????? ???????????????.</p>\r\n");
      out.write("			</div>\r\n");
      out.write("		</div>\r\n");
      out.write("	</div>\r\n");
      out.write("	<p class='document'>????????????: ??????????????????, ????????????, ???????????????</p>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<div class='promise'>\r\n");
      out.write("	<div class='promiseArea'>\r\n");
      out.write("		<p class='promiseTxt'>????????? ?????????????????? ?????? ???????????? ???????????? ???????????? ???????????? ?????? ?????? ????????? ????????????\r\n");
      out.write("		 ???????????? ?????? ????????? ????????????????????? ?????? ?????? ???????????? ????????? ?????? ??????????????????.</p>\r\n");
      out.write("		 <button type='button' class='tel'>????????????: 1533-3152</button>\r\n");
      out.write("	</div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<footer>\r\n");
      out.write("	<div class='companyInfo'>\r\n");
      out.write("		<p>?????????: ?????????????????? | ?????????????????????: 627-81-02234</p>\r\n");
      out.write("		<p>?????? : ??????????????? ????????? ?????????85??? 58, 11??? 1109???(?????????, ??????????????? ????????????)</p>\r\n");
      out.write("		<p>???????????? : ????????? | ???????????? : 1533-3152 | FAX : 062-225-5100</p>\r\n");
      out.write("		<p>Copyright ??? 2021 BUY ON HOTEL All rights reserved.</p>\r\n");
      out.write("	</div>\r\n");
      out.write("</footer>");
      out.write("\r\n");
      out.write("<script>\r\n");
      out.write("	function araOpen(){\r\n");
      out.write("		window.open(\"http://www.aldainc.co.kr/\",\"_blank\");\r\n");
      out.write("	}\r\n");
      out.write("	function buyinOpen(){\r\n");
      out.write("		window.open(\"https://www.buyinhotel.co.kr/\",\"_blank\");\r\n");
      out.write("	}\r\n");
      out.write("</script>\r\n");
      out.write("<script>\r\n");
      out.write("	var header = $('.header').offset().top;\r\n");
      out.write("	$(window).scroll(function(){\r\n");
      out.write("		var window = $(this).scrollTop();\r\n");
      out.write("		if (header <= window){\r\n");
      out.write("			$('.header').addClass(\"fixed\");\r\n");
      out.write("			\r\n");
      out.write("		} else{\r\n");
      out.write("			$('.header').removeClass(\"fixed\");\r\n");
      out.write("			$('.header').css('box-shadow','none');\r\n");
      out.write("		}\r\n");
      out.write("	})\r\n");
      out.write("</script>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("	$(function(){\r\n");
      out.write("	    $('.slider-wrap').slick({\r\n");
      out.write("	      slide: 'div',        //???????????? ????????? ??? ??????\r\n");
      out.write("	      infinite : true,     //?????? ?????? ??????     \r\n");
      out.write("	      slidesToShow : 1,        // ??? ????????? ????????? ????????? ??????\r\n");
      out.write("	      slidesToScroll : 1,        //????????? ????????? ????????? ????????? ??????\r\n");
      out.write("	      speed : 500,     // ?????? ?????? ????????? ?????? ?????? ??????????????? ????????? ??????(ms)\r\n");
      out.write("	      arrows : true,         // ????????? ???????????? ????????? ?????? ??????\r\n");
      out.write("	      dots : true,  \r\n");
      out.write("	      // ???????????? ?????? ????????? ?????????????????? ??????\r\n");
      out.write("	      customPaging : function(slider, i) {\r\n");
      out.write("	    	  	//console.log($(slider.$slides[i]).attr('data-dot-title'));\r\n");
      out.write("		        return '<button type=\"button\">' + $(slider.$slides[i]).attr('data-dot-title') + '</button>';\r\n");
      out.write("		    },\r\n");
      out.write("	      autoplay : false,            // ?????? ????????? ?????? ??????\r\n");
      out.write("	      autoplaySpeed : 2000,         // ?????? ????????? ??? ???????????? ??????????????? ????????? ?????? (ms)\r\n");
      out.write("	      pauseOnHover : true,        // ???????????? ??????    ??? ????????? ???????????? ???????????? ????????? ??????\r\n");
      out.write("	      vertical : false,        // ?????? ?????? ???????????? ??????\r\n");
      out.write("	      prevArrow : \"<button type='button' class='slick-prev'><img src='image/icon/left.png'></button>\",\r\n");
      out.write("	      nextArrow : \"<button type='button' class='slick-next'><img src='image/icon/right.png'></button>\",\r\n");
      out.write("	      draggable : true,     //????????? ?????? ?????? \r\n");
      out.write("	      responsive: [ // ????????? ??? ?????? ??????\r\n");
      out.write("	        {  \r\n");
      out.write("	          breakpoint: 960, //?????? ????????? 960px\r\n");
      out.write("	          settings: {\r\n");
      out.write("	            slidesToShow: 1\r\n");
      out.write("	          } \r\n");
      out.write("	        },\r\n");
      out.write("	        { \r\n");
      out.write("	          breakpoint: 768, //?????? ????????? 768px\r\n");
      out.write("	          settings: {    \r\n");
      out.write("	            slidesToShow: 1\r\n");
      out.write("	          } \r\n");
      out.write("	        }\r\n");
      out.write("	      ]\r\n");
      out.write("	\r\n");
      out.write("	    });\r\n");
      out.write("	    \r\n");
      out.write("	    \r\n");
      out.write("	    \r\n");
      out.write("	    $('.slider-buyin').slick({\r\n");
      out.write("		      slide: 'div',        //???????????? ????????? ??? ??????\r\n");
      out.write("		      infinite : true,     //?????? ?????? ??????     \r\n");
      out.write("		      slidesToShow : 1,        // ??? ????????? ????????? ????????? ??????\r\n");
      out.write("		      slidesToScroll : 1,        //????????? ????????? ????????? ????????? ??????\r\n");
      out.write("		      speed : 500,     // ?????? ?????? ????????? ?????? ?????? ??????????????? ????????? ??????(ms)\r\n");
      out.write("		      arrows : true,         // ????????? ???????????? ????????? ?????? ??????\r\n");
      out.write("		      dots : true,  \r\n");
      out.write("		      // ???????????? ?????? ????????? ?????????????????? ??????\r\n");
      out.write("		      customPaging : function(slider, i) {\r\n");
      out.write("		    	  	//console.log($(slider.$slides[i]).attr('data-dot-title'));\r\n");
      out.write("			        return '<button type=\"button\">' + $(slider.$slides[i]).attr('data-dot-title') + '</button>';\r\n");
      out.write("			    },\r\n");
      out.write("		      autoplay : false,            // ?????? ????????? ?????? ??????\r\n");
      out.write("		      //autoplaySpeed : 2000,         // ?????? ????????? ??? ???????????? ??????????????? ????????? ?????? (ms)\r\n");
      out.write("		      pauseOnHover : true,        // ???????????? ??????    ??? ????????? ???????????? ???????????? ????????? ??????\r\n");
      out.write("		      vertical : false,        // ?????? ?????? ???????????? ??????\r\n");
      out.write("		      prevArrow : \"<button type='button' class='slick-prev'><img src='image/icon/left.png'></button>\",\r\n");
      out.write("		      nextArrow : \"<button type='button' class='slick-next'><img src='image/icon/right.png'></button>\",\r\n");
      out.write("		      draggable : true,     //????????? ?????? ?????? \r\n");
      out.write("		      responsive: [ // ????????? ??? ?????? ??????\r\n");
      out.write("		        {  \r\n");
      out.write("		          breakpoint: 960, //?????? ????????? 960px\r\n");
      out.write("		          settings: {\r\n");
      out.write("		            slidesToShow: 1\r\n");
      out.write("		          } \r\n");
      out.write("		        },\r\n");
      out.write("		        { \r\n");
      out.write("		          breakpoint: 768, //?????? ????????? 768px\r\n");
      out.write("		          settings: {    \r\n");
      out.write("		            slidesToShow: 1\r\n");
      out.write("		          } \r\n");
      out.write("		        }\r\n");
      out.write("		      ]\r\n");
      out.write("		\r\n");
      out.write("		    });\r\n");
      out.write("	    \r\n");
      out.write("	    \r\n");
      out.write("	    \r\n");
      out.write("	    \r\n");
      out.write("	})\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
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
}
