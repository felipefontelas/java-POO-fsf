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
public class Cliente {
    
    public int numeroConta;
    public int numeroAgencia;
    public String nome;
    public float saldo;
    
    public Cliente(){
        this.nome = "";
        this.numeroAgencia = 0;
        this.numeroConta = 0;
        this.saldo = 0;
    }
    
    public void realizarDeposito(float valor){
        this.saldo =+ valor;
    }
    
    public void realizarSaque(float valor){
        this.saldo =- valor;
    }
    
    public String dadosCliente(){
        return "Número da Conta: " + this.numeroConta +
                "\n Nome do Cliente: " + this.nome +
                "\n Saldo Atual: " + this.saldo;
    }
    
}
