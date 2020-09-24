package kr.co.soccer.member;

import java.io.Serializable;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

@SuppressWarnings("serial")
public class MemberVO implements Serializable {
	
	@NotBlank(message = "아이디는 필수입니다.")
	@Pattern(regexp = "\\w{4,12}" , message = "알파벳, 숫자, 언더바로 이루어진 4글자 이상 12글자 이하로 작성하여 주세요.")
	private String memId;          /* 회원 아이디 */
	
	@NotBlank(message = "비밀번호는 필수입니다.")
	@Pattern(regexp = "[\\w!-/]{4,12}" , message = "알파벳, 숫자, 특수문자로 이루어진 4글자 이상 12글자 이하로 작성하여 주세요.")
	private String memPass;        /* 회원 비밀번호 */
	
	@NotBlank(message = "이름은 필수입니다.")
	@Pattern(regexp = "[가-힣]{2,6}", message = "한글 두글자 이상 6글자 이하로 입력하여 주세요.")
	private String memName;        /* 회원 이름 */
	
	
	@NotBlank(message = "전화번호는 필수입니다.")
	@Pattern(regexp = "/^\\d{3}-\\d{3,4}-\\d{4}$/", message = "000-0000-0000와 같은 형식으로 입력하여 주세요")	
	private String memHp;          /* 연락처 */
	

	/*지역*/
	
	
	@NotBlank(message = "이메일은 필수입니다.")
	@Email(message = "이메일 형식이 아닙니다.")
	private String memMail;        /* 이메일 */
	
	
	
	
	
	 @Override public String toString() { 
		 return ToStringBuilder.reflectionToString(this, ToStringStyle.MULTI_LINE_STYLE); 
	 }
	 
}