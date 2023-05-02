import Classes.Data;

public class DataTeste {

    public static void main(String[] args) {

        Data data;

        data = new Data();
        data.dia = 12;
        data.mes = 4;
        data.ano = 2023;

        System.out.println("Data: " + data.dia + "/"
                                    + data.mes + "/"
                                    + data.ano);
    }
}
