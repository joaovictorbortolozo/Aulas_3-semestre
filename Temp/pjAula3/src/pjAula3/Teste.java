package pjAula3;

import java.text.SimpleDateFormat;

public class Teste {
    public static void main(String[] args) {
		Equipamento eqp = new Equipamento();
		
		System.out.println(eqp.getCodigo());
		System.out.println(eqp.getDescricao());
		System.out.println(eqp.getValor()); 
		System.out.println(eqp.getDataEquipamento());
		System.out.println(eqp.isAtivo());
		
		Equipamento computador = new Equipamento(756, "Notebook Ascer",3_500);
		
		SimpleDateFormat data = new SimpleDateFormat("dd/MM/YYYY");
		
		System.out.println(computador.getCodigo());
		System.out.println(computador.getDescricao());
		System.out.println(computador.getValor());
		System.out.println(data.format(computador.getDataEquipamento()));
		System.out.println(computador.isAtivo());
	}
}				