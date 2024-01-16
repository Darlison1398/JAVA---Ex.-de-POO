package model;

public class Aluno extends Pessoa{
	
	private String nMatricula;
	private String curso;
	private String semestre;
	private String faculdade;
	private String modalidade;
	
	//private Pessoa pessoa;
	
	public Aluno() {}
	


	public String getnMatricula() {
		return nMatricula;
	}

	public void setnMatricula(String nMatricula) {
		this.nMatricula = nMatricula;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	public String getSemestre() {
		return semestre;
	}

	public void setSemestre(String semestre) {
		this.semestre = semestre;
	}

	public String getFaculdade() {
		return faculdade;
	}

	public void setFaculdade(String faculdade) {
		this.faculdade = faculdade;
	}

	public String getModalidade() {
		return modalidade;
	}

	public void setModalidade(String modalidade) {
		this.modalidade = modalidade;
	}
	
	/*public Pessoa getPessoa() {
		return pessoa;
	}




	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}*/




	public String dadosAluno() {
		return "\nNÚMERO DE MATRÍCULA: " + nMatricula + "\nCURSO: " + curso + 
				"\nSEMESTRE: " + semestre + "\nFACULDADE: " + faculdade + 
				"\nMODALIDADE: " + modalidade;
	}
	
	
	
	

}
