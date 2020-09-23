package kr.co.soccer.searchTeamMem;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SearchTeamMemService {

	private final SearchTeamMemMapper mapper;

	@Autowired
	public SearchTeamMemService(SearchTeamMemMapper mapper) {
		this.mapper = mapper;
	}
	
	public List<SearchTeamMemVO> selectSearchTeamList() throws Exception{
		return mapper.selectSearchTeamList();
	}

}
