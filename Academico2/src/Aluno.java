import java.util.Calendar;

public class Aluno {
	
	//Atributo
	
	private String nome;
	private String RA;
	private String sexo;
	private Calendar dataNascimento;
	
	

	// Metodos construtor
	
	public Aluno(String nome, String rA, String sexo, Calendar dataNascimento) {
		this.nome = nome;
		RA = rA;
		this.sexo = sexo;
		this.dataNascimento = dataNascimento;
	}
	
	
	// Metodos get e set 
	
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getRA() {
		return RA;
	}
	public void setRA(String rA) {
		RA = rA;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public Calendar getdataNascimento() {
		return dataNascimento;
	}
	public void setData(Calendar dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	// 
		public String getDataComoString(){
			return this.dataNascimento.get(Calendar.DAY_OF_MONTH ) + "/" +
		           this.dataNascimento.get(Calendar.MONTH) + "/" +
					this.dataNascimento.get(Calendar.YEAR);
		}
	
	

}
