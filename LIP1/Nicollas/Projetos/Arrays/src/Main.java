import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        //Variável simples -> Apenas 1 informação por vez
        String fruta = "Maçã";

        //Array do tipo vetor (unidimensional)
        //Apenas uma informação por indice
        String[] frutas = new String[10];

        frutas[0] = "Maçã";
        frutas[1] = "Melância";
        frutas[2] = "Banana";
        frutas[3] = "Manga";
        frutas[4] = "Uva";

        //Exibindo uma fruta solta
        System.out.println(frutas[0]);

        //Exibindo todas as frutas
        //Utilize uma estrutura de repetição
        //lenght -> retorna o total de elementos do array
        for (int x = 0; x < frutas.length; x++){
            JOptionPane.showMessageDialog(null, frutas[x]);
        }

        //Outra forma de declaração de vetores
        int[] num = {1, 2, 3, 4, 5, 6};
        System.out.println(num[4]);

        //Exibindo todos os números usando o laço while
        int x = 0;
        while (x > num.length) {
            x++;
            System.out.println(num[x]);
        }
    }
}