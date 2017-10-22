/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.fatecfranca.ex2;

import javax.swing.JOptionPane;

public class TestaCliente {

    public static void main(String[] args) {
        
        Cliente fulano = new Cliente();
        
        fulano.nome = JOptionPane.showInputDialog("Informe um nome");
        fulano.saldo = Float.parseFloat(JOptionPane.showInputDialog("Informe o saldo"));
        fulano.numeroAgencia = Integer.parseInt(JOptionPane.showInputDialog("Informe o Nº Agencia"));
        fulano.numeroConta = Integer.parseInt(JOptionPane.showInputDialog("Informe o Nº Conta"));
        
        fulano.realizarDeposito((float)253.22);
        fulano.realizarSaque((float)120.36);
        
        Cliente beltrano = new Cliente();
        
        beltrano.nome = JOptionPane.showInputDialog("Informe um nome");
        beltrano.saldo = Float.parseFloat(JOptionPane.showInputDialog("Informe o saldo"));
        beltrano.numeroAgencia = Integer.parseInt(JOptionPane.showInputDialog("Informe o Nº Agencia"));
        beltrano.numeroConta = Integer.parseInt(JOptionPane.showInputDialog("Informe o Nº Conta"));
        
        beltrano.realizarDeposito((float)221.60);
        beltrano.realizarSaque((float)66.89);
        
        
        JOptionPane.showMessageDialog(null, fulano.dadosCliente());
        JOptionPane.showMessageDialog(null, beltrano.dadosCliente());
    }
    
}
