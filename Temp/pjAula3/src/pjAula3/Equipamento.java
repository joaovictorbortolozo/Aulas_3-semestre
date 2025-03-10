package pjAula3;

import java.util.Date;

public class Equipamento {
    //Atributos
	private int codigo;
	private String descricao;
	private float valor;
	private Date dataEquipamento;
	private boolean ativo;
	
	//Método construtor
	public Equipamento() {
    } 
	
	public Equipamento(int codigo, String descricao,float valor) {
		this.codigo = codigo;
		this.descricao = descricao;
		this.valor = valor;
		this.dataEquipamento = new Date();
		this.ativo  = true;
	}
	

	//Getters and Setters (CTRL + 3 --> GGAS)
	//Métodos
	public int getCodigo() {
	return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public float getValor() {
		return valor;
	}
	public void setValor(float valor) {
		this.valor = valor;
	}
	public Date getDataEquipamento() {
		return dataEquipamento;
	}
	public void setDataEquipamento(Date dataEquipamento) {
		this.dataEquipamento = dataEquipamento;
	}
	public boolean isAtivo() {
		return ativo;
	}
	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
	}
	
}
