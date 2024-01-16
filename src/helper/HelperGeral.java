package helper;

import javax.swing.JOptionPane;

public class HelperGeral {
	
	public static void sucefull() {
		JOptionPane.showMessageDialog(null, "Cadastro realizado com sucesso!!!");
	}
	
	public static void error() {
		JOptionPane.showMessageDialog(null, "Cadastro não realizado!!!");
	}
	
	public static void consert() {
		JOptionPane.showMessageDialog(null, "Está faltando informações.");
	}

}
