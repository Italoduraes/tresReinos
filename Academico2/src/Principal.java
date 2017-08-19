
import java.util.Calendar;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Calendar DataNascimento = Calendar.getInstance();
		DataNascimento.set(Calendar.YEAR, 2017);
		DataNascimento.set(Calendar.MONTH, Calendar.AUGUST);
		DataNascimento.set(Calendar.DAY_OF_MONTH, 15 );
		 
	   Aluno a1= new Aluno("Italo duraes","21709010", "Masculino" , DataNascimento);
	   
	   Disciplina d1= new Disciplina("LpT1", "Ciencia da Computçao", 75);
		
		Professor p1= new Professor("Marcos", "123546","Mestrado", "123549687");
		
		Turma t1= new Turma("123546", "Marcos", "Lpt1");
		
		 
		System.out.println(t1.getProfessor() );
		System.out.println(d1.getNome());
		System.out.println(p1.getNome());
		System.out.println(a1.getNome() + "\n" + a1.getDataComoString());

	}

}
