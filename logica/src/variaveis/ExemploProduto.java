package variaveis;

import javax.swing.JOptionPane;

public class ExemploProduto {

	public static void main(String[] args) {

		String NomeProduto = ""; 
		int qtde = 0; 
		double valor = 0;
				
		NomeProduto = JOptionPane.showInputDialog("Digite o nome do produto"); 
		qtde = Integer.parseInt(JOptionPane.showInputDialog("Digite a qtde desejada"));
		valor = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor"));
		
		double total = qtde * valor;
		double desc = total * 0.9;
		
		System.out.println("Nome do Produto..: " +NomeProduto); 
		System.out.println("Digite a qtde....: " +qtde);
		System.out.println("Insira o valor...: " +valor);
		System.out.print("O produto: "  +NomeProduto); 
		System.out.print(" deu um total de: R$ " +total);
		System.out.println("\nCom 10% de desc: R$ " +desc); // o \n faz o comando pulando uma linha pq o print ln faz o comando depois dos dados e naum antes
	     	
		
	}

}
