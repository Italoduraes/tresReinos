
import java.time.LocalDate;


public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		 
	   Aluno a1= new Aluno("Italo duraes","21709010", "Masculino" , LocalDate.of(2017, 10, 18));
	   
	   Disciplina d1= new Disciplina("LpT1", "Ciencia da Computçao", 75);
		
		Professor p1= new Professor("Marcos", "123546","Mestrado", "123549687");
		
		Turma t1= new Turma("Turma A", "Marcos", "Lpt1");
		 
		 
		System.out.println(t1.getCodigo() + "\n" + t1.getProfessor() );
		System.out.println(d1.getNome());
		System.out.println(p1.getTitulacao());
		System.out.println(a1.getNome() + "\n" + a1.getDataComoString());

	}

}
