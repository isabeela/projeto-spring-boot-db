package com.example.gerenciamentoLivros.model;

public class Lidos {
	
	private int id, ano;
	private String livro, autor, genero, avaliacao ;
	
	
	public Lidos() {
		
	}
	
	public Lidos(int id, String livro, String autor, String genero,
			int ano, String avaliacao) {
		this.id= id;
		this.livro = livro;
		this.autor = autor;
		this.genero = genero;
		this.ano = ano;
		this.avaliacao = avaliacao;
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


	public int getAno() {
		return ano;
	}

	public void setAno (int ano) {
		this.ano = ano;
	}
	
	public String getAvaliacao() {
		return avaliacao;
	}

	public void setAvaliacao (String avaliacao) {
		this.avaliacao = avaliacao;
	}
	


}



