package plAula2;

import java.util.Date;

/**
      * Classe de modelagem conceitual
      * Autor: Prof. Ms. Paulo
      * Data 17/02/2025 
      */
public class Produto {
    //Atributos
	private int codigo;
	private String modelo;
	private float valorBase;
	private Date dataCadastro;
	private boolean situacaoCadastral;
	
	//M�todos
	public void incluir(int codigo, String modelo, float valorBase, Date dataCatastro,
			boolean situacaoCadastral) {
		if(codigo > 0) { 
			this.codigo = codigo;
		}else {
			System.err.println("C�digo inv�lido");
		}		
		this.modelo = modelo;
		this.valorBase= valorBase;
		this.dataCadastro = dataCadastro;
		this.situacaoCadastral = situacaoCadastral;		
	}
}