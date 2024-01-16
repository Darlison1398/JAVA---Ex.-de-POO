package model;

import javax.swing.JOptionPane;

import helper.HelperGeral;

public class CompiladorAluno {
	
	public static void mostrar() {
		Aluno al = new Aluno();
		HelperGeral hg = new HelperGeral();
		
		al.setNome(JOptionPane.showInputDialog("Nome do Aluno"));
		al.setIdade(Integer.parseInt(JOptionPane.showInputDialog("Idade do aluno")));
		al.setSexo(JOptionPane.showInputDialog("SEXO").charAt(0));
		al.setRg(JOptionPane.showInputDialog("RG"));
		al.setCpf(JOptionPane.showInputDialog("Cpf"));
		al.setnMatricula(JOptionPane.showInputDialog("N° de matrícula"));
		al.setCurso(JOptionPane.showInputDialog("CURSO"));
		al.setModalidade(JOptionPane.showInputDialog("MODALIDADE (ead, presencial ou semipresencial)"));
		al.setFaculdade(JOptionPane.showInputDialog("Faculdade"));
		al.setSemestre(JOptionPane.showInputDialog("Semestre"));
		

	    if (!al.getNome().isEmpty() 
	    		&& al.getIdade() > 0 
	    		&& !Character.isWhitespace(al.getSexo()) 
	    		&& !al.getRg().isEmpty() 
	    		&& !al.getCpf().isEmpty()
	            && !al.getnMatricula().isEmpty() 
	            && !al.getCurso().isEmpty() 
	            && !al.getModalidade().isEmpty() 
	            && !al.getFaculdade().isEmpty()
	            && !al.getSemestre().isEmpty()
	            
	         ) {
	    	
	        hg.sucefull();
	        System.out.println(al.dadosPesso() + al.dadosAluno());
	    } else {
	        hg.error();
	    }
		
	}

}
