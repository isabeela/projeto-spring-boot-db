package com.example.gerenciamentoLivros.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service 
public class ProximasService {
	
	@Autowired
	ProximasDAO pdao;
	
	public void inserirProximas(Proximas p) {
		pdao.inserirProximas(p);
	}

}
