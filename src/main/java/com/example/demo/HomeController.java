package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

	@RequestMapping("/")
	public String home() {
		return "index";
	}

//	@RequestMapping("add1")
//	public String add(HttpServletRequest req) {
//
//		int i = Integer.parseInt(req.getParameter("num1"));
//		int j = Integer.parseInt(req.getParameter("num2"));
//		int sum = i + j;
//		HttpSession session = req.getSession();
//		session.setAttribute("num3", sum);
//		return "result.jsp";
//	}

//	@RequestMapping("add")
//	public ModelAndView add(@RequestParam("num1") int i, @RequestParam("num2") int j) {
//
//		ModelAndView mv = new ModelAndView();
//		mv.setViewName("result");
//		int sum = i + j;
//		mv.addObject("num3", sum);
//		return mv;
//	}

	@RequestMapping("add")
	public String add(@RequestParam("num1") int i, @RequestParam("num2") int j, Model m) {
		int sum = i + j;
		m.addAttribute("num3", sum);
		return "result";
	}

	@RequestMapping("addAlian")
	public String addAlian(@RequestParam("aid") int aid, @RequestParam("aname") String aname) {
		return "result";
	}
}
