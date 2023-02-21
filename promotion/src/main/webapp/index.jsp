<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="css/main.css">
<meta name="viewport" content="width=device-width,initial-scale=1, user-scalable=no">
<script type="text/javascript" src="https://code.jquery.com/jquery-latest.min.js"></script>
<link rel="stylesheet" type="text/css" href="https://cdn.jsdelivr.net/npm/slick-carousel@1.8.1/slick/slick.css"/>
<script type="text/javascript" src="https://cdn.jsdelivr.net/npm/slick-carousel@1.8.1/slick/slick.min.js"></script>
<title>BUY IN HOTEL</title>
</head>
<body>
<%@include file="header.jsp"%>
<div class='mainSection' id='scroll'>
	<img class='mainImg mediaImg' src='image/appImg/main.png'>
	<div class='mainTxt'>
		<img class='mainImg mediaImg' src='image/icon/mainTxt.png'>
		<div class='linkBtn'>
			<button type='button' onclick='araOpen()'>ARA <img src='image/icon/linkArr.png'></button>
			<button type='button' onclick='buyinOpen()'>BUY IN HOTEL <img src='image/icon/linkArr.png'></button>
		</div>
	</div>
</div>

<div class='araBox'>
	<a name='ARA'></a>
	<div class='araDescription'>
		<img class='mediaImg' src='image/appImg/araApp.png'>
		<div class='araTxt'>
			<img src='image/icon/araIcon.png'>
			<h4 class='araTitle'>체험 기반 종합 플랫폼</h4>
			<p class='araExplain'>알아(ARA)는 바이인 호텔과 연계하여 부가적인 수입 창출을 도와드리는 체험 기반 종합 쇼핑몰입니다.
			알아에서는 고객이 직접 경험해보고 구매하고 싶은 상품을 검색하면 지도를 통해 내 주변 어디에 있는지
			확인할 수 있고, 구매 전 제품을 사용하는 매장을 방문하여 직접 경험해 볼 수 있습니다.</p>
		</div>
	</div>
</div>

<div class='araContents'>
	<h4 class='title'>ARA 주요 콘텐츠</h4>
	<div class='araSlide'>
		<div class="slider-wrap">
		    <div class="cont" data-dot-title="상품구매">
		    	<img class='bannerImg' src='image/card/purchase.png'>
		    </div>
		    <div class="cont" data-dot-title="사용 가능 매장">
		    	<img class='bannerImg' src='image/card/store.png'>
		    </div>
		    <div class="cont" data-dot-title="바이인호텔">
		    	<img class='bannerImg' src='image/card/buyinhotel.png'>
		    </div>
		    <div class="cont" data-dot-title="선물하기">
		    	<img class='bannerImg' src='image/card/gift.png'>
		    </div>
		    <div class="cont" data-dot-title="기프트카드">
		    	<img class='bannerImg' src='image/card/araGiftcard.png'>
		    </div>
		</div>
	</div>
</div>

<div class='araVision'>
	<div class='araArea'>
		<h4 class='title'>ARA VISION</h4>
		<p class='description'>ARA에서는 바이인호텔 입점 시 보유 업장 객실의 상품들을 취급하여 해당 물품들의 체험을 유도하고 긍정적인 반응으로 판매를 연결합니다.</p>
		<div class='araVisionList'>
			<div class='araVisionBox'>
				<img src='image/icon/visit.png'>
				<h4 class='visionTitle'>매장 방문 유도</h4>
				<p class='visionTxt'>원하는 제품을 체험하려는 고객님들이 제품을 취급하는 매장을 방문함으로써 객실 예약율 증가</p>
			</div>
			<div class='araVisionBox'>
				<img src='image/icon/trust.png'>
				<h4 class='visionTitle'>제품 신뢰도 상승</h4>
				<p class='visionTxt'>매장 객실에 DP 되어있는 판매 제품들을 투숙 기간 동안 체험하여 제품 신뢰도와 구매 욕구 상승</p>
			</div>
			<div class='araVisionBox'>
				<img src='image/icon/profit.png'>
				<h4 class='visionTitle'>부가 수익 창출</h4>
				<p class='visionTxt'>고객 매장 이용 후 제품구매를 통해 최대 10% 판매 수수료가 발생하여 부가 수익 창출</p>
			</div>
		</div>
	</div>
</div>

<div class='buyinBox'>
	<a name='BuyInHotel'></a>
	<div class='buyinDescription'>
		<img class='mediaImg' src='image/appImg/buyinApp.png'>
		<div>
			<img class='mediaImg' src='image/icon/buyinLogo.png'>
			<h4 class='araTitle'>체험 기반 숙박 플랫폼</h4>
			<p class='araExplain'>바이인호텔(BUY IN HOTEL)은 숙박플랫폼 이용시 발생하는 높은 광고비와 수수료를 해결해주는 체험 기반
			숙박플랫폼 입니다. 바이인호텔은 객실 해결에 대한 내용으로 사장님의 숙박업소에서 발생하는 공실에 대한
			손해율을 룸 렌탈 계약서 방식으로 최소화해드리고, 업계 최저 광고 비용만을 적용하며 프로모션 기간 동안 광고 신청 시
			앱 배너 상단 노출로 인한 예약률 상승에 큰 도움이 됩니다.</p>
		</div>
	</div>
