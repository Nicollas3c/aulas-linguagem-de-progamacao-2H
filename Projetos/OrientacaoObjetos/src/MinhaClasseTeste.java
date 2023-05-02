import Classes.MinhaClasse;

import javax.swing.*;

public class MinhaClasseTeste {

    public static void main(String[] args) {

        MinhaClasse comida;

        comida = new MinhaClasse();

        comida.numComida = Integer.parseInt(JOptionPane.showInputDialog(null, "Escolha seu Pedido:" + "\n" +
                                                                                                     "1 - Feijoada (25R$)"  + "\n" +
                                                                                                     "2 - Macarrão (20R$)"  + "\n" +
                                                                                                     "3 - Lasanha (30R$)"));

        if (comida.numComida == 1) {
            comida.quantComida = Integer.parseInt(JOptionPane.showInputDialog(null, "Quanto de Feijoada você deseja?"));
            comida.valComida = 25 * comida.quantComida;
            System.out.print("Seu pedido é: " + "Feijoada" +
                    "\n" + "Quantidade: " + comida.quantComida +
                    "\n" + "Preço: " + comida.valComida + "R$");
        }

        else if (comida.numComida == 2) {
            comida.quantComida = Integer.parseInt(JOptionPane.showInputDialog(null, "Quanto de Macarrão você deseja?"));
            comida.valComida = 20 * comida.quantComida;
            System.out.print("Seu pedido é: " + "Macarrão" +
                    "\n" + "Quantidade: " + comida.quantComida +
                    "\n" + "Preço: " + comida.valComida + "R$");
        }

        else if (comida.numComida == 3) {
            comida.quantComida = Integer.parseInt(JOptionPane.showInputDialog(null, "Quanto de Lasanha você deseja?"));
            comida.valComida = 30 * comida.quantComida;
            System.out.print("Seu pedido é: " + "Lasanha" +
                    "\n" + "Quantidade: " + comida.quantComida +
                    "\n" + "Preço: " + comida.valComida + "R$");
        }

        else {
            JOptionPane.showMessageDialog(null, "Esse prato não está no cardápio!");
        }
    }
}
