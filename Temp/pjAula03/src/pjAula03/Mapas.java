package pjAula03;

import java.util.HashMap;
import java.util.Map;

public class Mapas {
	public static void main(String[] args) {
	    //Declarando um mapa
		Map<Integer, String>mapValores = new HashMap<Integer, String>();
		
		mapValores.put(1, "Lápis");
		mapValores.put(2, "Caneta");
		
        for (int i=0; i<1_000_000; i++) {
        	mapValores.put(i, "Objeto" + i);
        }
       
		long inicio = System.currentTimeMillis();
		if(mapValores.containsKey(956789)) {
			System.out.println("Localizado");
		}
		System.out.println("Tempo "+(System.currentTimeMillis() - inicio));
		
		//inicio = System.currentTimeMillis();
		//mapValores = new HashMap<Integer, String>();
		//System.out.println("Tempo Remoção "+(System.currentTimeMillis() - inicio));
		
		/*
		for(Integer chave : mapValores.keySet()) {
			System.out.println(mapValores.get(chave));
		}*/
		
		System.out.println(mapValores.values());
	}
}
