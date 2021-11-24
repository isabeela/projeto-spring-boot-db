
package com.example.gerenciamentoLivros.model;



import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service 
public class EmprestimoService {
	
	@Autowired
	EmprestimoDAO edao;
	
	public void inserirEmprestimo(Emprestimo e) {
		edao.inserirEmprestimo(e);
	}
	
	public Map<String,Object> getEmprestimo(int id) {
		return edao.getEmprestimo(id);
	}
	
	public List<Map< String,Object>> getEmprestimo(){
		return edao.getEmprestimo();
	}
	
	public void deleteEmprestimo(int id) {
		edao.deleteEmprestimo(id);
	}
	
	public void atualizarEmprestimo(int id, Emprestimo e){
		edao.atualizarEmprestimo(id, e);
	}

}
