import Classes.Produto;

public class ProdutoTeste {

    public static void main(String[] args) {

        Produto produto;

        //Criando o 1° Objeto

        produto = new Produto();
        produto.setNome("Playstation 5");
        produto.setPreco(5649.99);
        System.out.println("Produto nome: " + produto.getNome());
        System.out.println("Produto preço: " + produto.getPreco());

    }
}
