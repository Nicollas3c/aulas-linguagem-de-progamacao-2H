package Classes;

public class Produto {

    //Atributos
    //Private: Acesso permitido "apenas" dentro da própia classe

    private String nome;
    private double preco;

    //Métodos setter´s e getter´s

    //Métodos "com_sem", ou seja, recebe parâmetros e
    //Não retorna "nada"
    //Exemplo:
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setPreco(double preco) {
        this.preco = preco;
    }

    //Métodos "sem_com", ou seja, não recebe parâmetros e
    //retorna 1 parâmetro
    //Exemplo:

    public String getNome() {
        return this.nome;
    }

    public double getPreco() {
        return this.preco;
    }

}
