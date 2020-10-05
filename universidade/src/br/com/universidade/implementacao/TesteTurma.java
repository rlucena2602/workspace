package br.com.universidade.implementacao;

import br.com.universidade.modelo.Bacharelado;
import br.com.universidade.modelo.Formacao;
import br.com.universidade.modelo.Medio;
import br.com.universidade.modelo.Pos;
import br.com.universidade.tela.Magica;

public class TesteTurma {

	public static void main(String[] args) {
		
		char opcao = Magica.s("Digite\n<1> Médio\n<2> Bacharelado\n<3> Pós").charAt(0);
		
		Formacao formacao = null;
		
		if (opcao=='1') {
			
			formacao = new Medio(
					Magica.f("Valor"),
					Magica.s("Descrição"),
					Magica.i("Duração"),
					Magica.i("Tipo")
					);
			
		} 
		else if (opcao=='2') {
			
			formacao = new Bacharelado(
					Magica.f("Valor"),
					Magica.s("Descrição"),
					Magica.i("Duração"),
					Magica.s("Projeto de Conclusão"),
					Magica.i("Carga Horaria Estagio")
					);
			
		}
		else if (opcao=='3') {
			
			formacao = new Pos(
					
					Magica.f("Valor"),
					Magica.s("Descrição"),
					Magica.i("Duração"),
					Magica.s("Nivel"),
					Boolean.parseBoolean(Magica.s("Estendido?"))
					);
			
		} 
		else {
			System.out.println("Opção Invalida");
		}
		
		System.out.println(formacao.getAll());
		
		
		
	}
}