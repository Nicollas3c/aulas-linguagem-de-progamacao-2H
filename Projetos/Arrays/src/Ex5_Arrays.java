import javax.swing.*;

public class Ex5_Arrays {
    public static void main(String[] args) {

        int[] num1 = new int[4];
        int[] num2 = new int[6];
        int[] num3 = new int[10];
        int y = 0;

        for (int x = 0; x < num1.length; x++) {
            num1[x] = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite 4 Números"));
        }
        for (int x = 0; x < num2.length; x++) {
            num2[x] = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite 6 Números"));
        }
        for (int x = 0; x < num3.length; x++) {
            if (x < num1.length) {
                num3[x] = num1[x];
            } else {
                num3[x] = num2[y];
                y++;
            }
            System.out.println(num3[x]);
        }
    }
}