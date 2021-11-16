
package com.example.gerenciamentoLivros.model;



import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service 
public class ListaService {
	
	@Autowired
	ListaDAO ldao;
	
	public void inserirLista(Lista l) {
		ldao.inserirLista(l);
	}
	
	public List<Map< String,Object>> getLista(){
		return ldao.getLista();
	}
	
	public void deleteLista(int id) {
		ldao.deleteLista(id);
	}
	

}
