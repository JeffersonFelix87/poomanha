package model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Baralho {
    List<Carta> cartas = new ArrayList<>();

    //construtor do baralho
    public Baralho(){
        //logica para montar o baralho
        for (Naipe naipe: Naipe.values()) {
           for(Valor valor : Valor.values()){
               Carta carta = new Carta();
               carta.setValor(valor);
               carta.setNaipe(naipe);
               cartas.add(carta);
           }
        }
    }

    public void exibir(){
        for(Carta carta : cartas){
            System.out.println(carta);
        }
    }

    public void embaralhar() {
        Collections.shuffle(cartas);
    }

    public Carta retirarUmCarta() {
        Collections.shuffle(cartas);
        return cartas.remove(0);
    }
}
