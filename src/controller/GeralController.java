package controller;

import javax.swing.JOptionPane;

import model.CompiladorAluno;

public class GeralController {
	
	public static void operacaoAluno() {
		
		CompiladorAluno ca = new CompiladorAluno();
		int opcao;
		
		opcao = Integer.parseInt(JOptionPane.showInputDialog("ESCOLHA UMA OPÇÃO (1, 2 ou 3)"));
		
		if (opcao == 1) {
			ca.mostrar();
		
		} else if ( opcao == 2 ) {
			model.CompiladorProfessor.dadosProfessor();
			
		} else if (opcao == 3 ) {
			JOptionPane.showMessageDialog(null,  "operação finalizado");
			System.exit(0);
		}
		
	}

}
