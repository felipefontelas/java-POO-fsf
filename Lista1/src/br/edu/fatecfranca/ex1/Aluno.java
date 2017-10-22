/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.fatecfranca.ex1;

import javax.swing.JOptionPane;

/**
 *
 * @author aluno
 */
public class Aluno {
    
    //declaração das váriaveis
    
    public int numeroAluno, idade;
    public float p1, p2;
    public String nome;
    
    //criação dos métodos construtores
    
    //sem parametros
    public Aluno(){
        this.idade = 0 ;
        this.numeroAluno = 0;
        this.p1 = 0;
        this.p2 = 0;
        this.nome = "";
    }
    //com parametros
    public Aluno(int idade, int numeroAluno, float p1, float p2, String nome){
        this.idade = idade;
        this.numeroAluno = numeroAluno;
        this.p1 = p1;
        this.p2 = p2;
        this.nome = nome;
    }
    //criação dos métodos da classe
    public float notaFinal(){
        return (this.p1 + this.p2) / 2;
        
    }
    public String passou(){
        //operador ternário
        return (this.notaFinal() >= 6) ? "Passou \n" : "Não Passou \n";
    }
    
    public String dadosAluno(){
        return "Número: " + this.numeroAluno +
                "\n Nome: " + this.nome +
                "\nP1: " + this.p1 +
                "\n P2: " + this.p2;
    }
}
