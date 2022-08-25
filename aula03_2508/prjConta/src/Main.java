public class Main {
    public static void main(String[] args) {
        Conta c1, c2;
        c1 = new Conta();
        c2 = new Conta();

        Conta.cpmf = 0.0010;
        //Conta c1 é do Rodrigo
        c1.setNumero(111);
        c1.setNomeCliente("Rodrigo");
        c1.setSaldo(2000);
        System.out.println("Cpmf que o Rodrigo paga: " + Conta.cpmf);

        //Conta c2 é do Maromo
        c2.setNumero(222);
        c2.setNomeCliente("Maromo");
        c2.setSaldo(-500);
        System.out.println("Cpmf que o Maromo paga: " + Conta.cpmf);



    }
}