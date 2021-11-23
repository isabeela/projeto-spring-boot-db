package com.example.gerenciamentoLivros.model;



import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service 
public class ProximasService {
	
	@Autowired
	ProximasDAO pdao;
	
	public void inserirProximas(Proximas p) {
		pdao.inserirProximas(p);
	}
	
	public Map<String,Object> getProximas(int id) {
		return pdao.getProximas(id);
	}
	
	public List<Map< String,Object>> getProximas(){
		return pdao.getProximas();
	}
	
	public void deleteProximas(int id) {
		pdao.deleteProximas(id);
	}
	
	public void atualizarProximas(int id, Proximas p){
		pdao.atualizarProximas(id, p);
	}
	

}
