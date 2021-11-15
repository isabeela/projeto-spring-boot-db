package com.example.gerenciamentoLivros.model;

public class Proximas {
	private int id;
	private String livro, autor, genero;
	
	public Proximas() {
		
	}
	
	public Proximas(int id, String livro, String autor, String genero) {
		this.id= id;
		this.livro = livro;
		this.autor = autor;
		this.genero = genero;
	}

	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getLivro() {
		return livro;
	}
	
	public void setLivro(String livro) {
		this.livro = livro;
	}
	
	public String getAutor() {
		return autor;
	}
	
	public void setAutor (String autor) {
		this.autor = autor;
	}
	
	public String getGenero() {
		return genero;
	}

	public void setGenero (String genero) {
		this.genero = genero;
	}


	
	
}
