package com.example.demo;

import java.util.HashMap;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Controller1 {
	
	
	@RequestMapping("/view")
	public String web()
	{
	 	return "view2";
	}
	@RequestMapping("/view1")
	public String web1(HttpSession session) throws ClassNotFoundException
	{
		//HashMap<Integer,List> mp=new HashMap<Integer,List>();
		Alien obj=(Alien)session.getAttribute("alien");
		List c=Database.update(obj);
		session.setAttribute("list",c);
		return "view2";
		//mp.put(1, c);
		//return mp;
	}
	
}
