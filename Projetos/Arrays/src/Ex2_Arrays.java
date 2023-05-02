import javax.swing.*;

public class Ex2_Arrays {
    public static void main(String[] args) {

        int[] num1 = new int[8];
        int[] num2 = new int[8];

        for (int x = 0; x < num1.length; x++) {
            num1[x] = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite 8 números"));
            num2[x] = num1[x] * 3;
            System.out.println(num2[x]);
        }
    }
}