package repeticao;

import javax.swing.JOptionPane;

public class ExemploWhile {

	public static void main(String[] args) {
		String email = JOptionPane.showInputDialog("Insira o email").toLowerCase();
		while (email.contains("@")==false) {  // email.indexOf("@")<2  serve para contar posicoes o @ deve estar depois da 3
			email = JOptionPane.showInputDialog("Insira o email corretamente").toLowerCase();
		}
		System.out.println(email);
	
		String nome = JOptionPane.showInputDialog("Insira o nome").toUpperCase();
	
		while (nome.length() <5 || nome.length() >16 ) { 
			nome = JOptionPane.showInputDialog("Nome invalido, insira o nome corretamente").toUpperCase();
		}
		System.out.println(nome);

		
	}

}
