package br.com.universidade.modelo;

import br.com.universidade.padroes.PadraoFormacao;

public abstract class Formacao implements PadraoFormacao{

	// abstract: essa classe Formacao n�o pode ser instanciada. Evita erro na implementacao.
	
	// criado para mostrar como funciona o implements 
	// - qdo varios programadores criam um projeto q tem dependencia de nome de funcao (calcularMensalidade)
	//(polimorfismo)
	//	Overload (sobrecarga): os metodos est�o na mesma classe.
	//  Override (sobrescrita): metodos estao em classes diferentes.
	
	
	
	private float valor;
	private String descricao;
	private int duracao;
	
	
	public String getAll() {
		return
				"Valor.....: " + valor + "\n" +
				"Descri��o.: " + descricao + "\n" +
				"Dura��o...: " + duracao;
	}
		
	public void setAll(float valor, String descricao, int duracao) {
		this.valor = valor;
		this.descricao = descricao;
		this.duracao = duracao;
	}
	
	public Formacao() {
		super();
	}
	public Formacao(float valor, String descricao, int duracao) {
		super();
		this.valor = valor;
		this.descricao = descricao;
		this.duracao = duracao;
	}
	public float getValor() {
		return valor;
	}
	public void setValor(float valor) {
		this.valor = valor;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public int getDuracao() {
		return duracao;
	}
	public void setDuracao(int duracao) {
		this.duracao = duracao;
	}

	@Override
	public double calcularMensalidade(float fator) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void definirDuracao() {
		// TODO Auto-generated method stub
		
	}
	
	
}
