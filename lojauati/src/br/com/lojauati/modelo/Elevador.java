package br.com.lojauati.modelo;

public class Elevador {

	// abaixo saum atributos	
	private int qtdePessoas;
	private int capacidadePessoas;
	private int andarAtual;
	private int maiorAndar;
	private int menorAndar;
	
	// manipulando o construtor - isso foi no dia seguinte desse programa
	// fixamos a necessidade de entrar com essas duas vars
	public Elevador(int cp, int ma) {
		capacidadePessoas = cp;
		maiorAndar = ma;
	}
	
	
	//lembrando q ele inicia a programa��o de baixo para cima
	
	// Sintaxe para criar m�todo:
	//		<modificador> (tipo_retorno> <nome> (<tipo parm> <nome parm>)
	
	public String exibirTudo() {
		return
				"Capacidade m�xima.....: " + capacidadePessoas + "\n" +
				"Qtde de pessoas atual.: " + qtdePessoas + "\n" +
				"Andar atual...........: " + andarAtual + "\n" +
				"Maior andar...........: " + maiorAndar + "\n" +
				"Menor andar...........: " + menorAndar;
	
	}
	
		public void sair(int nPessoas) {
		if (nPessoas <= qtdePessoas) {
		qtdePessoas = qtdePessoas - nPessoas;
		}
	}
	
	public void entrar(int nPessoas) {
		int total = qtdePessoas + nPessoas;
		if (total <= capacidadePessoas) {
		qtdePessoas = qtdePessoas + nPessoas;
		}
	}
	
	public void descer() {
		if (andarAtual > menorAndar) {
		andarAtual = andarAtual - 1;
		}
	}
	
	public void subir() {
		if (andarAtual < maiorAndar) {
		andarAtual = andarAtual + 1;
		}
	}
		
	public void preencherCapacidadePessoas(int nPessoas) {
		if (nPessoas > 0) {
			capacidadePessoas = nPessoas;
		}
	}
	
	public void preencherMenorAndar(int pAndar) {
		if (pAndar < maiorAndar) {
			menorAndar = pAndar;
		}
	}
		
	public void preencherMaiorAndar(int pAndar) {
		if (pAndar > menorAndar) {
			maiorAndar = pAndar;
		}
	}
	
	
	
	
	
	
	
	
	
}
