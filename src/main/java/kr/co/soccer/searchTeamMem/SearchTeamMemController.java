package kr.co.soccer.searchTeamMem;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SearchTeamMemController {
	
	@Inject
	SearchTeamMemService service;
	
	
	@GetMapping("/search/searchTeam.sc")
	public String register() {
		return "search/searchTeam";
	}
	@GetMapping("/search/searchTeamList.sc")
	public String selectSearchTeamList(Model model) throws Exception{
//		model.addAttribute("List",service.selectSearchTeamList());
		List<SearchTeamMemVO> list = service.selectSearchTeamList();
		model.addAttribute("List", list);
		return "search/searchTeamList";
	}
}
