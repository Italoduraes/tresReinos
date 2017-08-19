import java.util.ArrayList;

public class Turma {
	
	//Atributos
	
	private String codigo;
	private String professor;
	private String disciplina;
	private ArrayList<Aluno> alunos;

	
	// Metodos construtor
	
	public Turma(String codigo, String professor, String disciplina) {
		this.codigo = codigo;
		this.professor = professor;
		this.disciplina = disciplina;
		this.alunos = new ArrayList<Aluno>();
	}
	
	
	// Metodos get e set 
	
	public ArrayList<Aluno> getAlunos() {
		return alunos;
	}
	public void setAlunos(ArrayList<Aluno> alunos) {
		this.alunos = alunos;
	}

	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public String getProfessor() {
		return professor;
	}
	public void setProfessor(String professor) {
		this.professor = professor;
	}
	public String getDisciplina() {
		return disciplina;
	}
	public void setDisciplina(String disciplina) {
		this.disciplina = disciplina;
	}
	
	
	// Metodo que adiciona 1 aluno a turma
	
	public void adicionarAluno(Aluno aluno){
		this.alunos.add(aluno);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
