import java.util.ArrayList;

public class Solução {
	
	// Metodo para questao A
	
	public int getQtdetotal(String recurso, ArrayList<Governante> governantes){
		
		int resultado = 0 ;
		
		//Testa o tipo de recurso
		
		switch (recurso) {
		case "ouro":
			for ( int i=0; i< governantes.size(); i++){
				resultado =resultado + governantes.get(i).getOuro();
			}
			return resultado;

		case "madeira":
		       for (int j=0; j< governantes.size(); j++){
		    	   resultado = resultado + governantes.get(j).getMadeira();
		       }
			return resultado;
			
		case "agua":
		
		     for (int mamae= 0 ; mamae< governantes.size(); mamae++){
		    	 resultado = resultado + governantes.get(mamae).getAgua();
		     }
			return resultado;
			
			
		default:
			return resultado;
		}
		
		
		
		
		
		
	}
	
	 //Metodo para resposta da questao B
       public String getQtdeFicarVivo(String nomeGovernante, ArrayList<Governante> governantes){
    	   //vou buscar o governante na lista com base no nome 
    	   
    	   String resultado = "";
    	   
    	   for (int i=0; i < governantes.size(); i++){
    		   if(governantes.get(i).getNome().equals(nomeGovernante)){
    			   resultado = "Pedido do governante: " + nomeGovernante + "\n" + 
    		                   "Ouro: " + governantes.get(1).getPedidoOuro() + "\n" +
    					       "Madeira: " + governantes.get(1).getMadeira() + "\n" +
    		                   "Água: " + governantes.get(1).getAgua() + "\n" ;
    		   }
    	   }
    	   
    	   return resultado;
       }
       
       
       
       
       
       
       
       // Metodo para reposta da questao C
       
       public int calcularQtdeViagens(String nomeGovernante, ArrayList<Governante> governantes){
    	   
    	   int resultado = 0;
    	   
    	   //Buscar o governante na lista com base nome 
    	   
    	   for(int i=0; i< governantes.size(); i++){
    		   if (governantes.get(i).getNome().equals(nomeGovernante)){
    			   resultado = (governantes.get(i).getPedidoOuro() / 50) +
    					   (governantes.get(i).getPedidoMadeira() / 100) + 
    					   (governantes.get(i).getPedidoAgua() / 1000);
    		   
    		   
    		   }
    			   
    	   }
    	   return resultado;
       }
    

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
         
      





























