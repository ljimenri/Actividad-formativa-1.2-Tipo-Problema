package com.everis.actividad1_2grupal.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class IndexController {

	@RequestMapping("/")
	public String formulario(Model model) {
		// atributos form
		model.addAttribute("name", "");
		model.addAttribute("lastName", "");
		model.addAttribute("limit", "");
		model.addAttribute("code", "");
		// mensajes validacion
		model.addAttribute("alertaNombre", "");
		model.addAttribute("alertaApellido", "");
		model.addAttribute("alertaLimite", "");
		model.addAttribute("alertaCodigo", "");

		return "index.jsp";

	}

	@RequestMapping("/submit")
	public String onSubmit(@RequestParam(value = "name") String name, @RequestParam(value = "lastName") String lastName,
			@RequestParam(value = "limit") int limit, @RequestParam(value = "code") String code, Model model) {

		System.out.println(name);
		System.out.println(lastName);
		System.out.println(code);
		System.out.println(limit);

		// asigno variables al modelo
		model.addAttribute("name", name);
		model.addAttribute("lastName", lastName);
		model.addAttribute("limit", limit);
		model.addAttribute("code", code);

		boolean valid = true;

		// validar nombre
		if (name.length() < 1 || name.length() > 10) {
			model.addAttribute("alertaNombre", "Debe tener entre 1 y 10 caracteres");
			valid = false;
		} else {
			model.addAttribute("alertaNombre", "");
		}

		// validar apellido
		if (lastName.length() < 1 || lastName.length() > 10) {
			model.addAttribute("alertaApellido", "Debe tener entre 1 y 10 caracteres");
			valid = false;
		} else {
			model.addAttribute("alertaApellido", "");
		}

		// validar limite
		if (limit < 0 || limit > 999999) {
			model.addAttribute("alertaLimite", "Debe ser positivo y menor a 6 digitos");
			valid = false;
		} else {
			model.addAttribute("alertaLimite", "");
		}

		// validar limite
		if (code.length() != 8) {
			model.addAttribute("alertaCodigo", "El codigo debe tener 8 digitos");
			valid = false;
		} else {
			model.addAttribute("alertaCodigo", "");
		}

		if (!valid) {
			return "index.jsp";
		}

		// return "inicio.jsp";
		return "redirect:/pagina2?name=" + name + "&lastName=" + lastName + "&code=" + code + "&limit=" + limit;
	}

	@RequestMapping("/pagina2")
	public String inicio(@RequestParam(value = "name") String name, @RequestParam(value = "lastName") String lastName,
			@RequestParam(value = "limit") int limit, @RequestParam(value = "code") String code, Model model) {

		model.addAttribute("name", name);
		model.addAttribute("lastName", lastName);
		model.addAttribute("limit", limit);
		model.addAttribute("code", code);
		return "pagina2.jsp";

	}

	@RequestMapping("/clean")
	public String onClean() {
		return "index.jsp";
	}
}