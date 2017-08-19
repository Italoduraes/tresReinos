
public class Professor {
	
	//Atributos
	
	private String nome;
	private String matricula;
	private String titulacao;
	private String CPF;
	
	
	
	
	
	
	// Metodos construtor
	
	public Professor(String nome, String matricula, String titulacao, String cPF) {
		this.nome = nome;
		this.matricula = matricula;
		this.titulacao = titulacao;
		CPF = cPF;
	}
	
	
	// Metodos get e set 
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public String getTitulacao() {
		return titulacao;
	}
	public void setTitulacao(String titulacao) {
		this.titulacao = titulacao;
	}
	public String getCPF() {
		return CPF;
	}
	public void setCPF(String cPF) {
		CPF = cPF;
	}
	
		
	

}
