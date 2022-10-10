package com.framework.Ticketera.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@Controller
//@RequestMapping("/")
public class EntradaControlador {
	// @Autowired

	@GetMapping("/")
	public ModelAndView home() {
		System.out.println("HOME ");
		return new ModelAndView("home");
	}
	
	@GetMapping("consultar")
//	@ResponseBody
	public ModelAndView consultar() {
		System.out.println("CONSULTANDO ! ! !!");
		return new ModelAndView("consultar");
	}

	@GetMapping("comprar")
//	@ResponseBody
	public ModelAndView comprar() {
		System.out.println("COMPRANDO ! ! !!");
		return new ModelAndView("comprar");
	}
}
