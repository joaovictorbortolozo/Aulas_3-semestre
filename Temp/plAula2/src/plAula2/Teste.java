package plAula2;

import java.util.Date;

public class Teste {
    public static void main(String[] args) {
	 int resultado = 5 + 7 + 72;
	 System.out.println("O resultado é  " + (resultado%7));
	 System.out.println(1 + 1 + 1);
	 
	 //Criar uma instancia de produto
	 Produto produto = new Produto();
	 
	 produto.incluir(14,"Caneta Vermelha",2.5f,new Date(),false);
	}
}
