package com.example.gerenciamentoLivros;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class GerencimantoController {
	
	@GetMapping("/")
	public String inicio () {
		return "index";
	}
	
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
	
	@GetMapping("/error")
	public String error () {
		return "error";
	}
	
}
