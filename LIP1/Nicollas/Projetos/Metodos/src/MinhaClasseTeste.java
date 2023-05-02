import Classes.MinhaClasse;

import javax.swing.*;

public class MinhaClasseTeste {

    public static void main(String[] args) {

        MinhaClasse comida = new MinhaClasse();

        comida.setNumComida(Integer.parseInt(JOptionPane.showInputDialog(null,    "Escolha seu Pedido:" + "\n" +
                                                                                                        "1 - Feijoada (25R$)"  + "\n" +
                                                                                                        "2 - Macarrão (20R$)"  + "\n" +
                                                                                                        "3 - Lasanha (30R$)")));

        if (comida.getNumComida() == 1) {
            comida.setQuantComida(Integer.parseInt(JOptionPane.showInputDialog(null, "Quanto de Feijoada você deseja?")));
            comida.setValComida(25 * comida.getQuantComida());
            System.out.print("Seu pedido é: " + "Feijoada" +
                    "\n" + "Quantidade: " + comida.getQuantComida() +
                    "\n" + "Preço: " + comida.getValComida() + "R$");
        }

        else if (comida.getNumComida() == 2) {
            comida.setQuantComida(Integer.parseInt(JOptionPane.showInputDialog(null, "Quanto de Macarrão você deseja?")));
            comida.setValComida(20 * comida.getQuantComida());
            System.out.print("Seu pedido é: " + "Macarrão" +
                    "\n" + "Quantidade: " + comida.getQuantComida() +
                    "\n" + "Preço: " + comida.getValComida() + "R$");
        }

        else if (comida.getNumComida() == 3) {
            comida.setQuantComida(Integer.parseInt(JOptionPane.showInputDialog(null, "Quanto de Lasanha você deseja?")));
            comida.setValComida(30 * comida.getQuantComida());
            System.out.print("Seu pedido é: " + "Lasanha" +
                    "\n" + "Quantidade: " + comida.getQuantComida() +
                    "\n" + "Preço: " + comida.getValComida() + "R$");
        }

        else {
            JOptionPane.showMessageDialog(null, "Esse prato não está no cardápio!");
        }
    }
}
