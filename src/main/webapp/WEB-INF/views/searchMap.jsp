<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix ="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!doctype html>
	<!--[if lt IE 7]>      <html class="no-js lt-ie9 lt-ie8 lt-ie7" lang=""> <![endif]-->
	<!--[if IE 7]>         <html class="no-js lt-ie9 lt-ie8" lang=""> <![endif]-->
	<!--[if IE 8]>         <html class="no-js lt-ie9" lang=""> <![endif]-->
	<!--[if gt IE 8]><!--> <html class="no-js" lang=""> <!--<![endif]-->
    <head>
    <%@ include file="/WEB-INF/inc/header.jsp" %>
    <title>Social Network Soccer Dreaming</title> 
    </head>
    <body data-spy="scroll" data-target=".navbar-collapse">
        <div class='preloader'><div class='loaded'>&nbsp;</div></div>
        <div class="culmn">
        <%@ include file="/WEB-INF/inc/top.jsp" %>
                       <!-- History section -->
            <section id="history" class="history sections">
                <div class="container">
                    <div class="row">
                        <div class="main_history">
                            <div class="col-sm-6">
                                <div class="single_history_img">
                                    <img src="${pageContext.request.contextPath}/resources/images/stab1.png" alt="" />
                                </div>
                            </div>

                            <div class="col-sm-6">
                                <div class="single_history_content">
                                    <div class="head_title">
                                        <h2>나와 맞는 구장 찾기</h2>
                                    </div>
                                    <p>자신의 집과 가까운 구장을 확인하고 예약하세요.
                                    		상대팀과 뜨겁게 경기를하며 좋은 추억으로 남기실 수 있게 저희 SNSD가 도와드립니다.
                                    		또한, 공식 리그전이 열리는 날에는 리그 일정과 장소를 제공해드립니다.
                                    		아래 리그전 정보를 클릭하여 리그전 일정 및 장소를 확인하실 수 있습니다.
                                    		리그를 관람할 사람들은 남녀노소 누구나 무료로 관람 가능하오니 장소를 검색하여
                                    		친구, 애인, 가족, 동료들과 함께 뜨겁게 응원하세요!!
                                     </p>

                                    <a href="" class="btn btn-lg">리그전 정보</a>
                                </div>
                            </div>
                        </div>
                    </div><!--End of row -->
                </div><!--End of container -->
            </section><!--End of history -->
            
		<%@ include file="/WEB-INF/inc/footer.jsp" %>
       
    </body>
</html>
