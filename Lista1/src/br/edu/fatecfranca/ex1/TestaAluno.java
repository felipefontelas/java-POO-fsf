/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.fatecfranca.ex1;

import javax.swing.JOptionPane;

public class TestaAluno {

    public static void main(String[] args) {
        
        //cria objeto da classe Aluno
        
        Aluno obj1 = new Aluno();
        
        obj1.nome = JOptionPane.showInputDialog("Informe um nome");
        
        obj1.idade = Integer.parseInt(JOptionPane.showInputDialog("Informe sua idade"));
        
        obj1.numeroAluno = Integer.parseInt(JOptionPane.showInputDialog("Informe seu número"));
        
        obj1.p1 = Float.parseFloat(JOptionPane.showInputDialog("Informe a P1"));
        
        obj1.p2 = Float.parseFloat(JOptionPane.showInputDialog("Informe a P2"));
        
        
        int a = Integer.parseInt(JOptionPane.showInputDialog("Informe sua idade"));
        int b = Integer.parseInt(JOptionPane.showInputDialog("Informe seu número"));
        float c = Float.parseFloat(JOptionPane.showInputDialog("Informe a P1"));
        float d = Float.parseFloat(JOptionPane.showInputDialog("Informe a P2"));
        String e = JOptionPane.showInputDialog("Informe um nome");
        
        Aluno obj2 = new Aluno(a, b, c, d, e);
        
        //Aluno obj2 = new Aluno(int idade, int numeroAluno, float p1, float p2, String nome);
        
        JOptionPane.showMessageDialog(null, obj1.dadosAluno() + "Média de obj1: " + obj1.notaFinal() + " " + obj1.passou());
        JOptionPane.showMessageDialog(null, obj2.dadosAluno() + "Média de obj2: " + obj2.notaFinal() + " " + obj2.passou());

    }
    
}
