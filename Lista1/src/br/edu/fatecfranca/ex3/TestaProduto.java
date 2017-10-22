package br.edu.fatecfranca.ex3;

import javax.swing.JOptionPane;

public class TestaProduto {

	public static void main(String[] args) {

		//Produto A S/ Parametros
		Produto produtoA = new Produto();
		
		produtoA.id = 2;
		produtoA.descricao = "Carvão";
		produtoA.qtde = 3;
		produtoA.preco = (float)10.99;
		
		produtoA.vender(3);
		produtoA.comprar(7);
                produtoA.comprar(7);
                produtoA.subir((float)0.56);
                produtoA.descer((float)1.09);
		JOptionPane.showMessageDialog(null, produtoA.mostrar());
                
                //Produto A C/ Parametros
		Produto produtoB = new Produto(1, "Abacate", 15, (float)5.25);
		produtoB.vender(3);
		produtoB.comprar(7);
                produtoB.subir((float)0.20);
                produtoB.descer((float)1.75);
		JOptionPane.showMessageDialog(null, produtoB.mostrar());
		
                    
	}

}
