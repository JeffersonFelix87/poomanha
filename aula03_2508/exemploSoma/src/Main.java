import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a, b, c;
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite o valor de A: ");
        a = Integer.parseInt(leitor.nextLine());
        System.out.println("Digite o valor de B: ");
        b = Integer.parseInt(leitor.nextLine());

        c = a + b;
        System.out.println("Resultado: " + c);

    }
}