package br.com.universidade.implementacao;

import br.com.universidade.modelo.AlunoAntigo;

public class TesteUniversidade {

	public static void main(String[] args) {
		AlunoAntigo uni = new AlunoAntigo();
		uni.preencherRm(10001);
		uni.preencherNome("Rafael Lucena");
		uni.preencherEmail("rcl@bol.com.br");
		System.out.println(uni.exibirTudo());
				
	}

}
