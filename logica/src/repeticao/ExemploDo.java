package repeticao;

import javax.swing.JOptionPane;

public class ExemploDo {

	public static void main(String[] args) {
		
		char resposta =0;
		
		do {
		
		int valor1 = Integer.parseInt(JOptionPane.showInputDialog("Insira valor 1"));
					//showInput sempre recebe string o parseInt traduz para podermos usar numero
		int valor2 = Integer.parseInt(JOptionPane.showInputDialog("Insira valor 2"));
		char opcao = JOptionPane.showInputDialog("Digite o operador aritm�tico").charAt(0); 
					// qdo entra, o valor eh recebido pelo pgm com "xxxx"
					// precisamos de um char q dever entrar como 'xxxx'
					// entaum precisa usar o charat no final para receber apenas uma entrada
		
							
		if (opcao=='+') {
			System.out.println("Soma: " +valor1 +opcao +valor2 +" = " + (valor1 + valor2));
		}
		else if (opcao=='-') {
			System.out.println("Subtra��o: " +valor1 +opcao +valor2 +" = " + (valor1 - valor2));
		}
		else if (opcao=='*') {
			System.out.println("Multiplica��o: " +valor1 +opcao +valor2 +" = "+ (valor1 * valor2));
		}
		else if (opcao=='/') {
			System.out.println("Divis�o: " +valor1 +opcao +valor2 +" = "+ (valor1 / valor2));
		}
		else {
			System.out.println("Operador n�o reconhecido! " );
		}
			resposta = JOptionPane.showInputDialog("Digite <S> para continuar").toUpperCase().charAt(0);
		}
		while (resposta=='S');
	
		
	
	}

}
