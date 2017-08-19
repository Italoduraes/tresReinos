
import java.time.LocalDate;





public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//Instanciar objetos da classe Aluno
		
				Aluno a1= new Aluno("Italo duraes","21709010", "Masculino" , LocalDate.of(2017, 10, 18));
				   Aluno a2= new Aluno("Maria", "416656", "Feminino", LocalDate.of(2015, 1, 15));
				   Aluno a3=new Aluno("João Paulo", "25469325", "Masculino", LocalDate.of(2013, 8, 5));
				   Aluno a4=new Aluno("Laissa", "56982145", "Feminino", LocalDate.of(2014, 1, 20));
				   Aluno a5=new Aluno("Karine", "1452369", "Faminino", LocalDate.of(2015, 7, 25));
				   Aluno a6=new Aluno("Jordy", "74582136", "Masculino", LocalDate.of(2017, 3, 19));
	   

	   
	   Disciplina d1= new Disciplina("LpT1", "Ciencia da Computçao", 75);
		
		Professor p1= new Professor("Marcos", "123546","Mestrado", "123549687");
		
		Turma t1= new Turma("Turma A", "Marcos", "Lpt1");
		 
		
		// Adicionar alunos-A1 em turma-T1
		
		t1.adicionarAluno(a1);
		t1.adicionarAluno(a2); 
		t1.adicionarAluno(a3);
		t1.adicionarAluno(a4);
		t1.adicionarAluno(a5);
		t1.adicionarAluno(a6);
		
		
		//Imprimir 
		
		
		System.out.println(t1.getCodigo() + "\n" + t1.getProfessor() );
		System.out.println(d1.getNome());
		System.out.println(p1.getTitulacao());
		System.out.println(a1.getNome() + "\n" + a1.getDataComoString()+ "\n");

		System.out.println(t1.getAlunos().get(0).getNome());
		System.out.println(t1.getAlunos().get(1).getNome()+ "\n");
		
//		//Navegar pela estrutura do ArrayList de alunos que está dentro da turma 
//		
//	
//		for (int i = 0; i < t1.getAlunos().size(); i++) {
//			System.out.println(t1.getAlunos().get(i).getNome());
//		}
//		
		
		System.out.println(t1.listarAlunos());
		
		// Determinar mençao e aprovaçao com base na nota
		
		Calculadora cal= new Calculadora();
		
		String mencao =cal.CalcularMencao(6.7);
		
		System.out.println("Mencao: " + mencao + " Resultado: " + cal.CalcularResultado(mencao));
	
	
	}
	
	}
