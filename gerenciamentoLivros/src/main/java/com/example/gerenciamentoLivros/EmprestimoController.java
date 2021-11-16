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

import com.example.gerenciamentoLivros.model.Emprestimo;
import com.example.gerenciamentoLivros.model.EmprestimoService;


@Controller
@ComponentScan("com.model")
public class EmprestimoController {
	
	@Autowired
	private ApplicationContext context;
	
	
	@GetMapping("/emprestimo")
	public String formEmprestados (Model model) {
		model.addAttribute("emprestimo", new Emprestimo());
		return  "formemprestimo";
	}
	
	
	@PostMapping("/emprestimo")
		public String postEmprestimo(@ModelAttribute Emprestimo e, Model model) {
		EmprestimoService es = context.getBean(EmprestimoService.class);
		es.inserirEmprestimo(e);
		return "sucessoemp";
	  }
	
	
	
	@GetMapping("/emprestados")
	public String listar (Model model) {
		EmprestimoService edao = context.getBean(EmprestimoService.class);
		List<Map< String,Object>> listar  = edao.getEmprestimo();
		model.addAttribute("emprestar", listar);
		return  "emprestados";
	}
	
	@PostMapping("apagar-emprestimo/{id}")
	 public String apagarEmprestimo(@PathVariable("id") int id) {
		EmprestimoService edao = context.getBean(EmprestimoService.class);
		edao.deleteEmprestimo(id);
		return "redirect:/emprestados";
	}
		
		
}
	
	
	