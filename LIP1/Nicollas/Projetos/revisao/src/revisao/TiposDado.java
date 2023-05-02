package revisao;

import javax.swing.JOptionPane;

public class TiposDado {
	
	public static void main(String[] args) {
		
		//Declaração de Variáveis
		
		//Numérica
		int numero; 		//Integer ( class )
		double numero1;		//Double ( class )
		float numero2;		//Float ( class )

		//Lógica
		boolean condição;	//Boolean ( class )
		
		//Literal
		String nome;
		char letra;			//Character ( class )
		
		//Atribuindo Valores
		
		//Numérica
		numero = 3;
		numero1 = 1.2;
		numero2 = 1.2f;
		
		//Lógica
		condição = false;
		
		//Literal
		nome = "Oswaldo Orlindo de Oliveiro";
		letra = 'n';
		
		//Mostrando os Dados
		
		System.out.println("Nome: " + nome);
		
		JOptionPane.showMessageDialog(null, nome);
		
	}

}
