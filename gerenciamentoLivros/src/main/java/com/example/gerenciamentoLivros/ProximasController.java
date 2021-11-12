package com.example.gerenciamentoLivros;


import org.springframework.beans.factory.annotation.Autowired;


import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.gerenciamentoLivros.model.Proximas;
import com.example.gerenciamentoLivros.model.ProximasService;

@Controller
@ComponentScan("com.model")
public class ProximasController {
	
	@Autowired
	private ApplicationContext context;
	
	
	@GetMapping("/proximas")
	public String formProximas (Model model) {
		model.addAttribute("proximas", new Proximas());
		return  "formprox";
	}
	
	
	@PostMapping("/proximas")
		public String postProximas(@ModelAttribute Proximas p, Model model) {
		ProximasService ps = context.getBean(ProximasService.class);
		ps.inserirProximas(p);
		return "sucessoproximas";
		}
		
}