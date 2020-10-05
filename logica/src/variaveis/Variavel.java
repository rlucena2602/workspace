package variaveis;

import javax.swing.JOptionPane;

public class Variavel {
	
	// Variavel (primeira letra maiuscula) eh um espa�o temporario na memoria RAM
	// onde vc armazena apenas UM dado
	
	//se naum reconhecer a classe, teclar ctrl+shift+O
	
	public static void main(String[] args) {
		// Sintaxe para criar variaveis
		//<tipo do dado> <nome da variavel>;
		
	/* 
	 * Tipos de dados:
	 * A) Numerico (int inteiro / double divisivel usa ,): o dado q sera utilizado em opera��o matematica
	 * 				e/ou for um dado critico p/ consulta
	 * 				 (Ex: CEP nos correrios)
	 * 
	 * B) Alfanumerico (String): naum eh utilizado em opera��es matematicas
	 * 	
	 */

	String nome = ""; //sempre colocar valor ex.: ""
	int idade = 0; //valor numerico
	double altura =0; //numero com ,	
	double peso =0;
	
	nome = JOptionPane.showInputDialog("Digite seu nome"); // usa para palavras
	idade = Integer.parseInt(JOptionPane.showInputDialog("Digite sua idade")); //parse faz uma substitui��o pois essa var eh numero e o show mostra apenas String
	altura = Double.parseDouble(JOptionPane.showInputDialog("Digite sua altura"));
	peso = Double.parseDouble(JOptionPane.showInputDialog("Digite seu peso"));
	
	double imc = peso / (altura * altura);
	
	System.out.println("Nome..:" +nome); // o + concatena palavras na mesma saida
	System.out.println("Idade.:" +idade);
	System.out.println("Idade.:" +altura);
	System.out.println("Peso..:" +peso);
	System.out.println("Seu IMC eh:" +imc);
	
	
	       
	
	}

}
