import javax.swing.*;

public class Ex3_Arrays {
    public static void main(String[] args) {

        double[] num1 = new double[10];
        double[] num2 = new double[10];

        for (int x = 0; x < num1.length; x++) {
            num1[x] = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite 10 números"));
            num2[x] = Math.pow(num1[x], 2);
            System.out.println(num2[x]);
        }
    }
}