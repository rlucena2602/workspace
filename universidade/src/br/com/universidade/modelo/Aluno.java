package br.com.universidade.modelo;

/*
 * Design Patterns (melhores praticas em projetos OO)
 * DTO (Data Transfer Object) - melhores praticas para modelos (Beans / JavaBeans / TO / model)
 * 1º : TODOS atributos devem ser private
 * 2º : cada atributo deve ter o seu metodo getter(output) e setter(input)
 * 3º : toda classe deve possuir no MINIMO 2 construtores (um vazio e outro cheio - com todos os atributos) 
 */

public class Aluno {

	private int rm;
	private String nome;
	private String email; // agora vai em Source - generate gettersand setters
	
	private Endereco endereco; // isso foi criado separado e incorporado aki. inclui no getall e setall e faz o source de novo
	
	public String getAll() {
		return
				"RM.......:" + rm + "\n" +
				"Nome.....:" + nome + "\n" +
				"Email....:" + email + "\n" +
				"Endereço.: " + endereco.getAll();
	}
	
	public void setAll (int p1 , String p2 , String p3 , Endereco p4) {
		rm = p1;
		nome = p2;
		email = p3;
		endereco = p4;
	}
	
	public int getRm() {
		return rm;
	}
	public void setRm(int rm) {
		this.rm = rm;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	
	
	
}
