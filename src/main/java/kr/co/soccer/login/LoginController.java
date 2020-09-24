package kr.co.soccer.login;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.study.common.util.CookieUtils;
import com.study.common.vo.ResultMessageVO;
import com.study.exception.BizNotFoundException;
import com.study.exception.BizPasswordNotMatchedException;
import com.study.login.service.ILoginService;

@Controller
public class LoginController {
	
	@Autowired
	private ILoginService loginService; // = new LoginServiceImpl();
	//Common Logger : private final Log logger = LogFactory.getLog(this.getClass());
	//SLF4J : 조금 더 향상된 LOG 퍼사드 객체
	private final Logger logger = LoggerFactory.getLogger(getClass()); //컨트롤러에 항상 있어야함 
	
	@RequestMapping(path = "/login/login.wow", method = RequestMethod.GET)
	public String loginGet() throws Exception{
		return "login/login";
	}
	
	@RequestMapping(path = "/login/login.wow", method = RequestMethod.POST)
	public String loginPost(UserVO vo
							, HttpSession session
							, @RequestParam(name = "rememberMe", required = false) String remember
							, HttpServletResponse resp 
							, ModelMap model) throws Exception{
		// CommonLogging : logger.debug("UserVO = " + vo,"+",remember="+remember);
		//여러 값을 콤마(,)로 구분하여 처리할 수도 있고, {}를 사용하는것도 가능하다
//		logger.debug("UserVO=", vo,",remember=",remember);
		logger.debug("UserVO={},remember={}" ,vo ,remember);
		
		try {
			UserVO userVO = loginService.loginCheck(vo);
			 if("Y".equals(remember)) {
			 	Cookie cookie = CookieUtils.createCookie("SAVE_ID", vo.getUserId(),"/",60*60*24*31);
			 	resp.addCookie(cookie);	 
			 }else{
			 	resp.addCookie(CookieUtils.createCookie("SAVE_ID", "","/",0));	 		 
			 }
			 logger.debug("세션에 정보 저장 = {}", userVO);
			 session.setAttribute("USER_INFO", userVO); 
			 return "redirect:/";
		} catch (BizNotFoundException | BizPasswordNotMatchedException e) {
			logger.error(e.getMessage(),e); //에러처리 이렇게 할 것 waring 또는 error
			ResultMessageVO message = new ResultMessageVO();
			message.setResult(false)
					.setTitle("로그인실패")
					.setMessage("회원이 존재하지 않거나 비밀번호가 잘못되었습니다.");
			model.addAttribute("message", message); 
			return "common/message";
		}
	}
	@RequestMapping("/login/logout.wow")
	public String logout(HttpSession session) throws Exception{
		UserVO user = (UserVO) session.getAttribute("USER_INFO");
		loginService.logout(user);
		logger.debug("로그아웃 = {}",user);
		session.invalidate();	//세션을 무효화 시키기 
		return "redirect:/";
		
	}
}
