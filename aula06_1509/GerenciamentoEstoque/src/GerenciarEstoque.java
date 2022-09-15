import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GerenciarEstoque {
    private List<Produto> produtos = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GerenciarEstoque ge = new GerenciarEstoque();
        int opcao = 0;
        do{
            opcao = getMenuPrincipal(scanner, ge);
        }while(opcao!=9);
    }

    private static int getMenuPrincipal(Scanner scanner, GerenciarEstoque ge) {
        int opcao;
        System.out.println("||  Controle de Estoque ||");
        System.out.println("==========================");
        System.out.println("1. Registrar novo Produto");
        System.out.println("2. Dar Entrada de Produto");
        System.out.println("3. Dar Saida de Produto");
        System.out.println("4. Listar Todos Produtos");
        System.out.println("5. Ver Saldo de Produto");
        System.out.println("6. Apresentar Patrimonio");
        System.out.println("9. Sair");
        System.out.println("Escolha sua opcao: ");
        opcao = Integer.parseInt(scanner.nextLine());
        switch (opcao){
            case 1:
                ge.cadastrarNovoProduto(scanner);
                break;
            case 2:
                ge.entradaDeProduto(scanner);
                break;
            case 3:
                ge.saidaDeProduto(scanner);
                break;
            case 4:
                ge.listarTodosProdutos();
                break;
            case 5:
                ge.exibirSaldoDeProduto(scanner);
                break;
            case 6:
                ge.apresentarPatrimonioInventariado();
                break;
            case 9:
                System.out.println("Fim");
                break;
            default:
                System.out.println("Opcao invalida");
        }
        return opcao;
    }

    public void cadastrarNovoProduto(Scanner scanner){
        Produto produto = new Produto();
        System.out.println("Digite o codigo do produto");
        produto.setIdProd(Integer.parseInt(scanner.nextLine()));
        System.out.println("Digite o nome do produto");
        produto.setNome(scanner.nextLine());
        System.out.println("Digite o valor unitario");
        produto.setValorUnitario(Double.parseDouble(scanner.nextLine()));
        System.out.println("Produto cadastrado com sucesso");
        produtos.add(produto);
    }
    public void entradaDeProduto(Scanner scanner){
        System.out.println("Digite o codigo do produto a dar entrada: ");
        int codigo = Integer.parseInt(scanner.nextLine());
        //varrer a lista a procura do produto
        for(Produto p: produtos){
            if(codigo == p.getIdProd()){
                System.out.println("Digite a quantidade de entrada: ");
                int entrada = Integer.parseInt(scanner.nextLine());
                boolean ok = p.registrarEntrada(entrada);
                if(ok){
                    System.out.println("Entrada efetuada com sucesso");
                }else{

                    System.out.println("Valor invalido para entrada");
                }
                return;
            }
        }
        System.out.println("Produto nao encontrado ");
    }
    public void saidaDeProduto(Scanner scanner){
        System.out.println("Digite o codigo do produto a dar saida: ");
        int codigo = Integer.parseInt(scanner.nextLine());
        //varrer a lista a procura do produto
        for(Produto p: produtos){
            if(codigo == p.getIdProd()){
                System.out.println("Digite a quantidade de saida: ");
                int saida = Integer.parseInt(scanner.nextLine());
                boolean ok = p.registrarSaida(saida);
                if(ok){
                    System.out.println("Saida efetuada com sucesso");
                }else{

                    System.out.println("Quantidade indisponivel");
                }
                return;
            }
        }
        System.out.println("Produto nao encontrado ");
    }
    public void listarTodosProdutos(){
        for(Produto p: produtos){
            System.out.println(p.toString());
        }
    }
    public void exibirSaldoDeProduto(Scanner scanner){
        System.out.println("Digite o codigo do produto a exibir o saldo: ");
        int codigo = Integer.parseInt(scanner.nextLine());
        //varrer a lista para exibir o saldo
        for(Produto p : produtos){
            if(p.getIdProd()==codigo) {
                System.out.println("Saldo do Produto: " + p.getNome() +
                        " = " + p.getQuantidade());
                return;
            }
        }
        System.out.println("Produto nao encontrado");
    }
    public void apresentarPatrimonioInventariado(){
        double total = 0.0;
        for (Produto p : produtos){
            total+= p.getQuantidade() * p.getValorUnitario();
        }
        System.out.printf("Total Patrimonio R$ %.2f \n", total);
    }
}