package decisao;

import javax.swing.JOptionPane;

public class DesafioDecisaoSimples {

	public static void main(String[] args) {
		String nome = JOptionPane.showInputDialog("Digite o nome do eleitor").toUpperCase();
		short idade   = Short.parseShort(JOptionPane.showInputDialog("Digite a idade do eleitor"));
		
		if (idade >= 18 && idade <= 70) {
			System.out.println("O Sr. " +nome +" é obrigado a votar");			
			// escreve sysout q aparece o comando acima completo
		}
		
		if (idade >15 && idade <18 || idade > 70) {
			// pode ser: idade==16 || idade ==17 ( o == indica comparacao)
			System.out.println("O voto do Sr. " +nome +" é facultativo");
		}		
		
		if (idade < 16) {
			System.out.println("O Sr. " +nome + " ainda não pode votar");
		}
	
	}

}
