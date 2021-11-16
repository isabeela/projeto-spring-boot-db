package com.example.gerenciamentoLivros.model;


import java.util.List;
import java.util.Map;

import javax.annotation.PostConstruct;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class LidosDAO {
	
	@Autowired
	DataSource dataSource;
	
	JdbcTemplate jdbc;
	
	@PostConstruct
	 private void initialize() {
		
		jdbc = new JdbcTemplate(dataSource);
	}
	
	public void inserirLidos (Lidos lidos) {
		String sql = "INSERT INTO lidos(livro, autor, genero, ano, avaliacao)" + " VALUES (?,?,?,?,?)";
		
		Object[] obj = new Object [5];
		
		obj[0] = lidos.getLivro();
		obj[1] = lidos.getAutor();
		obj[2] = lidos.getGenero();
		obj[3] = lidos.getAno();
		obj[4] = lidos.getAvaliacao();
		
		jdbc.update(sql, obj);
	}
	

	
	public List<Map< String,Object>> getLidos (){
		String sql = "SELECT * FROM lidos";
		List <Map< String,Object>> lido = (List <Map< String,Object>>)
		 jdbc.queryForList(sql);
		return lido;
	}	
	
	
	public void deleteLidos (int id) {
		String sql = "DELETE FROM lidos WHERE id = ?";
		Object[] obj = new Object[1];
		obj[0] = id;
		jdbc.update(sql, obj);
	}
		
}
	
	
