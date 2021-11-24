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

import com.example.gerenciamentoLivros.model.Lista;
import com.example.gerenciamentoLivros.model.ListaService;

@Controller
@ComponentScan("com.model")
public class ListaController {
	
	@Autowired
	private ApplicationContext context;
	
	
	@GetMapping("/lista")
	public String formProximas (Model model) {
		model.addAttribute("lista", new Lista());
		return  "formlista";
	}
	
	
	@PostMapping("/lista")
		public String postProximas(@ModelAttribute Lista l, Model model) {
		ListaService ls = context.getBean(ListaService.class);
		ls.inserirLista(l);
		return "sucessolista";
	  }
	
	
	@GetMapping("/lista-desejos")
	public String listar (Model model) {
		ListaService ldao = context.getBean(ListaService.class);
		List<Map< String,Object>> lista = ldao.getLista();
		model.addAttribute("listar", lista);
		return  "lista-desejos";
	}
	
	@PostMapping("apagar-lista/{id}")
	 public String apagarLista(@PathVariable("id") int id) {
		ListaService ldao = context.getBean(ListaService.class);
		ldao.deleteLista(id);
		return "redirect:/lista-desejos";
	}
	
	@GetMapping("/updlista/{id}")
	public String formAtualizar(@PathVariable("id") int id, Model model) {
		ListaService ldao = context.getBean(ListaService.class);
		Map<String,Object> regs = ldao.getLista(id);
		Lista l = new Lista(id,regs.get("livro").toString(),
				regs.get("autor").toString(), regs.get("genero").toString(),
				regs.get("site").toString(), regs.get("preco").hashCode());
		model.addAttribute("listas", l);
		model.addAttribute("id",id);
		return "updtlista";
	}
	
	@PostMapping("/updlista/{id}")
	public String atualizarLista(@PathVariable("id") int id, 
			                       Model model,
			                       @ModelAttribute Lista l) {
		ListaService ldao = context.getBean(ListaService.class);
		ldao.atualizarLista(id, l);
		return "redirect:/lista-desejos";
	}
	
		
		
}
	
	
	