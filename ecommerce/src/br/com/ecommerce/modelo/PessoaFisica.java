package br.com.ecommerce.modelo;

public class PessoaFisica extends Cliente {

	private String cpf;
	private String rg;
	private String nascimento;
	
	public void setAll(int id, String nome, Endereco endereco, String cpf, String rg, String nascimento) {
		super.setAll(id, nome, endereco);
		this.cpf = cpf;
		this.rg = rg;
		this.nascimento = nascimento;
	}
	
	public String getAll() {
		return 
				super.getAll() + "\n" +
				"CPF........:" + cpf + "\n" +
				"RG.........:" + rg + "\n" +
				"Nascimento.: " + nascimento;
 	}
	
	public PessoaFisica() {
		super();
	}
	public PessoaFisica(int id, String nome, Endereco endereco, String cpf, String rg, String nascimento) {
		super(id, nome, endereco);
		this.cpf = cpf;
		this.rg = rg;
		this.nascimento = nascimento;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getRg() {
		return rg;
	}
	public void setRg(String rg) {
		this.rg = rg;
	}
	public String getNascimento() {
		return nascimento;
	}
	public void setNascimento(String nascimento) {
		this.nascimento = nascimento;
	}
	
	
}
