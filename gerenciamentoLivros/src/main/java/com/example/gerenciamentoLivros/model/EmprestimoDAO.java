package com.example.gerenciamentoLivros.model;


import java.util.List;
import java.util.Map;

import javax.annotation.PostConstruct;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class EmprestimoDAO {
	
	@Autowired
	DataSource dataSource;
	
	JdbcTemplate jdbc;
	
	@PostConstruct
	 private void initialize() {
		
		jdbc = new JdbcTemplate(dataSource);
	}
	
	public void inserirEmprestimo (Emprestimo emprestimo) {
		String sql = "INSERT INTO emprestimo(livro, autor, genero, pessoa, data)" + " VALUES (?,?,?,?,?)";
		
		Object[] obj = new Object [5];
		
		obj[0] = emprestimo.getLivro();
		obj[1] = emprestimo.getAutor();
		obj[2] = emprestimo.getGenero();
		obj[3] = emprestimo.getPessoa();
		obj[4] = emprestimo.getData();
		
		jdbc.update(sql, obj);
	}
	
	public Map<String, Object> getEmprestimo(int id){
		String sql = "SELECT * FROM emprestimo WHERE emprestimo.id = ?";
		Object obj[] = new Object[1];
		obj[0] = id;
		
		return jdbc.queryForMap(sql, obj);
		
	}
	
	public List<Map< String,Object>> getEmprestimo (){
		String sql = "SELECT * FROM emprestimo";
		List <Map< String,Object>> emprestimos = (List <Map< String,Object>>)
		 jdbc.queryForList(sql);
		return emprestimos;
	}	
	
	
	public void deleteEmprestimo (int id) {
		String sql = "DELETE FROM emprestimo WHERE id = ?";
		Object[] obj = new Object[1];
		obj[0] = id;
		jdbc.update(sql, obj);
	}
	
	public void atualizarEmprestimo(int id, Emprestimo emprestimo) {
		String sql = "UPDATE emprestimo "
				+    "SET livro = ?, autor = ?, genero = ?, pessoa = ?, data = ? "
				+    "WHERE id = ?" ;
		Object[] obj = new Object[6];
	
		obj[0] = emprestimo.getLivro();
		obj[1] = emprestimo.getAutor();
		obj[2] = emprestimo.getGenero();
		obj[3] = emprestimo.getPessoa();
		obj[4] = emprestimo.getData();
		
		obj[5] = id;
		jdbc.update(sql, obj);
	}

		
}
	
	
