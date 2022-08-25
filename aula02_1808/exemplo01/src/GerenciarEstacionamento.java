import java.util.ArrayList;
import java.util.List;

public class GerenciarEstacionamento {

    List<Carro> lista = new ArrayList<>();

    public static void main(String[] args) {
        Carro carro1, carro2;
        carro1 = new Carro();

        carro1.setIdCarro(1);
        carro1.setMarca("Fiat");
        carro1.setModelo("Palio");
        carro1.setAnoFab(2011);
        carro1.setValor(5000.0f);

        carro2 = new Carro();
        carro2.setIdCarro(2);
        carro2.setMarca("VW");
        carro2.setModelo("Fu");
        carro2.setAnoFab(1969);
        carro2.setValor(5000.00);
        GerenciarEstacionamento ge = new GerenciarEstacionamento();
        ge.lista.add(carro1);
        ge.lista.add(carro2);
        System.out.println("Total de Carros no Estacionamento");
        System.out.println("Total: " + ge.lista.size());

    }
}
