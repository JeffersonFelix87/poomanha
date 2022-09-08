import java.util.Scanner;

public class ContaTeste {
    public Conta cc = new Conta();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ContaTeste teste = new ContaTeste();
        int opc = 0;
        do{
            opc = getMenu(sc, teste);
        }while(opc!=9);
    }

    private static int getMenu(Scanner sc, ContaTeste teste) {
        int opc;
        System.out.println("Menu Principal");
        System.out.println("1. Cadastrar");
        System.out.println("2. Sacar");
        System.out.println("3. Depositar");
        System.out.println("4. Consultar");
        System.out.println("9. Sair");
        System.out.println("Digite sua opcao: ");
        opc = Integer.parseInt(sc.nextLine());
        switch (opc){
            case 1:
                teste.execCadastrar(sc);
                break;
            case 2:
                teste.execSacar(sc);
                break;
            case  3:
                teste.execDepositar(sc);
                break;
            case 4:
                teste.execConsultar(sc);
                break;
            case 9:
                System.out.println("FIM");
                break;
            default:
                System.out.println("Opcao invalida");
        }
        return opc;
    }

    public void execCadastrar(Scanner sc){
        System.out.println("Digite o numero da conta");
        cc.setNumConta(sc.nextLine());
        System.out.println("Digite o nome da agencia");
        cc.setAgencia(sc.nextLine());
        System.out.println("Digite o nome do cliente");
        cc.setNomeCliente(sc.nextLine());
        System.out.println("Conta cadastrada com sucesso");
    }

    public void execConsultar(Scanner sc){
        System.out.println(cc.toString());
    }
    public void execSacar(Scanner sc){
        double valor;
        System.out.println("Digite o valor do saque");
        valor = Double.parseDouble(sc.nextLine());
        int ok = cc.sacar(valor);
        if(ok==1){
            System.out.println("Saque efetuado com sucesso");
        }else{
            System.out.println("Sem saldo suficiente");
        }
    }
    public void execDepositar(Scanner sc){
        double valor;
        System.out.println("Digite o valor do deposito");
        valor = Double.parseDouble(sc.nextLine());
        cc.depositar(valor);
        System.out.println("Deposito efetuado com sucesso");
    }
}