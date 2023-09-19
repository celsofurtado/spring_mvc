package br.com.fiap.games.gameapp.controller;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import br.com.fiap.games.gameapp.Game;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;

@Controller
public class GamesController {
	
	@PersistenceContext
	private EntityManager em;

	@GetMapping("/games")
	public String games(Model model) {
		
		Query query =  em.createQuery("select g from Game g");
		List<Game> games = query.getResultList();
		
		//List<Game> games = Arrays.asList(g1, g1, g1);
		model.addAttribute("games", games);
		
		return "games";
	}
	
}
