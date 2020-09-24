package kr.co.soccer.searchTeamMem;

import java.io.Serializable;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

@SuppressWarnings("serial")
public class SearchTeamMemVO implements Serializable {
	//search Team VO
	private int schtNo;                /* 글번호 */
	private String memId;              /* 회원ID */
	private String schtPosition;       /* 포지션 */
	private int schtAge;               /* 나이 */
	private String schtRegion;         /* 지역 */
	private int schtTime;              /* 희망시간 */
	private int schtHit;               /* 조회수 */
	private String schtTitle;          /* 글제목 */
	private String schtContent;        /* 글내용 */
	private String memPass;            /* 회원PW */
	
	//search Member VO
	private int schmNo;                /* 글번호 */
	private String tmId;               /* 팀ID */
	private String tmName;             /* 팀이름 */
	private String schmPosition;       /* 포지션 */
	private int schmAge;               /* 나이 */
	private String schmRegion;         /* 지역 */
	private int schmTime;              /* 희망시간 */
	private int schmHit;               /* 조회수 */
	private String schmTitle;          /* 글제목 */
	private String schmContent;        /* 글내용 */
	
	//ToString
	public String toString() {
		return ToStringBuilder.reflectionToString(this, ToStringStyle.MULTI_LINE_STYLE);
	}

	//search Team
	public int getSchtNo() {
		return schtNo;
	}

	public void setSchtNo(int schtNo) {
		this.schtNo = schtNo;
	}

	public String getMemId() {
		return memId;
	}

	public void setMemId(String memId) {
		this.memId = memId;
	}

	public String getSchtPosition() {
		return schtPosition;
	}

	public void setSchtPosition(String schtPosition) {
		this.schtPosition = schtPosition;
	}

	public int getSchtAge() {
		return schtAge;
	}

	public void setSchtAge(int schtAge) {
		this.schtAge = schtAge;
	}

	public String getSchtRegion() {
		return schtRegion;
	}

	public void setSchtRegion(String schtRegion) {
		this.schtRegion = schtRegion;
	}

	public int getSchtTime() {
		return schtTime;
	}

	public void setSchtTime(int schtTime) {
		this.schtTime = schtTime;
	}

	public int getSchtHit() {
		return schtHit;
	}

	public void setSchtHit(int schtHit) {
		this.schtHit = schtHit;
	}

	public String getSchtTitle() {
		return schtTitle;
	}

	public void setSchtTitle(String schtTitle) {
		this.schtTitle = schtTitle;
	}

	public String getSchtContent() {
		return schtContent;
	}

	public void setSchtContent(String schtContent) {
		this.schtContent = schtContent;
	}

	public String getMemPass() {
		return memPass;
	}

	public void setMemPass(String memPass) {
		this.memPass = memPass;
	}

	
	
	//search Member
	public int getSchmNo() {
		return schmNo;
	}

	public void setSchmNo(int schmNo) {
		this.schmNo = schmNo;
	}

	public String getTmId() {
		return tmId;
	}

	public void setTmId(String tmId) {
		this.tmId = tmId;
	}

	public String getTmName() {
		return tmName;
	}

	public void setTmName(String tmName) {
		this.tmName = tmName;
	}

	public String getSchmPosition() {
		return schmPosition;
	}

	public void setSchmPosition(String schmPosition) {
		this.schmPosition = schmPosition;
	}

	public int getSchmAge() {
		return schmAge;
	}

	public void setSchmAge(int schmAge) {
		this.schmAge = schmAge;
	}

	public String getSchmRegion() {
		return schmRegion;
	}

	public void setSchmRegion(String schmRegion) {
		this.schmRegion = schmRegion;
	}

	public int getSchmTime() {
		return schmTime;
	}

	public void setSchmTime(int schmTime) {
		this.schmTime = schmTime;
	}

	public int getSchmHit() {
		return schmHit;
	}

	public void setSchmHit(int schmHit) {
		this.schmHit = schmHit;
	}

	public String getSchmTitle() {
		return schmTitle;
	}

	public void setSchmTitle(String schmTitle) {
		this.schmTitle = schmTitle;
	}

	public String getSchmContent() {
		return schmContent;
	}

	public void setSchmContent(String schmContent) {
		this.schmContent = schmContent;
	}
	
	
	
}
