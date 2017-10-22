package br.edu.fatecfranca.ex4;

public class Rio {

	public String nome;
	public float nivel;
	public boolean poluido;
	
	public Rio() {
		
	}
	
	public Rio(String n, float nvl, boolean p) {
		this.nome = n;
		this.nivel = nvl;
		this.poluido = p;
	}
	
	public void chover(float x) {
		this.nivel += x;
	}
	
	public void ensolarar(float x) {
		this.nivel -= x;
	}
	
	public void limpar() {
		this.poluido = false;
	}
	
	public void sujar() {
		this.poluido = true;
	}
	
	public String mostrar() {
		return "Nome: " + this.nome +
		"\nNivel: " + this.nivel +
		"\nPoluido: " + this.poluido;
	}

}
