package decisao;

import javax.swing.JOptionPane;

public class DecisaoSimples {
	/*
	 * Identificadores = nomes (classe, variavel)
	 * 		Regras:
	 * 			N�o pode come�ar com numero
	 * 			N�o pode conter caracteres especiais, exceto underline 
	 * 			N�o usar palavras reservadas ex.: main else while class int public	
	 * 		Padr�es:
	 * 			variavel com nome passivel de indentifica��o e q fa�a sentido no codigo
	 * 			sempre comeca com letra minuscula e se for 
	 * 				composta coloca maiuscula na segunda nomeCliente ou nome_cliente	
	 */

	public static void main(String[] args) {
		String nome = JOptionPane.showInputDialog("Digite o nome do aluno").toUpperCase();
		float nota1 = Float.parseFloat(JOptionPane.showInputDialog("Digite a nota 1"));
		float nota2 = Float.parseFloat(JOptionPane.showInputDialog("Digite a nota 2"));	
		float media = (nota1 + nota2) /2;
		System.out.println("Aluno: " +nome + " sua m�dia foi: " + media);
		if (media >= 6) {
			System.out.println("Parab�ns " +nome +" voc� est� aprovado");			
		}
		if (media <4) {
			System.out.println("Sr. " +nome +" voc� se ferrou e repetiu de ano");
		}
		
		if (media >=4 && media <6) {
			System.out.println("Sr. " +nome +" voc� teve sorte e resta uma chance");
		}
		   
		// and => &&
		// or  => ||
		
		
		
	}

}
