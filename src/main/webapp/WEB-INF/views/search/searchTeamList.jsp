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
    <style>
    #homeIMG{
    /* 원하는 메인이미지를 resources안에 images폴더에 넣은 후 이미지 변경해주세요 */
    background: url(${pageContext.request.contextPath}/resources/images/teambg.jpg) no-repeat center center;
    background-size: cover;
}
    </style>
    </head>
    <body data-spy="scroll" data-target=".navbar-collapse">
        <div class='preloader'><div class='loaded'>&nbsp;</div></div>
        <div class="culmn">
        <%@ include file="/WEB-INF/inc/top.jsp" %>
            <!--home Section -->
            <section id="homeIMG" class="home" >
                <div class="overlay">
                    <div class="home_skew_border">
                        <div class="container">
                            <div class="row">
                                <div class="col-sm-12 ">
                                    <div class="main_home_slider text-center">
                                        <div class="single_home_slider">
                                            <div class="main_home wow fadeInUp" data-wow-duration="700ms">
                                                		<!-- 멘트만 바꿔주세용</p> -->
                                                <h3>TEMPLATE </h3>
                                                <h1>BOARD</h1>
                                                <div class="separator"></div>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                        <div class="scrooldown">
                            <a href="#feature"><i class="fa fa-arrow-down"></i></a>
                        </div>
                    </div>
                </div>
            </section><!--End of home section -->
            <!--home Section -->
            <table class="table table-striped table-bordered table-hover ">
	<colgroup>
		<col width="10%" />
		<col width="15%" />
		<col />
		<col width="10%" />
		<col width="15%" />
		<col width="10%" />
	</colgroup>
	<thead>
		<tr>
			<th>글번호</th>
			<th>분류</th>
			<th>제목</th>
			<th>작성자</th>
			<th>등록일</th>
			<th>조회수</th>
		</tr>
	</thead>	
	<tbody>
		<tr class="text-center">
			<td>1</td>
			<td>분류용</td>
			<td class="text-left">
				<a href="#">
					지원합니다
				</a>
			</td>
			<td>최승주</td>
			<td>20200902</td>
			<td>100</td>
		</tr>
		
		
	</tbody>
	</table>
            
            
            
		<%@ include file="/WEB-INF/inc/footer.jsp" %>
       
    </body>
</html>
