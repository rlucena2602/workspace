package br.com.lojauati.teste;

import br.com.lojauati.modelo.Televisao;

public class TesteTelevisao {

	public static void main(String[] args) {
		Televisao tv = new Televisao();
		tv.preencherCanal(50);
		System.out.println(tv.exibirTudo());
		tv.aVol();
		tv.aVol();
		tv.aVol();
		System.out.println(tv.exibirTudo());
		tv.desligar();
		tv.dVol();
		System.out.println(tv.exibirTudo());
	}

}
