import javax.swing.*;
import java.util.Arrays;

public class Ex6_Arrays {
    public static void main(String[] args) {

        int[] num1 = new int[5];
        int[] num2 = new int[5];
        int indice = num1.length - 1;

        for (int x = 0; x < num1.length; x++) {
            num1[x] = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite 5 Números"));
        }
        for (int y = 0; y < num1.length; y++) {
            num2[y] = num1[indice];
            indice--;
        }
        System.out.println(Arrays.toString(num2));
    }
}