import Classes.Data;

public class DataTeste {

    public static void main(String[] args) {

        Data data;

        data = new Data();
        data.setDia(12);
        data.setMes(4);
        data.setAno(2023);

        System.out.println("Data: " + data.getDia() + "/"
                                    + data.getMes() + "/"
                                    + data.getAno());
    }
}
