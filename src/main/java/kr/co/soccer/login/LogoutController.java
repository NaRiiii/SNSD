/*
 * package kr.co.soccer.login;
 * 
 * import javax.servlet.http.HttpServletRequest; import
 * javax.servlet.http.HttpServletResponse; import
 * javax.servlet.http.HttpSession;
 * 
 * import com.study.login.service.ILoginService; import
 * com.study.servlet.IController;
 * 
 * public class LogoutController implements IController {
 * 
 * private ILoginService loginService = new LoginServiceImpl();
 * 
 * @Override public String process(HttpServletRequest req, HttpServletResponse
 * resp) throws Exception { HttpSession session = req.getSession(); UserVO user
 * = (UserVO) session.getAttribute("USER_INFO"); loginService.logout(user);
 * 
 * session.invalidate(); //세션을 무효화 시키기 return "redirect:/"; }
 * 
 * }
 */