package com.example.gerenciamentoLivros.model;

public class Emprestimo {
	
	private int id;
	private String livro, autor, genero, pessoa, data ;
	
	
	public Emprestimo() {
		
	}
	
	public Emprestimo(int id, String livro, String autor, String genero,
			String pessoa, String data) {
		this.id= id;
		this.livro = livro;
		this.autor = autor;
		this.genero = genero;
		this.pessoa = pessoa;
		this.data = data;
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

	public String getPessoa() {
		return pessoa;
	}

	public void setPessoa (String pessoa) {
		this.pessoa = pessoa;
	}
	
	public String getData() {
		return data;
	}

	public void setData (String data) {
		this.data = data;
	}


}



