import javax.swing.*;
import java.util.Arrays;

public class Ex7_Arrays {
    public static void main(String[] args) {

        int[]num1 = new int[10];
        int[]num2 = new int[10];
        int[]num3 = new int[20];

        //Montando o 1° vetor
        int x = 0;
        int cont = 10;
        while (x < num1.length) {
            int valor = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite mais " + cont-- + " Números Múltiplos de 2 e 3"));
            if (valor % 2 == 0 && valor % 3 == 0) {
                num1[x] = valor;
            }
            else {
                JOptionPane.showMessageDialog(null, "Digite Apenas Números Múltiplos de 2 e 3");
                x--;
            }
            x++;
        }

        x = 0;
        cont = 10;
        while (x < num2.length) {
            int valor = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite mais " + cont-- + " Números Múltiplos de 5"));
            if (valor % 5 == 0) {
                num2[x] = valor;
            }
            else {
                JOptionPane.showMessageDialog(null, "Digite Apenas Números Múltiplos de 5");
                x--;
            }
            x++;
        }

        int y = 0;
        for (x = 0; x < num3.length; x++) {
            if (x < num1.length) {
                num3[x] = num1[x];
            }
            else {
                num3[x] = num2[y];
                y++;
            }
        }
        String msgFinal = "Vetor 1: " + Arrays.toString(num1) + "\n" +
                          "Vetor 2: " + Arrays.toString(num2) + "\n" +
                          "Vetor 3: " + Arrays.toString(num3);

        JOptionPane.showMessageDialog(null, msgFinal);
    }
}
