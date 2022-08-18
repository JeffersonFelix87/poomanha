public class Carro {
    //Definir Atributos
    int idCarro;
    String placa;
    String modelo;
    String marca;
    int anoFab;
    double valor;

    //Definir os métodos
    public void estacionar() {
        //aqui logica do estacionar
    }

    public void acelerar() {

    }

    public void listar() {
        System.out.println("Id. do Carro:    " + idCarro);
        System.out.println("Placa do Carro:  " + placa);
        System.out.println("Modelo do Carro: " + modelo);
        System.out.println("Valor do Carro: " + valor);
    }


}
