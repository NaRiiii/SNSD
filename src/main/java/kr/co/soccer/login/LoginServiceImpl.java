package kr.co.soccer.login;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.study.exception.BizNotFoundException;
import com.study.exception.BizPasswordNotMatchedException;
import com.study.member.dao.IMemberDao;
import com.study.member.vo.MemberVO;

@Service
public class LoginServiceImpl {

	@Autowired
	private MemberMapper memberdao;

	@Override
	public UserVO loginCheck(UserVO user) throws BizNotFoundException, BizPasswordNotMatchedException {
		MemberVO vo = memberdao.getMember(user.getUserId());
		if (vo == null) {
			throw new BizNotFoundException(user.getUserId() + "회원이 존재하지 않습니다.");
		}
		if (!vo.getMemPass().equals(user.getUserPass())) {
			throw new BizPasswordNotMatchedException();
		} // 성공

		UserVO userVO = new UserVO();
		userVO.setUserId(vo.getMemId());
		userVO.setUserPass(vo.getMemPass());
		userVO.setUserName(vo.getMemName());
		userVO.setUserRole(memberdao.getUserRoleByUserId(vo.getMemId()));
		return userVO;
	}

	@Override
	public void logout(UserVO user) {
		// TODO 로그인

	}

}
