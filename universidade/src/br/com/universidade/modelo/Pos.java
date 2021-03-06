package br.com.universidade.modelo;

import br.com.universidade.padroes.PadraoFormacao;

public class Pos extends Formacao implements PadraoFormacao{

	private String nivel;
	private boolean planoEstendido;
	
	String resposta = "N�o";
		
	public String getAll() {
		return
				super.getAll() + "\n" +
				"Nivel...........: " + nivel + "\n" +
				"Plano Estendido.: " + planoEstendido;
	}
	
	public void setAll(float valor, String descricao, int duracao, String nivel, boolean planoEstendido) {
		super.setAll(valor, descricao, duracao);
		this.nivel = nivel;
		this.planoEstendido = planoEstendido;
	}
	
	public Pos() {
		super();
	}

	public Pos(float valor, String descricao, int duracao, String nivel, boolean planoEstendido) {
		super(valor, descricao, duracao);
		this.nivel = nivel;
		this.planoEstendido = planoEstendido;
	}

	public String getNivel() {
		return nivel;
	}
	public void setNivel(String nivel) {
		this.nivel = nivel;
	}
	public boolean isPlanoEstendido() {
		return planoEstendido;
	}
	public void setPlanoEstendido(boolean planoEstendido) {
		if (planoEstendido=true)
		this.planoEstendido = planoEstendido;
		resposta = "Sim";
	}

	@Override
	public double calcularMensalidade(float fator) {
		
		return getValor() / 18 * fator;
	}

	@Override
	public void definirDuracao() {
		setDuracao(18);
		
	}
	
	
}
