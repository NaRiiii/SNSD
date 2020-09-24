package kr.co.soccer.member;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.study.common.util.MybatisSqlSessionFactory;
import com.study.exception.BizDuplicateKeyException;
import com.study.exception.BizNotEffectedException;
import com.study.exception.BizNotFoundException;
import com.study.member.dao.IMemberDao;
import com.study.member.vo.MemberSearchVO;
import com.study.member.vo.MemberVO;

@Service
public class MemberService {

	@Autowired
	private MemberMapper memberDao;

	@Override
	public void registMember(MemberVO member) throws BizDuplicateKeyException {
		// 회원이 존재하는지 먼저 조회
		MemberVO vo = memberDao.getMember(member.getMemId());
		if (vo != null) {
			throw new BizDuplicateKeyException();
		}
		memberDao.insertMember(member);
	}

	@Override
	public void modifyMember(MemberVO member) throws BizNotEffectedException, BizNotFoundException {
		MemberVO vo = memberDao.getMember(member.getMemId());
		if (vo == null) {
			throw new BizNotFoundException("[" + member.getMemId() + "] 조회 실패");
		}
		int cnt = memberDao.updateMember(member);
		if (cnt < 1) {
			throw new BizNotEffectedException("[" + member.getMemId() + "] 수정 실패");
		}
	}

	@Override
	public void removeMember(MemberVO member) throws BizNotEffectedException, BizNotFoundException {
		MemberVO vo = memberDao.getMember(member.getMemId());
		if (vo == null) {
			throw new BizNotFoundException("[" + member.getMemId() + "] 삭제 실패");
		}
		int cnt = memberDao.deleteMember(member);
		if (cnt < 1) {
			throw new BizNotEffectedException("[" + member.getMemId() + "] 삭제 실패");
		}
	}

	@Override
	public MemberVO getMember(String memId) throws BizNotFoundException {
		MemberVO vo = memberDao.getMember(memId);
		if (vo == null) {
			throw new BizNotFoundException("[" + memId + "] 조회 실패");
		}
		return vo;
	}

	@Override
	public List<MemberVO> getMemberList(MemberSearchVO searchVO) {
		// 건수를 구해서 searchVO 설정 -> searchVO.pageSetting() ->list 호
		int cnt = memberDao.getMemberCount(searchVO);
		searchVO.setTotalRowCount(cnt);
		searchVO.pageSetting();

		List<MemberVO> list = memberDao.getMemberList(searchVO);
		return list;
	}

	@Override
	public void checkedMemberDelete(String[] checkedMemIds) {
		memberDao.updateMemberDelete(checkedMemIds);
	}
}