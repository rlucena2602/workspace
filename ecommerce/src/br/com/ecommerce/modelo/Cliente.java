package br.com.ecommerce.modelo;

public class Cliente {
	
	private int id;
	private String nome;
	private Endereco endereco;
	
	
	
	public Cliente(int id, String nome, Endereco endereco) {
		super();
		this.id = id;
		this.nome = nome;
		this.endereco = endereco;
	}

	public Cliente() {
	}
		
	public String getAll() {
		return
				"ID.......:" + id + "\n" +
				"Nome.....:" + nome + "\n" +
				".....Endere�o....: \n" + endereco.getAll();
	}
	
	public void setAll (int id , String nome , Endereco endereco) {
		this.id = id;
		this.nome = nome;
		this.endereco = endereco;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	
	
}
