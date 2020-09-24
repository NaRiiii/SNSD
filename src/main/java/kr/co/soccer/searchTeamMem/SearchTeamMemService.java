package kr.co.soccer.searchTeamMem;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

@Service
public class SearchTeamMemService {
	@Inject
	SearchTeamMemMapper mapper;
	
	public List<SearchTeamMemVO> selectSearchTeamList() throws Exception{
		return mapper.selectSearchTeamList();
	}

}
