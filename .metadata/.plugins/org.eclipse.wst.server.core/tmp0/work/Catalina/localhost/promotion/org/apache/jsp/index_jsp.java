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
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
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
      out.write("			<h4 class='araTitle'>체험 기반 종합 플랫폼</h4>\r\n");
      out.write("			<p class='araExplain'>알아(ARA)는 바이인 호텔과 연계하여 부가적인 수입 창출을 도와드리는 체험 기반 종합 쇼핑몰입니다.\r\n");
      out.write("			알아에서는 고객이 직접 경험해보고 구매하고 싶은 상품을 검색하면 지도를 통해 내 주변 어디에 있는지\r\n");
      out.write("			확인할 수 있고, 구매 전 제품을 사용하는 매장을 방문하여 직접 경험해 볼 수 있습니다.</p>\r\n");
      out.write("		</div>\r\n");
      out.write("	</div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<div class='araContents'>\r\n");
      out.write("	<h4 class='title'>ARA 주요 콘텐츠</h4>\r\n");
      out.write("	<div class='araSlide'>\r\n");
      out.write("		<div class=\"slider-wrap\">\r\n");
      out.write("		    <div class=\"cont\" data-dot-title=\"상품구매\">\r\n");
      out.write("		    	<img class='bannerImg' src='image/card/purchase.png'>\r\n");
      out.write("		    </div>\r\n");
      out.write("		    <div class=\"cont\" data-dot-title=\"사용 가능 매장\">\r\n");
      out.write("		    	<img class='bannerImg' src='image/card/store.png'>\r\n");
      out.write("		    </div>\r\n");
      out.write("		    <div class=\"cont\" data-dot-title=\"바이인호텔\">\r\n");
      out.write("		    	<img class='bannerImg' src='image/card/buyinhotel.png'>\r\n");
      out.write("		    </div>\r\n");
      out.write("		    <div class=\"cont\" data-dot-title=\"선물하기\">\r\n");
      out.write("		    	<img class='bannerImg' src='image/card/gift.png'>\r\n");
      out.write("		    </div>\r\n");
      out.write("		    <div class=\"cont\" data-dot-title=\"기프트카드\">\r\n");
      out.write("		    	<img class='bannerImg' src='image/card/araGiftcard.png'>\r\n");
      out.write("		    </div>\r\n");
      out.write("		</div>\r\n");
      out.write("	</div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<div class='araVision'>\r\n");
      out.write("	<div class='araArea'>\r\n");
      out.write("		<h4 class='title'>ARA VISION</h4>\r\n");
      out.write("		<p class='description'>ARA에서는 바이인호텔 입점 시 보유 업장 객실의 상품들을 취급하여 해당 물품들의 체험을 유도하고 긍정적인 반응으로 판매를 연결합니다.</p>\r\n");
      out.write("		<div class='araVisionList'>\r\n");
      out.write("			<div class='araVisionBox'>\r\n");
      out.write("				<img src='image/icon/visit.png'>\r\n");
      out.write("				<h4 class='visionTitle'>매장 방문 유도</h4>\r\n");
      out.write("				<p class='visionTxt'>원하는 제품을 체험하려는 고객님들이 제품을 취급하는 매장을 방문함으로써 객실 예약율 증가</p>\r\n");
      out.write("			</div>\r\n");
      out.write("			<div class='araVisionBox'>\r\n");
      out.write("				<img src='image/icon/trust.png'>\r\n");
      out.write("				<h4 class='visionTitle'>제품 신뢰도 상승</h4>\r\n");
      out.write("				<p class='visionTxt'>매장 객실에 DP 되어있는 판매 제품들을 투숙 기간 동안 체험하여 제품 신뢰도와 구매 욕구 상승</p>\r\n");
      out.write("			</div>\r\n");
      out.write("			<div class='araVisionBox'>\r\n");
      out.write("				<img src='image/icon/profit.png'>\r\n");
      out.write("				<h4 class='visionTitle'>부가 수익 창출</h4>\r\n");
      out.write("				<p class='visionTxt'>고객 매장 이용 후 제품구매를 통해 최대 10% 판매 수수료가 발생하여 부가 수익 창출</p>\r\n");
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
      out.write("			<h4 class='araTitle'>체험 기반 숙박 플랫폼</h4>\r\n");
      out.write("			<p class='araExplain'>바이인호텔(BUY IN HOTEL)은 숙박플랫폼 이용시 발생하는 높은 광고비와 수수료를 해결해주는 체험 기반\r\n");
      out.write("			숙박플랫폼 입니다. 바이인호텔은 객실 해결에 대한 내용으로 사장님의 숙박업소에서 발생하는 공실에 대한\r\n");
      out.write("			손해율을 룸 렌탈 계약서 방식으로 최소화해드리고, 업계 최저 광고 비용만을 적용하며 프로모션 기간 동안 광고 신청 시\r\n");
      out.write("			앱 배너 상단 노출로 인한 예약률 상승에 큰 도움이 됩니다.</p>\r\n");
      out.write("		</div>\r\n");
      out.write("	</div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<div class='buyinContent'>\r\n");
      out.write("	<h4 class='title'>BUY IN HOTEL 주요 콘텐츠</h4>\r\n");
      out.write("	<div class='buyinSlide'>\r\n");
      out.write("		<div class=\"slider-buyin\">\r\n");
      out.write("		    <div class=\"cont\" data-dot-title=\"객실예약\">\r\n");
      out.write("		    	<img class='bannerImg' src='image/card/reservation.png'>\r\n");
      out.write("		    </div>\r\n");
      out.write("		    <div class=\"cont\" data-dot-title=\"어메니티 옵션\">\r\n");
      out.write("		    	<img class='bannerImg' src='image/card/amenity.png'>\r\n");
      out.write("		    </div>\r\n");
      out.write("		    <div class=\"cont\" data-dot-title=\"바이룸\">\r\n");
      out.write("		    	<img class='bannerImg' src='image/card/buyRoom.png'>\r\n");
      out.write("		    </div>\r\n");
      out.write("		    <div class=\"cont\" data-dot-title=\"객실상품\">\r\n");
      out.write("		    	<img class='bannerImg' src='image/card/product.png'>\r\n");
      out.write("		    </div>\r\n");
      out.write("		    <div class=\"cont\" data-dot-title=\"기프트카드\">\r\n");
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
      out.write("			<h4 class='title'>본사 부담 무제한 할인쿠폰 발생</h4>\r\n");
      out.write("			<p class='description'>가입 후 3개월동안 매달 30만원 쿠폰 지원.<br>\r\n");
      out.write("				카페, 식당 등 카운터 앞에 배치되어 고객이 바로 사용할 수 있는 할인쿠폰을\r\n");
      out.write("				드립니다. 쿠폰은 무제한 다운로드 가능하며 모두 본사에서 부담합니다.\r\n");
      out.write("			</p>\r\n");
      out.write("		</div>\r\n");
      out.write("	</div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<div class='buyinvision'>\r\n");
      out.write("	<div class='visionArea'>\r\n");
      out.write("		<div class='visionBox'>\r\n");
      out.write("			<h4 class='title'>BUY IN HOTEL VISION</h4>\r\n");
      out.write("			<p class='description'>바이인호텔에서는 프로모션 기간동안 수수료 0%로 업주님들의 부담은 최소화 시키면서\r\n");
      out.write("			알아 연계 시스템으로 광고효과 및 부가수입 창출까지 가능합니다.</p>\r\n");
      out.write("			<div class='buyinList'>\r\n");
      out.write("				<div class='buyinVisionBox'>\r\n");
      out.write("					<h4>01</h4>\r\n");
      out.write("					<p>수수료 ZERO</p>\r\n");
      out.write("				</div>\r\n");
      out.write("				<div class='buyinVisionBox'>\r\n");
      out.write("					<h4>02</h4>\r\n");
      out.write("					<p>업계 최저 광고료</p>\r\n");
      out.write("				</div>\r\n");
      out.write("				<div class='buyinVisionBox'>\r\n");
      out.write("					<h4>03</h4>\r\n");
      out.write("					<p>알아 연계로 부가 수입 창출</p>\r\n");
      out.write("				</div>\r\n");
      out.write("				<div class='buyinVisionBox'>\r\n");
      out.write("					<h4>04</h4>\r\n");
      out.write("					<p>광고비 절감</p>\r\n");
      out.write("				</div>\r\n");
      out.write("				<div class='buyinVisionBox'>\r\n");
      out.write("					<h4>05</h4>\r\n");
      out.write("					<p>여유자금 확보 가능</p>\r\n");
      out.write("				</div>\r\n");
      out.write("				<div class=buyinVisionBox>\r\n");
      out.write("					<h4>06</h4>\r\n");
      out.write("					<p>업장에 재투자 가능</p>\r\n");
      out.write("				</div>\r\n");
      out.write("			</div>\r\n");
      out.write("		</div>\r\n");
      out.write("		<img class='mediaImg' src='image/appImg/fee.png'>\r\n");
      out.write("	</div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<div class='partnerShip'>\r\n");
      out.write("	<h4 class='title'>바이인호텔 제휴신청</h4>\r\n");
      out.write("	<p>바이인호텔은 언제나 다양한 분야의 제휴 제안을 환영합니다.</p>\r\n");
      out.write("	<div class='sequence'>\r\n");
      out.write("		<div class='sequenceBox'>\r\n");
      out.write("			<div class='numbering'>\r\n");
      out.write("				<img src='image/icon/sequence.png'>\r\n");
      out.write("				<p>1</p>			\r\n");
      out.write("			</div>\r\n");
      out.write("			<div class='sequenceTxt'>\r\n");
      out.write("				<img src='image/icon/partnership1.png'>\r\n");
      out.write("				<h4>제휴신청</h4>\r\n");
      out.write("				<p>제휴를 신청합니다.</p>\r\n");
      out.write("			</div>\r\n");
      out.write("		</div>\r\n");
      out.write("		<div class='sequenceBox'>\r\n");
      out.write("			<div class='numbering'>\r\n");
      out.write("				<img src='image/icon/sequence.png'>\r\n");
      out.write("				<p>2</p>			\r\n");
      out.write("			</div>\r\n");
      out.write("			<div class='sequenceTxt'>\r\n");
      out.write("				<img src='image/icon/partnership2.png'>\r\n");
      out.write("				<h4>담당자 검토</h4>\r\n");
      out.write("				<p>담당자 검토 후 미팅을 진행합니다.</p>\r\n");
      out.write("			</div>\r\n");
      out.write("		</div>\r\n");
      out.write("		<div class='sequenceBox'>\r\n");
      out.write("			<div class='numbering'>\r\n");
      out.write("				<img src='image/icon/sequence.png'>\r\n");
      out.write("				<p>3</p>			\r\n");
      out.write("			</div>\r\n");
      out.write("			<div class='sequenceTxt'>\r\n");
      out.write("				<img src='image/icon/partnership3.png'>\r\n");
      out.write("				<h4>계약진행</h4>\r\n");
      out.write("				<p>제휴가 확정되면 계약을 진행합니다.</p>\r\n");
      out.write("			</div>\r\n");
      out.write("		</div>\r\n");
      out.write("		<div class='sequenceBox'>\r\n");
      out.write("			<div class='numbering'>\r\n");
      out.write("				<img src='image/icon/sequence.png'>\r\n");
      out.write("				<p>4</p>			\r\n");
      out.write("			</div>\r\n");
      out.write("			<div class='sequenceTxt'>\r\n");
      out.write("				<img src='image/icon/partnership4.png'>\r\n");
      out.write("				<h4>상품등록</h4>\r\n");
      out.write("				<p>상품 등록 후 판매가 시작됩니다.</p>\r\n");
      out.write("			</div>\r\n");
      out.write("		</div>\r\n");
      out.write("	</div>\r\n");
      out.write("	<p class='document'>필요서류: 사업자등록증, 통장사본, 이메일주소</p>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<div class='promise'>\r\n");
      out.write("	<div class='promiseArea'>\r\n");
      out.write("		<p class='promiseTxt'>알아와 바이인호텔은 높은 수수료와 광고비를 목적으로 운영하는 것이 아닌 업주의 입장에서\r\n");
      out.write("		 사업장에 대한 고충을 해결해드리고자 보다 나은 서비스를 제공할 것을 약속드립니다.</p>\r\n");
      out.write("		 <button type='button' class='tel'>대표번호: 1533-3152</button>\r\n");
      out.write("	</div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<footer>\r\n");
      out.write("	<div class='companyInfo'>\r\n");
      out.write("		<p>사업자: ㈜바이인호텔 | 사업자등록번호: 627-81-02234</p>\r\n");
      out.write("		<p>주소 : 서울특별시 강남구 논현로85길 58, 11층 1109호(역삼동, 강남루덴스 오피스텔)</p>\r\n");
      out.write("		<p>대표이사 : 임재옥 | 전화번호 : 1533-3152 | FAX : 062-225-5100</p>\r\n");
      out.write("		<p>Copyright ⓒ 2021 BUY ON HOTEL All rights reserved.</p>\r\n");
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
      out.write("	      slide: 'div',        //슬라이드 되어야 할 태그\r\n");
      out.write("	      infinite : true,     //무한 반복 옵션     \r\n");
      out.write("	      slidesToShow : 1,        // 한 화면에 보여질 컨텐츠 개수\r\n");
      out.write("	      slidesToScroll : 1,        //스크롤 한번에 움직일 컨텐츠 개수\r\n");
      out.write("	      speed : 500,     // 다음 버튼 누르고 다음 화면 뜨는데까지 걸리는 시간(ms)\r\n");
      out.write("	      arrows : true,         // 옆으로 이동하는 화살표 표시 여부\r\n");
      out.write("	      dots : true,  \r\n");
      out.write("	      // 스크롤바 아래 점으로 페이지네이션 여부\r\n");
      out.write("	      customPaging : function(slider, i) {\r\n");
      out.write("	    	  	//console.log($(slider.$slides[i]).attr('data-dot-title'));\r\n");
      out.write("		        return '<button type=\"button\">' + $(slider.$slides[i]).attr('data-dot-title') + '</button>';\r\n");
      out.write("		    },\r\n");
      out.write("	      autoplay : false,            // 자동 스크롤 사용 여부\r\n");
      out.write("	      autoplaySpeed : 2000,         // 자동 스크롤 시 다음으로 넘어가는데 걸리는 시간 (ms)\r\n");
      out.write("	      pauseOnHover : true,        // 슬라이드 이동    시 마우스 호버하면 슬라이더 멈추게 설정\r\n");
      out.write("	      vertical : false,        // 세로 방향 슬라이드 옵션\r\n");
      out.write("	      prevArrow : \"<button type='button' class='slick-prev'><img src='image/icon/left.png'></button>\",\r\n");
      out.write("	      nextArrow : \"<button type='button' class='slick-next'><img src='image/icon/right.png'></button>\",\r\n");
      out.write("	      draggable : true,     //드래그 가능 여부 \r\n");
      out.write("	      responsive: [ // 반응형 웹 구현 옵션\r\n");
      out.write("	        {  \r\n");
      out.write("	          breakpoint: 960, //화면 사이즈 960px\r\n");
      out.write("	          settings: {\r\n");
      out.write("	            slidesToShow: 1\r\n");
      out.write("	          } \r\n");
      out.write("	        },\r\n");
      out.write("	        { \r\n");
      out.write("	          breakpoint: 768, //화면 사이즈 768px\r\n");
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
      out.write("		      slide: 'div',        //슬라이드 되어야 할 태그\r\n");
      out.write("		      infinite : true,     //무한 반복 옵션     \r\n");
      out.write("		      slidesToShow : 1,        // 한 화면에 보여질 컨텐츠 개수\r\n");
      out.write("		      slidesToScroll : 1,        //스크롤 한번에 움직일 컨텐츠 개수\r\n");
      out.write("		      speed : 500,     // 다음 버튼 누르고 다음 화면 뜨는데까지 걸리는 시간(ms)\r\n");
      out.write("		      arrows : true,         // 옆으로 이동하는 화살표 표시 여부\r\n");
      out.write("		      dots : true,  \r\n");
      out.write("		      // 스크롤바 아래 점으로 페이지네이션 여부\r\n");
      out.write("		      customPaging : function(slider, i) {\r\n");
      out.write("		    	  	//console.log($(slider.$slides[i]).attr('data-dot-title'));\r\n");
      out.write("			        return '<button type=\"button\">' + $(slider.$slides[i]).attr('data-dot-title') + '</button>';\r\n");
      out.write("			    },\r\n");
      out.write("		      autoplay : false,            // 자동 스크롤 사용 여부\r\n");
      out.write("		      //autoplaySpeed : 2000,         // 자동 스크롤 시 다음으로 넘어가는데 걸리는 시간 (ms)\r\n");
      out.write("		      pauseOnHover : true,        // 슬라이드 이동    시 마우스 호버하면 슬라이더 멈추게 설정\r\n");
      out.write("		      vertical : false,        // 세로 방향 슬라이드 옵션\r\n");
      out.write("		      prevArrow : \"<button type='button' class='slick-prev'><img src='image/icon/left.png'></button>\",\r\n");
      out.write("		      nextArrow : \"<button type='button' class='slick-next'><img src='image/icon/right.png'></button>\",\r\n");
      out.write("		      draggable : true,     //드래그 가능 여부 \r\n");
      out.write("		      responsive: [ // 반응형 웹 구현 옵션\r\n");
      out.write("		        {  \r\n");
      out.write("		          breakpoint: 960, //화면 사이즈 960px\r\n");
      out.write("		          settings: {\r\n");
      out.write("		            slidesToShow: 1\r\n");
      out.write("		          } \r\n");
      out.write("		        },\r\n");
      out.write("		        { \r\n");
      out.write("		          breakpoint: 768, //화면 사이즈 768px\r\n");
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
