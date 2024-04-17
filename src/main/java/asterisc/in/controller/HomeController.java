package asterisc.in.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import asterisc.in.model.User;

@Controller
public class HomeController {
	@RequestMapping("/")
	String myfun(Model m)
	
	{
		String name ="reena";
		m.addAttribute("uobj", name);
		return "page.html";
	}
	
	@RequestMapping("/test")
    String myfun1(Model m)
	{
		User u= new User(101, "priti  ", "nagpur");
		m.addAttribute("uobj", u);
		return "page1.html";
	}
	
	@RequestMapping("/test1")
    String myfun2(Model m)
	{
		ModelAndView mv= new ModelAndView("page2.html");
		User u=new User(102, "Rishabh", "Jamtha");
		mv.addObject("u", u);
		return "page2.html";
	}

}
