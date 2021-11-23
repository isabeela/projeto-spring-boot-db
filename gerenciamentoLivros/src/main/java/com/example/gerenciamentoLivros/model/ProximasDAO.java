package com.example.gerenciamentoLivros.model;


import java.util.List;
import java.util.Map;

import javax.annotation.PostConstruct;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class ProximasDAO {
	
	@Autowired
	DataSource dataSource;
	
	JdbcTemplate jdbc;
	
	@PostConstruct
	 private void initialize() {
		
		jdbc = new JdbcTemplate(dataSource);
	}
	
	public void inserirProximas (Proximas proximas) {
		String sql = "INSERT INTO proximas(livro, autor, genero)" + " VALUES (?,?,?)";
		
		Object[] obj = new Object [3];
		
		obj[0] = proximas.getLivro();
		obj[1] = proximas.getAutor();
		obj[2] = proximas.getGenero();
		
		jdbc.update(sql, obj);
	}
	
	
	public Map<String, Object> getProximas(int id) {
    	String sql = "SELECT * FROM proximas WHERE proximas.id = ?";
    	Object[] obj = new Object[1];
    	obj[0] = id;
    	
    	return jdbc.queryForMap(sql,obj);
    }


	
	public List<Map< String,Object>> getProximas(){
		String sql = "SELECT * FROM proximas";
		List <Map< String,Object>> prox = (List <Map< String,Object>>)
		 jdbc.queryForList(sql);
		return prox;
	}	
	
	
	public void deleteProximas (int id) {
		String sql = "DELETE FROM proximas WHERE id = ?";
		Object[] obj = new Object[1];
		obj[0] = id;
		jdbc.update(sql, obj);
	}
	

    public void atualizarProximas(int id, Proximas proximas) {
		String sql = "UPDATE proximas "
				+    "SET livro = ?, autor = ?, genero = ? "
				+    "WHERE id = ?" ;
		Object[] obj = new Object[4];
	
		obj[0] = proximas.getLivro();
		obj[1] = proximas.getAutor();
		obj[2] = proximas.getGenero();
		obj[3] = id;
		jdbc.update(sql, obj);
	}

		
}
	
	
