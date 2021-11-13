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
	
	@GetMapping("/lidos")
	public String lidos () {
		return "lidos";
	}
	
	@GetMapping("/lista-desejos")
	public String listadeDesejos () {
		return "lista-desejos";
	}
		
	@GetMapping("/emprestados")
	public String emprestados () {
		return "emprestados";
	}
	
}
