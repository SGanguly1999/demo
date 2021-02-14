package com.example.demo;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class RController {

	@GetMapping("")
	public void web(HttpServletRequest req,HttpServletResponse response) throws IOException, ServletException
	{
		RequestDispatcher rd=req.getRequestDispatcher("view");
	 	 rd.forward(req,response);
	}
	
	@PostMapping("/add")
	public void add(Alien obj,HttpSession session,HttpServletResponse response) throws IOException
	{
		session.setAttribute("alien", obj);
		response.sendRedirect("/view1");
		
	}

}
