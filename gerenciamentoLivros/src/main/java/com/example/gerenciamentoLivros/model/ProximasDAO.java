package com.example.gerenciamentoLivros.model;

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
		String sql = "INSERT INTO proximas(livro, autor)" + " VALUES (?,?)";
		
		Object[] obj = new Object [2];
		
		obj[0] = proximas.getLivro();
		obj[1] = proximas.getAutor();
		
		jdbc.update(sql, obj);
	}
	
	public Map<String, Object> getProximas(int id){
		String sql = "SELECT * FROM proximas WHERE proximas.id = ?";
		Object obj[] = new Object[1];
		obj[0] = id;
		
		return jdbc.queryForMap(sql, obj);
		
	}

}
