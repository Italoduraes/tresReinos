
public class Disciplina {
	//Atributos
	
	private String nome;
	private String curso;
	private int cargaHoraria;
	
	
	
	//Metodos Construtor
	
	public Disciplina(String nome, String curso, int cargaHoraria) {
		this.nome = nome;
		this.curso = curso;
		this.cargaHoraria = cargaHoraria;
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
		return cargaHoraria;
	}
	public void setCargaHoraria(int cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}
	
	
	
	
	

}