</div>

<div class='buyinContent'>
	<h4 class='title'>BUY IN HOTEL 주요 콘텐츠</h4>
	<div class='buyinSlide'>
		<div class="slider-buyin">
		    <div class="cont" data-dot-title="객실예약">
		    	<img class='bannerImg' src='image/card/reservation.png'>
		    </div>
		    <div class="cont" data-dot-title="어메니티 옵션">
		    	<img class='bannerImg' src='image/card/amenity.png'>
		    </div>
		    <div class="cont" data-dot-title="바이룸">
		    	<img class='bannerImg' src='image/card/buyRoom.png'>
		    </div>
		    <div class="cont" data-dot-title="객실상품">
		    	<img class='bannerImg' src='image/card/product.png'>
		    </div>
		    <div class="cont" data-dot-title="기프트카드">
		    	<img class='bannerImg' src='image/card/giftcard.png'>
		    </div>
		</div>
	</div>
</div>

<div class='discountBox'>
	<div class='discountArea'>
		<img class='mediaImg' src='image/appImg/coupon.png'>
		<div>
			<h4 class='title'>본사 부담 무제한 할인쿠폰 발생</h4>
			<p class='description'>가입 후 3개월동안 매달 30만원 쿠폰 지원.<br>
				카페, 식당 등 카운터 앞에 배치되어 고객이 바로 사용할 수 있는 할인쿠폰을
				드립니다. 쿠폰은 무제한 다운로드 가능하며 모두 본사에서 부담합니다.
			</p>
		</div>
	</div>
</div>

<div class='buyinvision'>
	<div class='visionArea'>
		<div class='visionBox'>
			<h4 class='title'>BUY IN HOTEL VISION</h4>
			<p class='description'>바이인호텔에서는 프로모션 기간동안 수수료 0%로 업주님들의 부담은 최소화 시키면서
			알아 연계 시스템으로 광고효과 및 부가수입 창출까지 가능합니다.</p>
			<div class='buyinList'>
				<div class='buyinVisionBox'>
					<h4>01</h4>
					<p>수수료 ZERO</p>
				</div>
				<div class='buyinVisionBox'>
					<h4>02</h4>
					<p>업계 최저 광고료</p>
				</div>
				<div class='buyinVisionBox'>
					<h4>03</h4>
					<p>알아 연계로 부가 수입 창출</p>
				</div>
				<div class='buyinVisionBox'>
					<h4>04</h4>
					<p>광고비 절감</p>
				</div>
				<div class='buyinVisionBox'>
					<h4>05</h4>
					<p>여유자금 확보 가능</p>
				</div>
				<div class=buyinVisionBox>
					<h4>06</h4>
					<p>업장에 재투자 가능</p>
				</div>
			</div>
		</div>
		<img class='mediaImg' src='image/appImg/fee.png'>
	</div>
</div>

<div class='partnerShip'>
	<h4 class='title'>바이인호텔 제휴신청</h4>
	<p>바이인호텔은 언제나 다양한 분야의 제휴 제안을 환영합니다.</p>
	<div class='sequence'>
		<div class='sequenceBox'>
			<div class='numbering'>
				<img src='image/icon/sequence.png'>
				<p>1</p>			
			</div>
			<div class='sequenceTxt'>
				<img src='image/icon/partnership1.png'>
				<h4>제휴신청</h4>
				<p>제휴를 신청합니다.</p>
			</div>
		</div>
		<div class='sequenceBox'>
			<div class='numbering'>
				<img src='image/icon/sequence.png'>
				<p>2</p>			
			</div>
			<div class='sequenceTxt'>
				<img src='image/icon/partnership2.png'>
				<h4>담당자 검토</h4>
				<p>담당자 검토 후 미팅을 진행합니다.</p>
			</div>
		</div>
		<div class='sequenceBox'>
			<div class='numbering'>
				<img src='image/icon/sequence.png'>
				<p>3</p>			
			</div>
			<div class='sequenceTxt'>
				<img src='image/icon/partnership3.png'>
				<h4>계약진행</h4>
				<p>제휴가 확정되면 계약을 진행합니다.</p>
			</div>
		</div>
		<div class='sequenceBox'>
			<div class='numbering'>
				<img src='image/icon/sequence.png'>
				<p>4</p>			
			</div>
			<div class='sequenceTxt'>
				<img src='image/icon/partnership4.png'>
				<h4>상품등록</h4>
				<p>상품 등록 후 판매가 시작됩니다.</p>
			</div>
		</div>
	</div>
	<p class='document'>필요서류: 사업자등록증, 통장사본, 이메일주소</p>
