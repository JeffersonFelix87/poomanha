import model.Conta;
import model.Corrente;
import model.Poupanca;

import java.util.ArrayList;
import java.util.List;

public class GerenciarConta {

    private List<Conta>listaDeContas = new ArrayList<>();

    public static void main(String[] args) {
        GerenciarConta gc = new GerenciarConta();
        Corrente cc = new Corrente(1, "Maromo", 1000);
        Poupanca poup = new Poupanca(2, "Maromo", 20);
        gc.listaDeContas.add(cc);
        gc.listaDeContas.add(poup);
        cc.depositar(500);
        cc.sacar(1100);
        System.out.println(cc);

        poup.depositar(1000);
        poup.sacar(500);
        System.out.println(poup);

        System.out.println("Patrimonio: " + gc.getPatrimonio());

    }

    public double getPatrimonio(){
        double total = 0;
        for (Conta c : listaDeContas){
            total+= c.getSaldo();
        }
        return total;
    }
}