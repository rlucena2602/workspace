package decisao;

import javax.swing.JOptionPane;

public class Exercicio2Lista {

	/*
       Elabore uma aplica��o que leia o valor de dois n�meros inteiros e a opera��o aritm�tica desejada; 
       calcule, ent�o, a resposta adequada. Utilize os s�mbolos da tabela a seguir para ler qual a opera��o 
       aritm�tica escolhida.    
	*/
	
	public static void main(String[] args) {
		String nome = JOptionPane.showInputDialog("Digite o nome do Cliente").toUpperCase();
		float dias = Float.parseFloat(JOptionPane.showInputDialog("Digite qtde de diarias"));
		float serv = 0;
		float dias_tot = 0;
		
		dias_tot = (dias * (float) 80);
		
		if (dias < 15) {
			serv = (dias * (float) 8);
		} 
		else if (dias > 15) {
			serv = (dias * (float) 5.5);
		} 
		else {
			serv = (dias * (float) 6);
		}
		
		System.out.println("O valor da conta do cliente " +nome +" eh: R$ " +(dias_tot + serv)); 
		
		
			}
}
