package br.com.fiap.games.gameapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import jakarta.servlet.http.HttpServletRequest;

@Controller
public class HomeController {
	
	@GetMapping("/home")
	public String home(HttpServletRequest request) {
		request.setAttribute("nome", "Celso Furtado");
		return "home";
	}
	
	@GetMapping("/sobre")
	public String sobre(Model model) {
		model.addAttribute("facu", "Faculdade de Informática e Administração Paulista");
		model.addAttribute("fiap", " FIAP");
		return "sobre";
	}

}
