package com.example.gerenciamentoLivros;


import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;


import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.gerenciamentoLivros.model.Lidos;
import com.example.gerenciamentoLivros.model.LidosService;

@Controller
@ComponentScan("com.model")
public class LidosController {
	
	@Autowired
	private ApplicationContext context;
	
	
	@GetMapping("/lidos")
	public String formProximas (Model model) {
		model.addAttribute("lidos", new Lidos());
		return  "formlidos";
	}
	
	
	@PostMapping("/lidos")
		public String postProximas(@ModelAttribute Lidos l, Model model) {
		LidosService ls = context.getBean(LidosService.class);
		ls.inserirLidos(l);
		return "sucessolidos";
	  }
	
	
	@GetMapping("/livros-lidos")
	public String listar (Model model) {
		LidosService ldao = context.getBean(LidosService.class);
		List<Map< String,Object>> lista = ldao.getLidos();
		model.addAttribute("listar", lista);
		return  "livros-lidos";
	}
	
	@PostMapping("apagar-lidos/{id}")
	 public String apagarLista(@PathVariable("id") int id) {
		LidosService ldao = context.getBean(LidosService.class);
		ldao.deleteLidos(id);
		return "redirect:/livros-lidos";
	}
		
		
}
	
	
	