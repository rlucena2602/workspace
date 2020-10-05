package repeticao;

import javax.swing.JOptionPane;

public class DesafioRepeticao {

	public static void main(String[] args) {
		/*
		 * Jogador 1: Entra com um numero inteiro
		 * Jogador 2: deve descobrir o numero
		 * Exibir o Parabens qdo o J2 descobrir.
		 * 
		 * J2 precisa receber dica enquanto naum acertar - maior ou menor
		 * no final exibir qts tentativas foram necessarias para o j2 acertar		  
		 */
		
		int num2 = 0;
		int qtde_tentativas = 0;
		
		int num1 = Integer.parseInt(JOptionPane.showInputDialog("J1 - Insira o numero a ser descoberto"));
					//showInput sempre recebe string o parseInt traduz para podermos usar numero
		
		do {
			
		num2 = Integer.parseInt(JOptionPane.showInputDialog("J2 - Insira seu palpite"));
					
		if (num2 > num1) {
			System.out.println("Quase, digite um numero menor ");
		}	
		else if (num2 < num1) {
			System.out.println("Quase, digite um numero maior ");
		}	
			qtde_tentativas = qtde_tentativas + 1;
			// Abaixo eh o mesmo comando acima de forma diferente
			// qtde_tentativas++
			// qtde_tentativas+=1
			
		}	
		while (num2 != num1);
	
		System.out.println("Parab�ns, vc acertou o n�mero do J1 que era o " +num1 + " em " +qtde_tentativas + " tentativas");
	}
	
}
