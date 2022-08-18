import java.util.ArrayList;
import java.util.List;

public class GerenciarEstacionamento {

    List<Carro> lista = new ArrayList<>();

    public static void main(String[] args) {
        Carro carro1, carro2;
        carro1 = new Carro();
        carro1.idCarro = 1;
        carro1.marca = "Fiat";
        carro1.modelo = "Palio";
        carro1.anoFab = 2011;
        carro1.valor = 10000.00;

        carro2 = new Carro();
        carro2.idCarro = 2;
        carro2.marca = "VW";
        carro2.modelo = "Fusca";
        carro2.anoFab = 1969;
        carro2.valor = 5000.00;
        GerenciarEstacionamento ge = new GerenciarEstacionamento();
        ge.lista.add(carro1);
        ge.lista.add(carro2);
        System.out.println("Total de Carros no Estacionamento");
        System.out.println("Total: " + ge.lista.size());

    }
}
