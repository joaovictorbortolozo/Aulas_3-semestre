package pjAula1;

public class Teste {
	public static void main(String[] args) {
		ClasseCliente novo = new ClasseCliente();
		
		novo.codigo = 765;
		novo.faturamento = 654_987.98f;
		
		novo.incluir(765, 654_987.98f);
		
		System.out.println(novo.escreve());
	}

}
