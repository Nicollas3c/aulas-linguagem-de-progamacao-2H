import javax.swing.*;

public class Ex4_Arrays {
    public static void main(String[] args) {

        int[] num1 = new int[15];
        int[] num2 = new int[15];
        int[] num3 = new int[30];

        for (int x = 0; x < num1.length; x++) {
            num1[x] = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite 15 Números"));
            num3[x] = num1[x];
    }
        for (int x = 0; x < num2.length; x++) {
            num2[x] = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite 15 Números"));
            num3[x + 15] = num2[x];
        }
        for (int x = 0; x < num3.length; x++) {
            System.out.println(num3[x]);
        }
    }
}