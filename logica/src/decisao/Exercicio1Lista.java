package decisao;

import javax.swing.JOptionPane;

public class Exercicio1Lista {

	/*
	 * 
	 *Um hotel cobra R$ 80,00 a di�ria e mais uma taxa de servi�os. 
	 *A taxa de servi�os � de: 
	 * R$ 5,50 por di�ria, se o n�mero de di�rias for maior que 15;
	 * R$ 6,00 por di�ria, se o n�mero de di�rias for igual a 15;
	 * R$ 8,00 por di�ria, se o n�mero de di�rias for menor que 15.
	 *Monte uma aplica��o que apresente a conta do cliente.
	*/
	
	public static void main(String[] args) {
		String nome = JOptionPane.showInputDialog("Digite o nome do Cliente").toUpperCase();
		short dias = Short.parseShort(JOptionPane.showInputDialog("Digite qtde de diarias"));
		float serv = 0;
		short dias_tot = 0;
		
		dias_tot = (short) (dias * 80);
		
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
