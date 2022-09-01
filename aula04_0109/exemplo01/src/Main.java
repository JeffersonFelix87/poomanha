import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Produto produto1 = new Produto();
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o codigo do produto: ");
        produto1.setCodigo(Integer.parseInt(sc.nextLine()));
        System.out.println("Digite o nome do produto: ");
        produto1.setNome(sc.nextLine());
        System.out.println("Digite o valor do produto: ");
        produto1.setValor(Double.parseDouble(sc.nextLine()));
        System.out.println("Digite o qtd do produto: ");
        produto1.setQuantidadeEmEstoque(Integer.parseInt(sc.nextLine()));

        //imprimir
        System.out.println(produto1);
    }
}