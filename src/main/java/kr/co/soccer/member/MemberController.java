package kr.co.soccer.member;

import java.util.List;

import javax.validation.Valid;
import javax.validation.groups.Default;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;


@Controller
public class MemberController { 
	
	@Autowired
	private MemberService memberService; // = new MemberServiceImpl();
	/*
	 * @Autowired private ICommonCodeService codeService ; //= new
	 * CommonCodeServiceImpl();
	 */	
	private final Logger logger = LoggerFactory.getLogger(getClass()); //컨트롤러에 항상 있어야함
	
	/*
	 * @ModelAttribute("jbList") public List<CodeVO> getJobCategoryList() {
	 * List<CodeVO> jbList = codeService.getCodeListByParent("JB00"); return jbList;
	 * }
	 * 
	 * @ModelAttribute("hbList") public List<CodeVO> getHobbyCategoryList() {
	 * List<CodeVO> hbList = codeService.getCodeListByParent("HB00"); return hbList;
	 * }
	 */
	
	//void로 반환
	@RequestMapping("/member/memberList.wow")
	public void memberList(@ModelAttribute("searchVO") MemberSearchVO searchVO, ModelMap model) {
		logger.debug("searchVO={}",searchVO);
		List<MemberVO> members = memberService.getMemberList(searchVO);
		model.addAttribute("members", members);
	}
	
	//void로 반환
	@RequestMapping("/member/memberForm.wow")
	public void memberForm(@ModelAttribute("mem") MemberVO member) {
	}
	
	
	/*
	 * //MAV로 반환, @requestMapping POST제한
	 * 
	 * @RequestMapping(path = "/member/memberRegist.wow", method =
	 * RequestMethod.POST) public RedirectView
	 * memberRegist(@ModelAttribute("mem") @Validated(Default.class )MemberVO
	 * member, BindingResult errors) throws Exception {
	 * logger.debug("member={}",member);
	 */
		/*
		 * if(errors.hasErrors()) { return "member/memberForm"; }
		 */
		/*
		 * memberService.registMember(member); return "member/memberList";
		 */	
	/* } */
	
	//String으로 반환, @requestMapping memId파라미터 존재하도록 제한
	@RequestMapping(path = "/member/memberView.wow",params="memId")
	public String memberView( String memId, ModelMap model ) throws Exception{
		logger.debug("memId={}",memId);
		memberService.getMember(memId);
		return "member/memberView";
	}
	
	//String으로 반환, @requestMapping memId파라미터 존재하도록 제한
	@RequestMapping(path = "/member/memberEdit.wow" ,params="memId")
	public String memberEdit( String memId, ModelMap model) throws Exception {
		logger.debug("memId={}",memId);
		MemberVO mem = memberService.getMember(memId);
		return "member/memberEdit";
	}
	
	//String으로 반환, @requestMapping memId파라미터 존재하도록 제한, POST제한
	@RequestMapping(path = "/member/memberModify.wow", method = RequestMethod.POST ,params = "memId")
	public String memberModify(@ModelAttribute("mem") @Valid MemberVO member, BindingResult errors, ModelMap model) throws Exception{
		logger.debug("member={}",member);
		
		if(errors.hasErrors()) {
			return "member/memberEdit";
		}
//		memberService.modifyMember(member);
//		return "redirect:/member/memberView.wow?memId=" + member.getMemId();
		return null;
	}
	
	//String으로 반환, @requestMapping memId, memPass파라미터 존재하도록 제한, POST제한
	@RequestMapping(path = "/member/memberDelete.wow" , method = RequestMethod.POST ,params = {"memId","memPass"})
	public String memberDelete(MemberVO member, ModelMap model) throws Exception {
		logger.debug("member={}",member);
//		memberService.removeMember(member);
//		return "common/message";
		return null;
	}
	
	@RequestMapping(path = "/member/memberCheckedDelete.wow", params = "memId")
	public String memberCheckedDelete(@RequestParam(name="memId") String[] memIds, ModelMap model) throws Exception {
		memberService.checkedMemberDelete(memIds);
		return "common/message";
	}
	
	
}
