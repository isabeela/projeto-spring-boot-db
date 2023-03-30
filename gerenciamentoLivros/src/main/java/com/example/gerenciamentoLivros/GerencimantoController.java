package com.example.gerenciamentoLivros;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class GerencimantoController {
	
	/*@GetMapping("/inicio")
	public String inicio () {
		return "index";
	}*/
	
	@GetMapping("/inicio")
	public String inicial () {
		return "inicio";
	}
	
	@GetMapping("/login")
	public String login () {
		return "login";
	}
	
	@GetMapping("/cadastrar")
	public String cadastrar () {
		return "cadastrar";
	}
	
	@GetMapping("/guia")
	public String guia () {
		return "guia";
	}
	
	@GetMapping("/anuncios")
	public String anuncios () {
		return "anuncios";
	}
	
	@GetMapping("/meus-anuncios")
	public String meusanuncios () {
		return "meus-anuncios";
	}
	
	
	@GetMapping("/conquistas")
	public String conquistas () {
		return "conquistas";
	}
	
	@GetMapping("/recomendacoes")
	public String recomendacoes () {
		return "recomendacoes";
	}
	
	
	@GetMapping("/configurar")
	public String configurar () {
		return "configurar-perfil";
	}
	
	@GetMapping("/quiz")
	public String quiz () {
		return "quiz";
	}
	
	@GetMapping("/error")
	public String error () {
		return "error";
	}
	
}
