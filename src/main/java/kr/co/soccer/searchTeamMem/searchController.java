package kr.co.soccer.searchTeamMem;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class searchController {
	@GetMapping("/search/searchTeam.sc")
	public String register() {
		return "search/searchTeam"; 
	}
}
