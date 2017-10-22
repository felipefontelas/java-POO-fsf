package br.edu.fatecfranca.ex4;

import javax.swing.JOptionPane;

public class TestaRio {

	public static void main(String[] args) {
		//Rio A C/ Paramentros
		Rio rioA = new Rio("Rio Canoas", (float)8.6, false);
		
		rioA.chover(23);
		rioA.ensolarar(9);
		rioA.sujar();
		JOptionPane.showMessageDialog(null, rioA.mostrar());
		
		//Rio B S/ parametros
		Rio rioB = new Rio();
		
		rioB.nome = "Rio Negro";
		rioB.nivel = 20;
		rioB.poluido = true;
		
		rioB.chover(32);
		rioB.ensolarar(3);
		rioB.limpar();
		JOptionPane.showMessageDialog(null, rioB.mostrar());

	}

}
