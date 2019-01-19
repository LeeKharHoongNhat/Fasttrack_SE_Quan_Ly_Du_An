package ffse1704.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

public class Test {
	@RequestMapping("/test")
	public String viewAdd() {
		return "phongban/test";
	}

}
