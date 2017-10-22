package br.edu.fatecfranca.ex3;

public class Produto {
	
	public int id;
	public String descricao;
	public int qtde;
	public float preco;

	public Produto(int id, String descricao, int qtde, float preco) {
		this.id = id;
		this.descricao = descricao;
		this.qtde = qtde;
		this.preco = preco;
	}
	
	public Produto() {
		
	}
	
	public void comprar(int x) {
		this.qtde += x;
	}
	
	public void vender(int x) {
		this.qtde -= x;
	}
	
	public void subir(float x) {
		this.preco += x;
	}
	
	public void descer(float x) {
		this.preco -= x;
	}
	
	public String mostrar() {
		return "ID: " + this.id +
		"\nDescricão: " + this.descricao +
		"\nQuantidade: " + this.qtde +
		"\nPreço: " + this.preco;
	}

}
