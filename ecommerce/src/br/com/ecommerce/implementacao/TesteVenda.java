package br.com.ecommerce.implementacao;

import javax.swing.JOptionPane;

import br.com.ecommerce.modelo.Cliente;
import br.com.ecommerce.modelo.Endereco;
import br.com.ecommerce.modelo.Produto;
import br.com.ecommerce.modelo.Venda;
import br.com.ecommerce.tela.Magica;

public class TesteVenda {

	// para simplicificar os comandos q se repetem foi criado a classe Magica - exemplos abaixo
	
	public static void main(String[] args) {
	
		
		Endereco endereco = new Endereco();
			endereco.setLogradouro(Magica.s("Logradouro"));
			endereco.setBairro(JOptionPane.showInputDialog("Bairro"));
			endereco.setCidade(JOptionPane.showInputDialog("Cidade"));
		
		Cliente cliente = new Cliente();
			cliente.setAll(
					Magica.i(Magica.s("ID Cliente")),
					JOptionPane.showInputDialog("Nome"),
					endereco
					);
			
		
		Produto produto = new Produto();
			produto.setAll(
					Integer.parseInt(JOptionPane.showInputDialog("ID Produto")),
					JOptionPane.showInputDialog("Descri��o"),
					Integer.parseInt(JOptionPane.showInputDialog("Quantidade")),
					Magica.f(Magica.s("Valor de Compra - fornecedor")),
					Float.parseFloat(JOptionPane.showInputDialog("Valor de Venda - cliente"))
					);		
						
		Venda venda = new Venda();
			venda.setAll(
					Integer.parseInt(JOptionPane.showInputDialog("Nota Fiscal")),
					JOptionPane.showInputDialog("Data"),
					Float.parseFloat(JOptionPane.showInputDialog("Total")),
					produto,
					cliente
					);
			System.out.println(venda.getAll());
	}

}
