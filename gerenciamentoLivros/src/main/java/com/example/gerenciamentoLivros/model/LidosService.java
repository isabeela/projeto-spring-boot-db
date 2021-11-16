
package com.example.gerenciamentoLivros.model;



import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service 
public class LidosService {
	
	@Autowired
	LidosDAO ldao;
	
	public void inserirLidos(Lidos l) {
		ldao.inserirLidos(l);
	}
	
	public List<Map< String,Object>> getLidos(){
		return ldao.getLidos();
	}
	
	public void deleteLidos(int id) {
		ldao.deleteLidos(id);
	}
	

}