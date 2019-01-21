package ffse1704.controller.home;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

public class HomeController {
	@RequestMapping("/home")
	public String viewHome() {
		return "home";
	}

}
