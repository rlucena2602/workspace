package decisao;

import javax.swing.JOptionPane;

public class DecisaoComposta1 {

	// para tabular automatico faz ctrl+a depois ctrl+i
	
	public static void main(String[] args) {
		String nome = JOptionPane.showInputDialog("Digite o nome do aluno").toUpperCase();
		short faltas = Short.parseShort(JOptionPane.showInputDialog("Digite a qtde de faltas"));

		if (faltas > 20) {
			System.out.println("o aluno " +nome +" est� reprovado, m�dia n�o ser� calculada");
		} 

		else {

			float nota1 = Float.parseFloat(JOptionPane.showInputDialog("Digite a nota 1"));
			float nota2 = Float.parseFloat(JOptionPane.showInputDialog("Digite a nota 2"));	

			float media = (nota1 + nota2) /2;
			System.out.println("Aluno: " +nome + " sua m�dia foi: " + media);

			if (media >= 6) {
				System.out.println("Parab�ns " +nome +" voc� est� aprovado");			
			} else if (media <4) {
				System.out.println("Sr. " +nome +" voc� se ferrou e repetiu de ano");
			} else if (media >=4 && media <6) {
				System.out.println("Sr. " +nome +" voc� teve sorte e resta uma chance");
			}

			// and => &&
			// or  => ||

		}
	}
}
