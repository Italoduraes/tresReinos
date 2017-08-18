
public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//alunos
		
		Aluno a1= new Aluno("Italo duraes", "2179010" , 20 , "Ciência da Computação" , "Matutino" , "Masculino");
		
		//Disciplina
		
		Disciplina d1= new Disciplina("Algebra", "Ciência da Computação", 75);
		
		
		System.out.println(a1.getNome());
		System.out.println(d1.getCurso());
		
		System.out.println(d1.getNome());
		
		System.out.println(a1.imprimirAluno());

	}

}
