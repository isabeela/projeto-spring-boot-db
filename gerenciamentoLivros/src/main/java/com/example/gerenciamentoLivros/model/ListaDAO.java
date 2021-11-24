package com.example.gerenciamentoLivros.model;


import java.util.List;
import java.util.Map;

import javax.annotation.PostConstruct;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class ListaDAO {
	
	@Autowired
	DataSource dataSource;
	
	JdbcTemplate jdbc;
	
	@PostConstruct
	 private void initialize() {
		
		jdbc = new JdbcTemplate(dataSource);
	}
	
	public void inserirLista (Lista lista) {
		String sql = "INSERT INTO listas(livro, autor, genero, site, preco)" + " VALUES (?,?,?,?,?)";
		
		Object[] obj = new Object [5];
		
		obj[0] = lista.getLivro();
		obj[1] = lista.getAutor();
		obj[2] = lista.getGenero();
		obj[3] = lista.getSite();
		obj[4] = lista.getPreco();
		
		jdbc.update(sql, obj);
	}
	
	public Map<String, Object> getLista(int id){
		String sql = "SELECT * FROM listas WHERE listas.id = ?";
		Object obj[] = new Object[1];
		obj[0] = id;
		
		return jdbc.queryForMap(sql, obj);
		
	}
	
	public List<Map< String,Object>> getLista (){
		String sql = "SELECT * FROM listas";
		List <Map< String,Object>> lista = (List <Map< String,Object>>)
		 jdbc.queryForList(sql);
		return lista;
	}	
	
	
	public void deleteLista (int id) {
		String sql = "DELETE FROM listas WHERE id = ?";
		Object[] obj = new Object[1];
		obj[0] = id;
		jdbc.update(sql, obj);
	}
	
	public void atualizarLista(int id, Lista lista) {
		String sql = "UPDATE listas "
				+    "SET livro = ?, autor = ?, genero = ?, site = ?, preco = ? "
				+    "WHERE id = ?" ;
		Object[] obj = new Object[6];
	
		obj[0] = lista.getLivro();
		obj[1] = lista.getAutor();
		obj[2] = lista.getGenero();
		obj[3] = lista.getSite();
		obj[4] = lista.getPreco();
		
		obj[5] = id;
		jdbc.update(sql, obj);
	}

		
}
	
	