</div>

<div class='promise'>
	<div class='promiseArea'>
		<p class='promiseTxt'>알아와 바이인호텔은 높은 수수료와 광고비를 목적으로 운영하는 것이 아닌 업주의 입장에서
		 사업장에 대한 고충을 해결해드리고자 보다 나은 서비스를 제공할 것을 약속드립니다.</p>
		 <button type='button' class='tel'>대표번호: 1533-3152</button>
	</div>
</div>

<%@include file="footer.jsp"%>
<script>
	function araOpen(){
		window.open("http://www.aldainc.co.kr/","_blank");
	}
	function buyinOpen(){
		window.open("https://www.buyinhotel.co.kr/","_blank");
	}
</script>
<script>
	var header = $('.header').offset().top;
	$(window).scroll(function(){
		var window = $(this).scrollTop();
		if (header <= window){
			$('.header').addClass("fixed");
			
		} else{
			$('.header').removeClass("fixed");
			$('.header').css('box-shadow','none');
		}
	})
</script>
<script type="text/javascript">
	$(function(){
	    $('.slider-wrap').slick({
	      slide: 'div',        //슬라이드 되어야 할 태그
	      infinite : true,     //무한 반복 옵션     
	      slidesToShow : 1,        // 한 화면에 보여질 컨텐츠 개수
	      slidesToScroll : 1,        //스크롤 한번에 움직일 컨텐츠 개수
	      speed : 500,     // 다음 버튼 누르고 다음 화면 뜨는데까지 걸리는 시간(ms)
	      arrows : true,         // 옆으로 이동하는 화살표 표시 여부
	      dots : true,  
	      // 스크롤바 아래 점으로 페이지네이션 여부
	      customPaging : function(slider, i) {
	    	  	//console.log($(slider.$slides[i]).attr('data-dot-title'));
		        return '<button type="button">' + $(slider.$slides[i]).attr('data-dot-title') + '</button>';
		    },
	      autoplay : false,            // 자동 스크롤 사용 여부
	      autoplaySpeed : 2000,         // 자동 스크롤 시 다음으로 넘어가는데 걸리는 시간 (ms)
	      pauseOnHover : true,        // 슬라이드 이동    시 마우스 호버하면 슬라이더 멈추게 설정
	      vertical : false,        // 세로 방향 슬라이드 옵션
	      prevArrow : "<button type='button' class='slick-prev'><img src='image/icon/left.png'></button>",
	      nextArrow : "<button type='button' class='slick-next'><img src='image/icon/right.png'></button>",
	      draggable : true,     //드래그 가능 여부 
	      responsive: [ // 반응형 웹 구현 옵션
	        {  
	          breakpoint: 960, //화면 사이즈 960px
	          settings: {
	            slidesToShow: 1
	          } 
	        },
	        { 
	          breakpoint: 768, //화면 사이즈 768px
	          settings: {    
	            slidesToShow: 1
	          } 
	        }
	      ]
	
	    });
	    
	    
	    
	    $('.slider-buyin').slick({
		      slide: 'div',        //슬라이드 되어야 할 태그
		      infinite : true,     //무한 반복 옵션     
		      slidesToShow : 1,        // 한 화면에 보여질 컨텐츠 개수
		      slidesToScroll : 1,        //스크롤 한번에 움직일 컨텐츠 개수
		      speed : 500,     // 다음 버튼 누르고 다음 화면 뜨는데까지 걸리는 시간(ms)
		      arrows : true,         // 옆으로 이동하는 화살표 표시 여부
		      dots : true,  
		      // 스크롤바 아래 점으로 페이지네이션 여부
		      customPaging : function(slider, i) {
		    	  	//console.log($(slider.$slides[i]).attr('data-dot-title'));
			        return '<button type="button">' + $(slider.$slides[i]).attr('data-dot-title') + '</button>';
			    },
		      autoplay : false,            // 자동 스크롤 사용 여부
		      //autoplaySpeed : 2000,         // 자동 스크롤 시 다음으로 넘어가는데 걸리는 시간 (ms)
		      pauseOnHover : true,        // 슬라이드 이동    시 마우스 호버하면 슬라이더 멈추게 설정
		      vertical : false,        // 세로 방향 슬라이드 옵션
		      prevArrow : "<button type='button' class='slick-prev'><img src='image/icon/left.png'></button>",
		      nextArrow : "<button type='button' class='slick-next'><img src='image/icon/right.png'></button>",
		      draggable : true,     //드래그 가능 여부 
		      responsive: [ // 반응형 웹 구현 옵션
		        {  
		          breakpoint: 960, //화면 사이즈 960px
		          settings: {
		            slidesToShow: 1
		          } 
		        },
		        { 
		          breakpoint: 768, //화면 사이즈 768px
		          settings: {    
		            slidesToShow: 1
		          } 
		        }
		      ]
		
		    });
	    
	    
	    
	    
	})
</script>

</body>
</html>