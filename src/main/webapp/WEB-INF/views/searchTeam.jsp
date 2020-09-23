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
            <!--home Section -->
            <div class="container marketing">
        <div class="row">
            <div class="col-sm-6">
                <div class="main_contact_info">
                    <div class="row">
                        <div class="contact_info_content padding-top-90 padding-bottom-60 p_l_r">
                            <div class="col-sm-12">
                                <div class="single_contact_info">
                                    <div class="single_info_text">
                                        <h3>OUR ADDRESS</h3>
                                        <h4>House #13, Streat road, Sydney 
                                            2310 Australia</h4>
                                    </div>
                                </div>
                            </div>
                            <div class="col-sm-12">
                                <div class="single_contact_info">
                                    <div class="single_info_text">
                                        <h3>CALL US</h3>
                                        <h4>+ 880 168 109 1425</h4>
                                        <h4>+ 0216809142</h4>
                                    </div>
                                </div>
                            </div>
                            <div class="col-sm-12">
                                <div class="single_contact_info">
                                    <div class="single_info_text">
                                        <h3>EMAIL US</h3>
                                        <h4>contactus@email.com</h4>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div> 

            <div class="col-sm-6">
                <div class="single_contant_left padding-top-90 padding-bottom-90">
                    <form action="#" id="formid">
                        <div class="col-lg-8 col-md-8 col-sm-10 col-lg-offset-2 col-md-offset-2 col-sm-offset-1">

                            <div class="row">
                                <div class="col-sm-12">
                                    <div class="form-group">
                                        <select class="form-control form-control-sm my-3" style="vertical-align: middle;text-align-last: center;">
                                            <option value="attacker">공격수</option>
                                            <option value="midfielder">미드필더</option>
                                            <option value="difenser">수비수</option>
                                            <option value="keeper">골키퍼</option>
                                          </select> 
                                    </div>
                                </div>
                            </div>


                            <div class="row">
                                <div class="col-sm-12">
                                    <div class="form-group">
                                        <select class="form-control form-control-sm my-3" style="vertical-align: middle;text-align-last: center;">
                                            <option value="ten">10대</option>
                                            <option value="twelve">20대</option>
                                            <option value="third">30대</option>
                                            <option value="forth">40대</option>
                                            <option value="fifth">50대</option>
                                            <option value="six">60대</option>
                                            <option value="ho">70대 이상</option>
                                          </select> 
                                    </div>
                                </div>
                                <div class="col-sm-12">
                                    <div class="form-group">
                                        <select class="form-control form-control-sm my-3" style="vertical-align: middle;text-align-last: center;">
                                            <option value="eth">서울</option>
                                            <option value="ken">경기도</option>
                                            <option value="col">충청도</option>
                                            <option value="hu">경상도</option>
                                            <option value="cera">전라도</option>
                                            <option value="cera">강원도</option>
                                            <option value="ho">제주도</option>
                                          </select> 
                                    </div>
                                </div>
                            </div>


                            <div class="form-group">
                                <select class="form-control form-control-sm my-3" style="vertical-align: middle;text-align-last: center;">
                                    <option value="eth">평일 오전</option>
                                    <option value="ken">평일 저녁</option>
                                    <option value="col">주말 오전</option>
                                    <option value="hu">주말 저녁</option>
                                  </select> 
                            </div>

                            <div class="">
                                <input type="submit" value="SEND MESSAGE" class="btn btn-lg">
                            </div>
                        </div> 
                    </form>
                </div>
            </div>
           
            
            
            
		<%@ include file="/WEB-INF/inc/footer.jsp" %>
       
    </body>
</html>
