import model.Baralho;
import model.Carta;

public class Main {
    public static void main(String[] args) {
        Baralho baralho = new Baralho();
        baralho.exibir();
        baralho.embaralhar();
        System.out.println();
        baralho.exibir();
        System.out.println();
        Carta carta1, carta2;
        carta1 = baralho.retirarUmCarta();
        carta2 = baralho.retirarUmCarta();
        System.out.println("Carta jogador 1");
        System.out.println(carta1);
        System.out.println("Carta jogador 2");
        System.out.println(carta2);

        if(carta1.getValor().ordinal() > carta2.getValor().ordinal()){
            System.out.println("Jogador 1 venceu");
        } else {
            if (carta2.getValor().ordinal() > carta1.getValor().ordinal()) {
                System.out.println("Jogador 2 venceu");
            }else{
                if(carta1.getNaipe().ordinal() > carta2.getNaipe().ordinal()){
                    System.out.println("Jogador 1 ganhou");
                }else{
                    System.out.println("Jogador 2 ganhou");
                }
            }
        }
    }
}