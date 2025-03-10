package pjAula03;

import java.util.ArrayList;
import java.util.List;

public class Listado {
	public static void main(String[] args) {
		//Declarando Lista
		List<String> listTermos = new ArrayList<String>();
		
		//Checar quantidade de elementos
		System.out.println("Tamannho " + listTermos.size());
		System.out.println(listTermos.isEmpty());
		
		//Inserção de Valores Exemplo
		for(int i=0; i<1_000_000;i++) {
			listTermos.add("Elemento " +i);
		}
		
		long inicio = System.currentTimeMillis();
		for(int i=0; i<1_000_000; i++) {
			if(listTermos.get(i).contentEquals("Elementos 975631")) {
				System.out.println("Localizado 1");
				break;
			}
		}
		System.out.println("Tempo " + (System.currentTimeMillis()- inicio));
		
		//melhoria 1
		inicio = System.currentTimeMillis();
		for(String s : listTermos) {
			if(s.contentEquals("Elementos 975631")) {
				System.out.println("localizado 2");
				break;
				
			}
		}
		System.out.println("Tempo " + (System.currentTimeMillis()- inicio));
		
		//melhoria 2
		inicio = System.currentTimeMillis();
	    if(listTermos.contains("Elementos 975631")) {
	    	System.out.println("Localizado 3");
	    }
	    System.out.println("Tempo " + (System.currentTimeMillis()- inicio));
	    
	    //melhoria 3
	  	inicio = System.currentTimeMillis();
	  	if(listTermos.contains("Elementos 975631")) {
	  		System.out.println("Localizado 3");
	  	}
		System.out.println("Tempo " + (System.currentTimeMillis()- inicio));
	    
	  	//melhoria 4
	    inicio = System.currentTimeMillis();
	  	if(listTermos.stream().anyMatch(i -> i.equals("Elementos 975631"))) {
	  	    	System.out.println("Localizado 4");
	  	  } 
	  	System.out.println("Tempo " + (System.currentTimeMillis()- inicio));
	  	
	  	//Remoção usando for
	  	inicio = System.currentTimeMillis();
	  	for(int i=0; i<1_000_000; i++) {
	  		if(listTermos.get(i).equals("Elementos 975631")) {
	  			listTermos.remove(i);
	  			break;
	  		}
	  	}
	  	System.out.println("Remoção Tempo " + (System.currentTimeMillis()- inicio));
	  	
	  	inicio = System.currentTimeMillis();
	  	listTermos.removeIf(i -> i.equals("Elementos 975631"));
	  	System.out.println("remoção tempo " + (System.currentTimeMillis()- inicio));
	  	
	  	inicio = System.currentTimeMillis();
	  	listTermos = new ArrayList<String>();
	  	System.out.println("remoção total  " + (System.currentTimeMillis()- inicio)); 
	}
}
