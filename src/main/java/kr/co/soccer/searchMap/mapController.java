package kr.co.soccer.searchMap;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class mapController {
	
		@GetMapping("search/searchMap.sc")
		public String register() {
			return "search/searchMap";
		
		}
}
