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
	
	
	@GetMapping("/proximas/{id}")
	public String getPerfil(@PathVariable("id") int id,
			                Model model) {
		ProximasService ps = context.getBean(ProximasService.class);
		Map<String,Object> mapa = ps.getProximas(id);
		model.addAttribute("livros",mapa.get("livros"));
		model.addAttribute("autor",mapa.get("autor"));
		model.addAttribute("genero",mapa.get("genero"));
		model.addAttribute("id",id);
		return "proximas";
	}
	
	
	@GetMapping("/proximas-leituras")
	public String listar (Model model) {
		ProximasService pdao = context.getBean(ProximasService.class);
		List<Map< String,Object>> prox = pdao.getProximas();
		model.addAttribute("listar", prox);
		return  "proximas-leituras";
	}
	
	@PostMapping("apagar/{id}")
	 public String apagarProximas(@PathVariable("id") int id) {
		ProximasService pdao = context.getBean(ProximasService.class);
		pdao.deleteProximas(id);
		return "redirect:/proximas-leituras";
	}
	
	@GetMapping("/upd/{id}")
	public String formAtualizar(@PathVariable("id") int id, Model model) {
		ProximasService pdao = context.getBean(ProximasService.class);
		Map<String,Object> regs = pdao.getProximas(id);
		Proximas p = new Proximas(id,regs.get("livro").toString(),
				regs.get("autor").toString(), regs.get("genero").toString() );
		model.addAttribute("proximas", p);
		model.addAttribute("id",id);
		return "updproximas";
	}
	
	@PostMapping("/upd/{id}")
	public String atualizarProximas(@PathVariable("id") int id, 
			                       Model model,
			                       @ModelAttribute Proximas p) {
		ProximasService pdao = context.getBean(ProximasService.class);
		pdao.atualizarProximas(id, p);
		return "redirect:/proximas-leituras";
	}
	

	
	

		
		
}
	
	
	