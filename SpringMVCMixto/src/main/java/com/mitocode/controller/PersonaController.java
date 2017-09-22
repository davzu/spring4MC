package com.mitocode.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/")
public class PersonaController {

	@RequestMapping(value = "saludar", method = RequestMethod.GET)
	public String saludar(ModelMap model) {
		model.addAttribute("nombres", "Mito");
		model.addAttribute("apellidos", "Code");

		return "persona";
	}

	@RequestMapping(value = "mostrar", method = RequestMethod.GET)
	public ModelAndView mostrar() {
		ModelAndView mv = new ModelAndView();
		mv.addObject("nombres", "David");
		mv.addObject("apellidos", "Zuzunaga");
		mv.setViewName("persona");

		return mv;
	}

	@RequestMapping(value = "enviar", method = RequestMethod.POST)
	public String enviar(@RequestParam("nombres") String nombres, @RequestParam("apellidos") String apellidos,
			ModelMap model) {
		model.addAttribute("nombres", nombres);
		model.addAttribute("apellidos", apellidos);

		return "persona";
	}

}
