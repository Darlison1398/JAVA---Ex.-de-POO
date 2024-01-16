package model;

public class Pessoa {
	private String nome;
	private int idade;
	private char sexo;
	private String rg;
	private String cpf;
	
	
	public Pessoa() {
	}
	
	

	public String getNome() {
		return nome;
	}



	public void setNome(String nome) {
		this.nome = nome;
	}



	public int getIdade() {
		return idade;
	}



	public void setIdade(int idade) {
		this.idade = idade;
	}



	public char getSexo() {
		return sexo;
	}



	public void setSexo(char sexo) {
		this.sexo = sexo;
	}



	public String getRg() {
		return rg;
	}



	public void setRg(String rg) {
		this.rg = rg;
	}



	public String getCpf() {
		return cpf;
	}



	public void setCpf(String cpf) {
		this.cpf = cpf;
	}



	public String dadosPesso() {
		return "NOME: " + nome + "\nIDADE: " + idade + "\nSEXO: " + sexo + 
				"\nRG: " + rg + "\nCPF : " + cpf;
	}
	
}
