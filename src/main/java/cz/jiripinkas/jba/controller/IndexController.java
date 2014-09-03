package cz.jiripinkas.jba.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

	@RequestMapping("/index")
	public String index() {
		//this string being returned is a location of the view template which is in our case a jsp file
			return "index";
	}
	
}
