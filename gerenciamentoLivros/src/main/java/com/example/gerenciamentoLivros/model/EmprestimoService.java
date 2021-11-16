package com.example.gerenciamentoLivros.model;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;

public class EmprestimoService {
	
	@Autowired
	EmprestimoDAO edao;
	
	public void inserirEmprestimo(Emprestimo e) {
		edao.inserirEmprestimo(e);
	}
	
	public List<Map< String,Object>> getEmprestimo(){
		return edao.getEmprestimo();
	}
	
	public void deleteEmprestimo(int id) {
		edao.deleteEmprestimo(id);
	}
	

}
