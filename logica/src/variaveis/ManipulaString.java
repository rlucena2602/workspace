package variaveis;

import javax.swing.JOptionPane;

public class ManipulaString {

	public static void main(String[] args) {
		//String � do tipo Referencia
		
	String email = JOptionPane.showInputDialog("Email");
	System.out.println("Original: " +email);
	System.out.println("Minusculo: " +email.toLowerCase());
	System.out.println("Maiusculo: " +email.toUpperCase());

	System.out.println("Posicao do @: " +email.indexOf("@")); 
		//procura caracter e retorna a posi��o parte do 0
	
	System.out.println("Existe o @ ? " +email.contains("@"));
		//procura caracter e retorno sim ou naum
	
	System.out.println("Qtde de caracteres: " +email.length());
		//conta a qtde de caracteres da entrada parte do 1
	
	System.out.println("Pega do segundo ao quarto caracter: " +email.substring(1,4));
		//primeira coordenada come�a do 0 e a segunda come�a do 1
	
	System.out.println("A partir do segundo caracter: " +email.substring(1));
		//primeira coordenada come�a do 0 
	
	System.out.println("Usuario: " +email.substring(0,email.indexOf("@")));
		//retorna nome do user - pega tudo ateh o @
	
	System.out.println("Servidor: " +email.substring(email.indexOf("@")+1));
		//retorna nome do server - pega tudo ap�s o @
	
	System.out.println("Servidor sem o .com : " +email.substring(email.indexOf("@")+1,email.indexOf(".com")));
		//retorna nome do server exato sem o .com
	
	System.out.println("Primeira metade email: " +email.substring(0,email.length()/2));
		//retorna primeira metade do email
	
	System.out.println("Compara��o COM Case: " +email.equals("rafael@bol.com.br"));
		//verifica se eh exatamente igual e retorna true or false
	
	System.out.println("Compara��o SEM Case: " +email.equalsIgnoreCase("rafael@bol.com.br"));
		//verifica se eh igual e naum importa o Case
  
	                        
	// rafael@bol.com.br
	}

}
