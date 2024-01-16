package model;

import javax.swing.JOptionPane;

import helper.HelperGeral;

public class CompiladorProfessor {

	public static void dadosProfessor() {
		Professor pro = new Professor();
		HelperGeral hg = new HelperGeral();
		
		pro.setNome(JOptionPane.showInputDialog("Nome do professor"));
		pro.setIdade(Integer.parseInt(JOptionPane.showInputDialog("Idade do professor")));
		pro.setSexo(JOptionPane.showInputDialog("SEXO").charAt(0));;
		pro.setRg(JOptionPane.showInputDialog("RG"));
		pro.setCpf(JOptionPane.showInputDialog("Cpf"));
		
		pro.setnTrabalho(JOptionPane.showInputDialog("NÚMERO DE REGISTRO"));
		pro.setMateria(JOptionPane.showInputDialog("MATÉRIA"));
		pro.setFaculdade(JOptionPane.showInputDialog("FACULDADE QUE O PORFESSOR TRABALHA"));
		pro.setSemestre(JOptionPane.showInputDialog("SEMESTRE QUE O PROFESSOR LECIONA"));
		pro.setModalidade(JOptionPane.showInputDialog("MODALIDADE (presencial, ead, híbrido)"));
		
	    if (!pro.getNome().isEmpty() 
	    		&& pro.getIdade() > 0 
	    		&& !Character.isWhitespace(pro.getSexo()) 
	    		&& !pro.getRg().isEmpty() 
	    		&& !pro.getCpf().isEmpty()
	            && !pro.getnTrabalho().isEmpty() 
	            && !pro.getMateria().isEmpty() 
	            && !pro.getModalidade().isEmpty() 
	            && !pro.getFaculdade().isEmpty()
	            && !pro.getSemestre().isEmpty()
	            
	         ) {
	    	
	        hg.sucefull();
	        System.out.println(pro.dadosPesso() + pro.dadosProfessor());
	    } else {
	        hg.error();
	    }
		
		

		
		
	}
}
