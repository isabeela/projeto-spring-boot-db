package com.example.gerenciamentoLivros.model;

public class Lista {
	
	private int id, preco;
	private String livro, autor, genero, site;
	
	
	public Lista() {
		
	}
	
	public Lista(int id, String livro, String autor, String genero, String site, int preco) {
		this.id= id;
		this.livro = livro;
		this.autor = autor;
		this.genero = genero;
		this.site = site;
		this.preco = preco;
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

	public String getSite() {
		return site;
	}

	public void setSite (String site) {
		this.site = site;
	}
	
	public int getPreco() {
		return preco;
	}

	public void setPreco (int preco) {
		this.preco = preco;
	}


}


