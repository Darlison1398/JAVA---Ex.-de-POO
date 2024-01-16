package model;

public class Professor extends Pessoa {
	
	private String nTrabalho;
	private String materia;
	private String semestre;
	private String faculdade;
	private String modalidade;
	
	public Professor() {
	}

	public String getnTrabalho() {
		return nTrabalho;
	}

	public void setnTrabalho(String nTrabalho) {
		this.nTrabalho = nTrabalho;
	}

	public String getMateria() {
		return materia;
	}

	public void setMateria(String materia) {
		this.materia = materia;
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
	
	public String dadosProfessor() {
		return "\nREGISTRO DO PROFESSOR: " + nTrabalho + "\nMATÉRIA: " + materia + 
				"\nSEMESTRE: " + semestre + "\nFACULDADE: " + faculdade + "\nMODALIDADE: "  + modalidade;
	}
	
	

}
