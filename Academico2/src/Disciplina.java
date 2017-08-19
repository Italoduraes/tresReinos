
public class Disciplina {
	
	//Atributos 
	
	private String nome;
	private String curso;
	private int CargaHoraria;
	
	
	
	
	
	// Metodos construtor
	
	public Disciplina(String nome, String curso, int cargaHoraria) {
		this.nome = nome;
		this.curso = curso;
		CargaHoraria = cargaHoraria;
	}
	
	
	// Metodos get e set 
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCurso() {
		return curso;
	}
	public void setCurso(String curso) {
		this.curso = curso;
	}
	public int getCargaHoraria() {
		return CargaHoraria;
	}
	public void setCargaHoraria(int cargaHoraria) {
		CargaHoraria = cargaHoraria;
	}
	
	

}
