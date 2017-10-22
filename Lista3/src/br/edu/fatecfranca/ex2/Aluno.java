/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.fatecfranca.ex2;

/**
 *
 * @author aluno
 */
public class Aluno {
    
    private String numeroAluno, nome;
    private int idade;
    private float p1, p2;
    
    public Aluno (){
        this.numeroAluno = "000000";
        this.nome = "";
        this.idade = 0;
        this.p1 = 0;
        this.p2 = 0;
    }

    public Aluno(String numeroAluno, String nome, int idade, float p1, float p2) {
        this.numeroAluno = numeroAluno;
        this.nome = nome;
        this.idade = idade;
        this.p1 = p1;
        this.p2 = p2;
    }

    public String getNumeroAluno() {
        return numeroAluno;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public float getP1() {
        return p1;
    }

    public float getP2() {
        return p2;
    }

    public void setNumeroAluno(String numeroAluno){
        this.trataNumeroAluno(numeroAluno);
    }
    private void trataNumeroAluno(String numeroAluno) {
        if(numeroAluno.length() == 6){
            this.numeroAluno = numeroAluno;
        }
        else throw new IllegalArgumentException("Número de aluno inválido");
    }
    
    
    public void setNome(String nome){
        this.nome = nome;
    }
    private void trataNome(String nome) {
        if(nome.length() <= 30){
            this.nome = nome;
        }
        else throw new IllegalArgumentException("Nome inválido");
    }
    
    public void setIdade(int idade){
        this.idade = idade;
    }

    private void trataIdade(int idade) {
        if(idade >= 0){
            this.idade = idade;
        }
        else throw new IllegalArgumentException("Idade Invalida");
    }
    public void setP1(float p1){
        this.p1 = p1;
    }

    private void trataP1(float p1) {
        if(p1 >= 0){
            this.p1 = p1;
        }
        else throw new IllegalArgumentException("Nota Invalida");
    }

    public void setP2(float p2){
        this.p2 = p2;
    }
    private void trataP2(float p2) {
        if(p2 >= 0){
            this.p1 = p2;
        }
        else throw new IllegalArgumentException("Nota Invalida");
    }
    
    public float notaFinal(){
        return (p1 + p2) / 2;
    }
    
    public String dadosAluno(){
        return "Número do Aluno: " + numeroAluno +
               "\nNome do Aluno: " + nome +
               "\nIdade do Aluno: " + idade;
    }
    
    public String passou(){
        if(((p1 + p2) / 2) >= 6){
            return "Passou!";
        }
        else throw new IllegalArgumentException("Não passou!");
    }
    
}