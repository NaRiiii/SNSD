package kr.co.soccer.searchTeamMem;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface SearchTeamMemMapper {

	public List<SearchTeamMemVO> selectSearchTeamList() throws Exception;
	
}