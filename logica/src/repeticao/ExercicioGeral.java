package repeticao;

import javax.swing.JOptionPane;

public class ExercicioGeral {

	public static void main(String[] args) {
		/*
		* * Monte uma aplicação que solicite a idade e o nome das pessoas.
		* Ao terminar (o usuário respondeu que não quer continuar),
		* A aplicação deverá exibir:
		*  a pessoa mais velha (nome), (3)
		*  a pessoa mais nova (nome), (4)
		*  a quantidade de pessoas maiores de idade e (1)
		*  a média entre as idades que foram digitadas. (2) 		  
		 */
		
		String nome    = ""; 
		int idade      = 0;
		
		char resposta  = 0;
		
		int qtdeMaiores= 0;
		
		int totalIdades = 0;
		int qtdePessoas = 0;
		
		String nomeJovem = "";
		String nomeExperiente = "";
		int idadeJovem = 0;
		int idadeExperiente = 0;		
		
		do {
			nome=JOptionPane.showInputDialog("Digite o nome").toUpperCase();
			idade=Integer.parseInt(JOptionPane.showInputDialog("Agora, digite a idade"));	
			
			
			if (idade>idadeExperiente) {
				nomeExperiente = nome;
				idadeExperiente = idade;
			}
			
			if (idade<idadeJovem || qtdePessoas==0) {
				nomeJovem = nome;
				idadeJovem = idade;
			}
			
			if (idade>17 ) {
				qtdeMaiores=qtdeMaiores+1;
				
			}
			
			totalIdades = totalIdades+idade;
			qtdePessoas = qtdePessoas+1;
			
			resposta =JOptionPane.showInputDialog("Digite <S> para continuar ").toUpperCase().charAt(0);
			
		}
		while(resposta=='S');
		
		System.out.println("Qtde de pessoas maiores de idade: " + qtdeMaiores);
		System.out.println("Média de idade: " + (totalIdades/qtdePessoas));
		
		System.out.println(nomeExperiente + " é o mais experiente com " + idadeExperiente + " anos");
		System.out.println(nomeJovem + " é o mais jovem com " + idadeJovem + " anos");
		
		
			}
	
}
