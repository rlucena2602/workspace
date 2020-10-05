package br.com.ecommerce.implementacao;

import br.com.ecommerce.modelo.Cliente;
import br.com.ecommerce.modelo.Endereco;
import br.com.ecommerce.modelo.Produto;
import br.com.ecommerce.modelo.Venda;
import br.com.ecommerce.tela.Magica;

public class ImplementarVendaConstrutor {

	public static void main(String[] args) {
		
		// esse cria objeto          esse instancia o objeto
		Venda objeto           =         new Venda(         // ctrl + espaco mostra as opcoes para preencher
				Magica.i("Nota Fiscal"),
				Magica.s("Data"),
				Magica.f("Total"),
					new Produto(
							Magica.i("ID"),
							Magica.s("Descrição"),
							Magica.i("Quantidade"),
							Magica.f("Valor de Compra"),
							Magica.f("Valor de Venda")	
							),
						new Cliente(
							Magica.i("ID Cliente"),
							Magica.s("Nome Cliente"),
								new Endereco(
									Magica.s("Logradouro"),
									Magica.s("Bairro"),
									Magica.s("Cidade"),
									Magica.s("Estado"),
									Magica.s("CEP"),
									Magica.s("Numero"),
									Magica.s("Complemento")
										)
						)
				);
		System.out.println(objeto.getAll());
	}

}
