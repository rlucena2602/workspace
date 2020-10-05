package br.com.universidade.modelo;

/*
 * Design Patterns (melhores praticas em projetos OO)
 * DTO (Data Transfer Object) - melhores praticas para modelos (Beans / JavaBeans / TO / model)
 * 1� sugest�o: TODOS atributos devem ser private
 * 2� sugest�o: cada atributo deve ter o seu metodo getter(output) e setter(input)
 * 3� sugest�o:  
 */

public class AlunoAntigo {

	private int rm;
	private String nome;
	private String email;
	
	public String exibirTudo() {
		return 
				"RM............: " + rm + "\n" +
				"Nome do aluno : " + nome + "\n" +
				"Email...: " + email; 
	}

		public void preencherEmail(String pEmail) {
		email = pEmail;
	}
	
	public void preencherNome(String pNome) {
		nome = pNome;
	}
	
	public void preencherRm(int pRm) {
		rm = pRm;
	}	
		
}
