import java.util.ArrayList;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub]
		
		//Instanciar os 3 governantes
		
		Governante montante = new Governante("Montante", 5000, 4000, 20000, 0, 20000, 40000);
		
		Governante lenha = new Governante("Lenha", 500, 25000, 10000, 0, 0, 100000);
		
		Governante clareza = new Governante("Clareza", 200, 7000, 120000, 5000, 10000, 0);
		
		
		// Lista de governantes
		
		
		ArrayList<Governante> governantes = new ArrayList<Governante>();
		governantes.add(montante);
		governantes.add(lenha);
		governantes.add(clareza);
		
		
		
	//instanciar a classe solução
		
		Solução s = new Solução();
		
		
		// Imprimir resultado questao A
		System.out.println(s.getQtdetotal("ouro", governantes));
		System.out.println(s.getQtdetotal("madeira", governantes));
		System.out.println(s.getQtdetotal("agua", governantes) + "\n");
		
		
		// imprimir resultado questao B
		
		System.out.println(s.getQtdeFicarVivo("Montante", governantes));
		System.out.println(s.getQtdeFicarVivo("Lenha", governantes));
		System.out.println(s.getQtdeFicarVivo("Clareza", governantes) + "\n");
		
		
		//imprimir resultado questao C
		
		System.out.println("Montante: " + s.calcularQtdeViagens("Montante", governantes));
		System.out.println("Lenha: " + s.calcularQtdeViagens("Lenha", governantes));
		System.out.println("Clareza" + s.calcularQtdeViagens("Clareza", governantes));
		
		
		
		
		
		
		
		
		
		
		

	}

}
