/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.fatecfranca.ex1;

import javax.swing.JOptionPane;

/**
 *
 * @author positivo
 */
public class TestaVeiculo {

    public static void main(String[] args) {
        
        Veiculo carro = new Veiculo("SUV", "Preto", 4, 2006);
        
        carro.alteraNome("Jubileu");
        
        Veiculo moto = new Veiculo("OffRoad", "Vermelha", 2, 2010);
        
        JOptionPane.showMessageDialog(null, carro.mostra());
        
        JOptionPane.showMessageDialog(null, moto.mostra());
        
        moto.tipo = JOptionPane.showInputDialog("Tipo de Veículo 'moto'");
        moto.cor = JOptionPane.showInputDialog("Cor do Veículo 'moto'");
        moto.nroRodas = Integer.parseInt(JOptionPane.showInputDialog("Número de Rodas do Veículo 'moto'"));
        moto.ano = Integer.parseInt(JOptionPane.showInputDialog("Ano do Veículo 'moto'"));
        
        moto.alteraNome("Johnny Blaze");
        
        JOptionPane.showMessageDialog(null, carro.mostra());
        
        JOptionPane.showMessageDialog(null, moto.mostra());
        
        JOptionPane.showMessageDialog(null,carro.nroRodas());
        
        JOptionPane.showMessageDialog(null,moto.nroRodas());
        
        Veiculo novo = Veiculo.retornaNovoVeiculo(carro, moto);
        JOptionPane.showMessageDialog(null, novo.mostra());
        
        
        
        
    }
    
}
