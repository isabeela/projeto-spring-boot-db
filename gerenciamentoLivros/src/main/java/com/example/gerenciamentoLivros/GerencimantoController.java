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
	
	@GetMapping("/error")
	public String error () {
		return "error";
	}
	
}
