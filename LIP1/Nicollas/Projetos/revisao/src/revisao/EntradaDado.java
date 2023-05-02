package revisao;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class EntradaDado {
	
	public static void main(String[] args) {
		
		double nota1, nota2, nota3, media;
		
		Scanner tcd = new Scanner(System.in);
		System.out.println("Digite sua Primeira Nota");
		nota1 = tcd.nextDouble();
		System.out.println("Digite sua Segunda Nota");
		nota2 = tcd.nextDouble();
		System.out.println("Digite sua Terceira Nota");
		nota3 = tcd.nextDouble();
		
		media = (nota1 + nota2 + nota3) / 3;
		
		if (media < 5) {
			JOptionPane.showMessageDialog(null, "Aluno(a) Reprovado(a)");
		}
		else if (media >= 5 && media <= 7) {
			JOptionPane.showMessageDialog(null, "Aluno(a) em Recuperação");
		}
		else if (media > 7) {
			JOptionPane.showMessageDialog(null, "Aluno(a) Aprovado(a)");
		}
	}
}