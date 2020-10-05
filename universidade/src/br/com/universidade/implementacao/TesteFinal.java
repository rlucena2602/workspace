package br.com.universidade.implementacao;

import br.com.universidade.modelo.Formacao;
import br.com.universidade.modelo.Medio;

// criado para mostrar como funciona o implements (polimorfismo)
// - qdo varios programadores criam um projeto q tem dependencia de nome de funcao (calcularMensalidade)

public class TesteFinal {

	public static void main(String[] args) {
		Formacao f = new Medio();
		f.setValor(5000);
		f.definirDuracao();
		System.out.println(f.calcularMensalidade((float) 0.05));
		System.out.println(f.getDuracao());

	}

}
